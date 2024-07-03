package com.example.astrologyforecasts.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.astrologyforecasts.ProfileViewModel
import com.example.astrologyforecasts.R

class HomeFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        profileViewModel = ViewModelProvider(requireActivity()).get(ProfileViewModel::class.java)

        val textViewWeather: TextView = root.findViewById(R.id.textViewWeather)
        val newsContainer: LinearLayout = root.findViewById(R.id.newsContainer)

        profileViewModel.userData.observe(viewLifecycleOwner, { user ->
            user?.let {
                val weatherInfo = "${it.region}: 21°C, солнечно, Растущая луна" // Здесь нужно заменить на реальные данные
                textViewWeather.text = weatherInfo
            }
        })

        profileViewModel.news1.observe(viewLifecycleOwner, { news1 ->
            news1?.let {
                val newsTextView = TextView(context)
                newsTextView.text = it
                newsTextView.textSize = 16f
                newsTextView.setPadding(0, 8, 0, 8)
                newsContainer.addView(newsTextView)
            }
        })

        profileViewModel.news2.observe(viewLifecycleOwner, { news2 ->
            news2?.let {
                val newsTextView = TextView(context)
                newsTextView.text = it
                newsTextView.textSize = 16f
                newsTextView.setPadding(0, 8, 0, 8)
                newsContainer.addView(newsTextView)
            }
        })

        profileViewModel.news3.observe(viewLifecycleOwner, { news3 ->
            news3?.let {
                val newsTextView = TextView(context)
                newsTextView.text = it
                newsTextView.textSize = 16f
                newsTextView.setPadding(0, 8, 0, 8)
                newsContainer.addView(newsTextView)
            }
        })

        return root
    }
}
