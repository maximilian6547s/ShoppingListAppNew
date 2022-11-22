package com.example.shoppinglistapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shoppinglistapp.data.models.ShopItemDbModel

@Dao
interface ShopListDao {

    @Query("SELECT * FROM shop_items")
    fun getShopList():LiveData<List<ShopItemDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHopItem(shopItemDbModel: ShopItemDbModel)

    @Query("DELETE from shop_items WHERE id=:shopItemId")
    suspend fun deleteShopItem(shopItemId: Int)

    @Query("SELECT * FROM shop_items WHERE id=:shopItemId LIMIT 1")
    suspend fun getShopItem(shopItemId: Int):ShopItemDbModel
}