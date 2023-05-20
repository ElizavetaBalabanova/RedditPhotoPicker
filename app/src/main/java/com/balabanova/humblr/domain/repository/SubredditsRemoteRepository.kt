package com.balabanova.humblr.domain.repository

import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.tools.ListTypes
import com.balabanova.humblr.domain.models.Subreddit

interface SubredditsRemoteRepository {

    suspend fun getList(type: ListTypes, source: String?, page: String): List<ListItem>

    suspend fun subscribeOnSubreddit(action: String, name: String)

    suspend fun votePost(dir: Int, postName: String)

    suspend fun savePost(postName: String)

    suspend fun unsavePost(postName: String)

    suspend fun getSubredditInfo(name: String): Subreddit

    suspend fun getSinglePost(url: String): List<ListItem>

    suspend fun unsaveAllSavedPosts()
}
