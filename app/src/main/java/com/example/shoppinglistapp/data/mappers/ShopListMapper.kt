package com.example.shoppinglistapp.data.mappers

import com.example.shoppinglistapp.data.models.ShopItemDbModel
import com.example.shoppinglistapp.domain.models.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel(shopItem: ShopItem): ShopItemDbModel = ShopItemDbModel(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled,
    )

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel): ShopItem = ShopItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled,
    )

    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>): List<ShopItem> = list.map {
        mapDbModelToEntity(it)
    }

    fun mapListEntityToListDbModel(list: List<ShopItem>): List<ShopItemDbModel> = list.map {
        mapEntityToDbModel(it)
    }
}