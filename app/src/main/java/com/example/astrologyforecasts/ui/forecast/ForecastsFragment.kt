package com.example.astrologyforecasts.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.astrologyforecasts.R

class ForecastsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_forecasts, container, false)

        val generateButton: Button = root.findViewById(R.id.button_generate_forecast)
        generateButton.setOnClickListener {
            findNavController().navigate(R.id.action_forecasts_to_generatedForecast)
        }

        return root
    }
}
