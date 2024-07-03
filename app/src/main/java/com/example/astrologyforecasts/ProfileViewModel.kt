package com.example.astrologyforecasts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _userData = MutableLiveData<User>()
    val userData: LiveData<User> get() = _userData

    private val _news1 = MutableLiveData<String>()
    val news1: LiveData<String> get() = _news1

    private val _news2 = MutableLiveData<String>()
    val news2: LiveData<String> get() = _news2

    private val _news3 = MutableLiveData<String>()
    val news3: LiveData<String> get() = _news3

    fun setUser(user: User) {
        _userData.value = user
    }

    fun updateProfile(username: String, zodiacSign: String, gender: String, age: Int, region: String) {
        val updatedUser = User(username, zodiacSign, gender, age.toString(), region)
        _userData.value = updatedUser

        // Обновление новостей на основе региона
        _news1.value = "Новость 1 в регионе $region: Что такое ретроградный Меркурий и как он влияет на человека. Ссылка: https://shorturl.at/f0yz1"
        _news2.value = "Новость 2 в регионе $region: Финансовый гороскоп на 2024 год. Ссылка: https://shorturl.at/Ty9sg"
        _news3.value = "Новость 3 в регионе $region: Астрологи назвали самый идеальный период для рынка недвижимости в 2024 году. Ссылка: https://shorturl.at/crE0u"
    }
}
