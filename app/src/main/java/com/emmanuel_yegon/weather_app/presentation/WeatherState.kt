package com.emmanuel_yegon.weather_app.presentation

import com.emmanuel_yegon.weather_app.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

