package com.example.astrologyforecasts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.astrologyforecasts.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Переход на экран авторизации при нажатии кнопки регистрации
        binding.registerButton.setOnClickListener {
            // Показать Toast при успешной регистрации
            Toast.makeText(this, "Регистрация успешна", Toast.LENGTH_SHORT).show()

            // Переход на экран авторизации
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
