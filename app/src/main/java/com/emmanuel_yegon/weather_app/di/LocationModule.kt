package com.emmanuel_yegon.weather_app.di

import com.emmanuel_yegon.weather_app.data.location.DefaultLocationTracker
import com.emmanuel_yegon.weather_app.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker:  DefaultLocationTracker): LocationTracker

}