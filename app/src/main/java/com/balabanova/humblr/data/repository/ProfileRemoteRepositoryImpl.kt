package com.balabanova.humblr.data.repository

import com.balabanova.humblr.data.api.ApiProfile
import com.balabanova.humblr.data.api.dto.postDto.PostDto
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.models.Friends
import com.balabanova.humblr.domain.models.Profile
import com.balabanova.humblr.domain.repository.ProfileRemoteRepository
import com.balabanova.humblr.domain.tools.toFriends
import com.balabanova.humblr.domain.tools.toPost
import com.balabanova.humblr.domain.tools.toProfile
import javax.inject.Inject

class ProfileRemoteRepositoryImpl @Inject constructor(private val apiProfile: ApiProfile):
    ProfileRemoteRepository {

    override suspend fun getLoggedUserProfile(): Profile = apiProfile.getLoggedUserProfile().toProfile()

    override suspend fun getFriends(): Friends = apiProfile.getFriends().data.toFriends()

    override suspend fun getAnotherUserProfile(username: String): Profile = apiProfile.getAnotherUserProfile(username).data.toProfile()

    override suspend fun makeFriends(username: String) = apiProfile.makeFriends(username)

    /** no comments in tech.reqs, but can add later, after comments view implementation*/
    override suspend fun getUserContent(username: String): List<ListItem> {
        val list = mutableListOf<ListItem>()
        apiProfile.getUserContent(username).data.children.forEach { child ->
            if (child is PostDto) list.add(child.toPost())
            //else if (child is CommentDto) list.add(child.toComment())
        }
        return list.toList()
    }
}
