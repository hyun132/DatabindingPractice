package com.example.databindingpractice.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDao {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber):Long

    @Update
    suspend fun updateSubscriver(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriver(subscriber: Subscriber)

    @Query("DELETE from subscriber_data_table")
    suspend fun deleteAll()

    @Query("Select * from subscriber_data_table")
    fun getAllSubscribers():LiveData<List<Subscriber>> // 얘는 백그라운드 코루틴에서 작업할 필요 없음. 왜?
}