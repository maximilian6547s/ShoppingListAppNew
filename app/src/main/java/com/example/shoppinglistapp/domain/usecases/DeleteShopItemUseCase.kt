package com.example.shoppinglistapp.domain.usecases

import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}