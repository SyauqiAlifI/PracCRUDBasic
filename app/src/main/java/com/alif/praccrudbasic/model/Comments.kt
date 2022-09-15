package com.alif.praccrudbasic.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_comments")
data class Comments(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "commentsId")
    var id: Long,

    @ColumnInfo(name = "username")
    var username: String,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "comment")
    var comment: String
)
