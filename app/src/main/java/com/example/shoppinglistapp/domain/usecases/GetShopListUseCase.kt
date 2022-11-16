package com.example.shoppinglistapp.domain.usecases

import androidx.lifecycle.LiveData
import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList():LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}