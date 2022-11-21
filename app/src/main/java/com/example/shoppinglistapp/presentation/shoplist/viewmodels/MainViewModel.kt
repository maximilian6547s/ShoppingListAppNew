package com.example.shoppinglistapp.presentation.shoplist.viewmodels

import androidx.lifecycle.ViewModel
import com.example.shoppinglistapp.data.repositoryimpl.ShopListRepositoryImpl
import com.example.shoppinglistapp.domain.models.ShopItem
import com.example.shoppinglistapp.domain.usecases.DeleteShopItemUseCase
import com.example.shoppinglistapp.domain.usecases.EditShopItemUseCase
import com.example.shoppinglistapp.domain.usecases.GetShopListUseCase

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)

    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}