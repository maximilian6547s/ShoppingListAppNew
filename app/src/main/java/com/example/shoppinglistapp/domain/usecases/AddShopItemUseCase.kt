package com.example.shoppinglistapp.domain.usecases

import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}