package com.umut.soysal.mobile.moviebox.core

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MovieBoxApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}