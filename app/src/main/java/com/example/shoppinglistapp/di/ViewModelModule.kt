package com.example.shoppinglistapp.di

import androidx.lifecycle.ViewModel
import com.example.shoppinglistapp.presentation.shopdetails.viewmodels.ShopItemViewModel
import com.example.shoppinglistapp.presentation.shoplist.viewmodels.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ShopItemViewModel::class)
    fun bindShopItemViewModel(viewModel: ShopItemViewModel): ViewModel


}