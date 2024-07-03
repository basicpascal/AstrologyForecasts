package com.example.astrologyforecasts.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.astrologyforecasts.R
import android.widget.TextView

class GeneratedForecastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_generated_forecast, container, false)

        // Установите текст прогноза
        val forecastTextView: TextView = root.findViewById(R.id.textViewForecast)
        forecastTextView.text = "Сегодня звезды гороскопа целиком и полностью на стороне Овна! Фортуна повернется к нему своим улыбчивым лицом, так что Овну стоит приготовиться к приятным сюрпризам. Возможно, Овну повезет в любви или он получит деньги, на которые не рассчитывал, а может быть, его порадуют какие-то хорошие новости. Если же Овен собирается осуществить план, требующий доли везения, то лучшего дня, чем сегодня, ему для этого не найти."

        return root
    }
}
