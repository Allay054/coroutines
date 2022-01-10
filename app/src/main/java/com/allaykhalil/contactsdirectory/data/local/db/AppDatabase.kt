package com.allaykhalil.contactsdirectory.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.allaykhalil.contactsdirectory.data.local.db.dao.ContactsDao
import com.allaykhalil.contactsdirectory.models.ContactsModel

@Database(entities = [ContactsModel::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactsDao(): ContactsDao
}