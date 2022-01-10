package com.allaykhalil.contactsdirectory.data.local.db.converters

import androidx.room.TypeConverter
import com.allaykhalil.contactsdirectory.models.Phone
import com.google.gson.Gson

class PhoneTypeConverter {

    companion object {
        @TypeConverter
        @JvmStatic
        fun toMedia(value: String?): Phone? {
            return value?.let { Gson().fromJson(it, Phone::class.java) }
        }

        @TypeConverter
        @JvmStatic
        fun toString(data: Phone?): String? {
            return data?.let { Gson().toJson(it) }
        }
    }
}