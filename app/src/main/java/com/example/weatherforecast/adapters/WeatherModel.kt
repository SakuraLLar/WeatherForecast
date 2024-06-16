package com.example.weatherforecast.adapters

data class WeatherModel(
    val city: String,
    val time: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val maxTempt: String,
    val minTemp: String,
    val hours: String
)
