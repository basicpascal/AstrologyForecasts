package com.example.astrologyforecasts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    private lateinit var loginButton: Button
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.button_login)

        loginButton.setOnClickListener {
            // Переход на главный экран (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Закрываем текущую активити, чтобы пользователь не мог вернуться на экран авторизации
        }

        registerButton = findViewById(R.id.button_register)

        registerButton.setOnClickListener {
            // Переход на главный экран (MainActivity)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish() // Закрываем текущую активити, чтобы пользователь не мог вернуться на экран авторизации
        }

    }
}
