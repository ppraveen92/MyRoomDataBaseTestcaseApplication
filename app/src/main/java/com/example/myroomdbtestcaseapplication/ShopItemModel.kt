package com.example.myroomdbtestcaseapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
* Data Class with table fields and table name
* */
@Entity(tableName = "shopping_items")
data class ShopItemModel(
    var name: String,
    var amount: Int,
    var price: Float,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)