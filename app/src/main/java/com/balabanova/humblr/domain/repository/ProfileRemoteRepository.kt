package com.balabanova.humblr.domain.repository

import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.models.Friends
import com.balabanova.humblr.domain.models.Profile

interface ProfileRemoteRepository {

    suspend fun getLoggedUserProfile(): Profile

    suspend fun getFriends(): Friends

    suspend fun getAnotherUserProfile(username: String): Profile

    suspend fun makeFriends(username: String)

    suspend fun getUserContent(username: String): List<ListItem>
}
