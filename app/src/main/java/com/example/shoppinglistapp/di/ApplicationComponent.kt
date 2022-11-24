package com.example.shoppinglistapp.di

import android.app.Application
import com.example.shoppinglistapp.presentation.shopdetails.fragments.ShopItemFragment
import com.example.shoppinglistapp.presentation.shoplist.activities.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: ShopItemFragment)


    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}