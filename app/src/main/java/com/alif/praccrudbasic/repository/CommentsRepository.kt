package com.alif.praccrudbasic.repository

import com.alif.praccrudbasic.db.CommentsDAO
import com.alif.praccrudbasic.model.Comments

class CommentsRepository(private val dao: CommentsDAO) {
    val comments = dao.getAllComments()

    suspend fun insert(comments: Comments) {
        dao.insertComments(comments)
    }

    suspend fun update(comments: Comments) {
        dao.updateComments(comments)
    }

    suspend fun delete(comments: Comments) {
        dao.deleteComments(comments)
    }

    suspend fun deleteAll() {
        dao.deleteAllComments()
    }
}