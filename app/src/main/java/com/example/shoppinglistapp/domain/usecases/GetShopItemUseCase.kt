package com.example.shoppinglistapp.domain.usecases

import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}