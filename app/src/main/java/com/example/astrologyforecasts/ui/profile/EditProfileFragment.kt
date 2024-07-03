package com.example.astrologyforecasts.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.astrologyforecasts.ProfileViewModel
import com.example.astrologyforecasts.R

class EditProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel
    private lateinit var saveButton: Button
    private lateinit var editTextUsername: EditText
    private lateinit var editTextZodiacSign: EditText
    private lateinit var editTextGender: EditText
    private lateinit var editTextAge: EditText
    private lateinit var editTextRegion: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_edit_profile, container, false)

        profileViewModel = ViewModelProvider(requireActivity()).get(ProfileViewModel::class.java)

        saveButton = root.findViewById(R.id.saveButton)
        editTextUsername = root.findViewById(R.id.editTextUsername)
        editTextZodiacSign = root.findViewById(R.id.editTextZodiacSign)
        editTextGender = root.findViewById(R.id.editTextGender)
        editTextAge = root.findViewById(R.id.editTextAge)
        editTextRegion = root.findViewById(R.id.editTextRegion)

        profileViewModel.userData.observe(viewLifecycleOwner, { user ->
            user?.let {
                editTextUsername.setText(it.username)
                editTextZodiacSign.setText(it.zodiacSign)
                editTextGender.setText(it.gender)
                editTextAge.setText(it.age.toString())
                editTextRegion.setText(it.region)
            }
        })

        saveButton.setOnClickListener {
            val username = editTextUsername.text.toString()
            val zodiacSign = editTextZodiacSign.text.toString()
            val gender = editTextGender.text.toString()
            val age = editTextAge.text.toString().toInt()
            val region = editTextRegion.text.toString()

            profileViewModel.updateProfile(username, zodiacSign, gender, age, region)

            Toast.makeText(requireContext(), "Изменения сохранены", Toast.LENGTH_SHORT).show()

            findNavController().popBackStack()
        }

        return root
    }
}
