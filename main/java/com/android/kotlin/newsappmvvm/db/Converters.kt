package com.android.kotlin.newsappmvvm.db

import androidx.room.TypeConverter
import com.android.kotlin.newsappmvvm.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}