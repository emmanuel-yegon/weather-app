package com.emmanuel_yegon.weather_app.domain.repository

import com.emmanuel_yegon.weather_app.domain.util.Resource
import com.emmanuel_yegon.weather_app.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}

