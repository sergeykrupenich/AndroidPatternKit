package com.siarheikrupenich.data.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.siarheikrupenich.testrepo.dao.entity.LicenseEntity
import com.siarheikrupenich.testrepo.dao.entity.OwnerEntity
import com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity
import com.siarheikrupenich.testrepo.dao.entity.RepoEntity
import com.siarheikrupenich.testrepo.dao.entity.dbconverter.DbListConverter

@Database(
    entities = [RepoEntity::class, OwnerEntity::class, LicenseEntity::class, PermissionsEntity::class],
    version = 15
)
@TypeConverters(DbListConverter::class)
abstract class ReposDatabase: RoomDatabase()  {
    abstract fun reposDao(): ReposDao

    companion object {
        private const val REPOS_APP_DB = "repos_app_database"

        @Volatile
        private var INSTANCE: ReposDatabase? = null

        fun getInstance(context: Context): ReposDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ReposDatabase::class.java,
                    REPOS_APP_DB
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
