package com.example.shoppinglistapp.presentation

import android.app.Application
import com.example.shoppinglistapp.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}