package com.siarheikrupenich.testrepo.dao.entity.dbconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DbListConverter {
    @TypeConverter
    fun fromList(topics: List<String>?): String {
        return Gson().toJson(topics)
    }

    @TypeConverter
    fun toList(topicsString: String?): List<String> {
        return if (topicsString.isNullOrEmpty()) {
            emptyList()
        } else {
            val listType = object : TypeToken<List<String>>() {}.type
            Gson().fromJson(topicsString, listType)
        }
    }
}
