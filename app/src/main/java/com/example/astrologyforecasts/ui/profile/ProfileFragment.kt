package com.example.astrologyforecasts.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.astrologyforecasts.ProfileViewModel
import com.example.astrologyforecasts.R

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel = ViewModelProvider(requireActivity()).get(ProfileViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        val textViewUsername: TextView = root.findViewById(R.id.textViewUsername)
        val textViewZodiacSign: TextView = root.findViewById(R.id.textViewZodiacSign)
        val textViewGender: TextView = root.findViewById(R.id.textViewGender)
        val textViewAge: TextView = root.findViewById(R.id.textViewAge)
        val textViewRegion: TextView = root.findViewById(R.id.textViewRegion)
        val editButton: Button = root.findViewById(R.id.editButton)

        profileViewModel.userData.observe(viewLifecycleOwner, { user ->
            user?.let {
                textViewUsername.text = it.username
                textViewZodiacSign.text = it.zodiacSign
                textViewGender.text = it.gender
                textViewAge.text = it.age.toString()
                textViewRegion.text = it.region
            }
        })

        editButton.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_editProfile)
        }

        return root
    }
}
