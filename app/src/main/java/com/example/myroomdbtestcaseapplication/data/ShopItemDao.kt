package com.example.myroomdbtestcaseapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myroomdbtestcaseapplication.ShopItemModel

@Dao
interface ShopItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertShoppingItem(shoppingItem: ShopItemModel)

    @Delete
    suspend fun deleteShoppingItem(shoppingItem: ShopItemModel)

    @Query("SELECT * FROM shopping_items")
    fun observeAllShoppingItems(): LiveData<List<ShopItemModel>>

    @Query("SELECT SUM(price * amount) FROM shopping_items")
    fun observeTotalPrice(): LiveData<Float>
}