package com.example.shoppinglistapp.domain.models

data class ShopItem(
    val id:Int,
    val name:String,
    val count:Int,
    val enabled:Boolean
)