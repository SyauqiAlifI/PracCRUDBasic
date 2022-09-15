package com.alif.praccrudbasic.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.alif.praccrudbasic.model.Comments

@Database(entities = [Comments::class], version = 1)
abstract class CommentsDB: RoomDatabase() {
    abstract val commentsDao: CommentsDAO

    companion object {
        @Volatile
        private var INSTANCE: CommentsDB? = null

        fun getInstance(context: Context): CommentsDB {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CommentsDB::class.java,
                        "tb_comments.db"
                    ).build()
                }
                return instance
            }
        }

    }

}