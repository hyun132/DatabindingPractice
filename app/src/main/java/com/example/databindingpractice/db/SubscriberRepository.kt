package com.example.databindingpractice.db

class SubscriberRepository (private val dao:SubscriberDao){
    val subscribers = dao.getAllSubscribers()

    suspend fun insert(subscriber: Subscriber):Long{
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber){
        dao.updateSubscriver(subscriber)
    }

    suspend fun delete(subscriber: Subscriber){
        dao.deleteSubscriver(subscriber)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}