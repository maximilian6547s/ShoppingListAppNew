package com.example.shoppinglistapp.di

import android.app.Application
import com.example.shoppinglistapp.data.db.AppDataBase
import com.example.shoppinglistapp.data.db.ShopListDao
import com.example.shoppinglistapp.data.repositoryimpl.ShopListRepositoryImpl
import com.example.shoppinglistapp.domain.repository.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDataBase.getInstance(application).shopListDao()
        }

    }
}