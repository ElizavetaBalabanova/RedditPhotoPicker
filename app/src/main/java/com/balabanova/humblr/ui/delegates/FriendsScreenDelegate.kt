package com.balabanova.humblr.ui.delegates

import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.balabanova.humblr.databinding.ItemFriendsBinding
import com.balabanova.humblr.domain.models.Friend
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.tools.loadImage

fun friendsDelegate() = adapterDelegateViewBinding<Friend, ListItem, ItemFriendsBinding>(
    { inflater, root -> ItemFriendsBinding.inflate(inflater, root, false) }
) {
    bind {
        binding.name = item.name
        binding.id = item.id
        binding.friendPhoto.loadImage(item.avatar_url)
        binding.executePendingBindings()
    }
}
