package com.example.astrologyforecasts

data class User(
    val username: String,
    val zodiacSign: String,
    val gender: String,
    val age: String,
    val region: String
) {
    val news3: String
        get() {
            TODO()
        }
    val news2: String
        get() {
            TODO()
        }
    val news1: String
        get() {
            TODO()
        }
}
