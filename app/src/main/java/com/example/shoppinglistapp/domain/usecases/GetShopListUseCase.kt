package com.example.shoppinglistapp.domain.usecases

import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList():List<ShopItem> {
        return shopListRepository.getShopList()
    }
}