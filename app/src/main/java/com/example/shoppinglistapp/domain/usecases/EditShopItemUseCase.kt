package com.example.shoppinglistapp.domain.usecases

import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}