package com.example.shoppinglistapp.domain.repository

import com.example.shoppinglistapp.domain.models.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList():List<ShopItem>
}