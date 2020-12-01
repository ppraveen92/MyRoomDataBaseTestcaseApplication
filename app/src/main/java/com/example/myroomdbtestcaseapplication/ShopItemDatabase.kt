package com.example.myroomdbtestcaseapplication

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myroomdbtestcaseapplication.data.ShopItemDao

@Database(
    entities = [ShopItemModel::class],
    version = 1
)
abstract class ShopItemDatabase : RoomDatabase(){

abstract fun shoppingDao(): ShopItemDao
}