package com.emmanuel_yegon.weather_app.data.repository

import com.emmanuel_yegon.weather_app.data.mappers.toWeatherInfo
import com.emmanuel_yegon.weather_app.data.remote.WeatherApi
import com.emmanuel_yegon.weather_app.domain.repository.WeatherRepository
import com.emmanuel_yegon.weather_app.domain.util.Resource
import com.emmanuel_yegon.weather_app.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository{

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat=lat,
                    long=long
                ).toWeatherInfo()
            )
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}