package com.alif.praccrudbasic.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.alif.praccrudbasic.model.Comments

@Dao
interface CommentsDAO {
    @Insert
    suspend fun insertComments(comments: Comments): Long

    @Update
    suspend fun updateComments(comments: Comments)

    @Delete
    suspend fun deleteComments(comments: Comments)

    @Query("DELETE FROM tb_comments")
    suspend fun deleteAllComments()

    @Query("SELECT * FROM tb_comments")
    fun getAllComments(): LiveData<List<Comments>>
}