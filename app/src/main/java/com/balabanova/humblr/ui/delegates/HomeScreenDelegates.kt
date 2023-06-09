package com.balabanova.humblr.ui.delegates

import android.view.View
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.balabanova.humblr.R
import com.balabanova.humblr.databinding.ItemPostImageBinding
import com.balabanova.humblr.databinding.ItemSubredditBinding
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.models.Post
import com.balabanova.humblr.domain.models.Subreddit
import com.balabanova.humblr.domain.tools.ClickableView
import com.balabanova.humblr.domain.tools.SUBSCRIBE
import com.balabanova.humblr.domain.tools.SubQuery
import com.balabanova.humblr.domain.tools.UNSUBSCRIBE
import com.balabanova.humblr.tools.loadCircleImage
import com.balabanova.humblr.tools.loadImage

fun subredditsDelegate(
    onClick: (subQuery: SubQuery, item: ListItem, clickableView: ClickableView) -> Unit,
) = adapterDelegateViewBinding<Subreddit, ListItem, ItemSubredditBinding>(
    { inflater, root -> ItemSubredditBinding.inflate(inflater, root, false) }
) {
    bind {
        binding.subredditTitle.text = item.namePrefixed
        binding.subredditDescription.text = item.description
        binding.subscribeButton.isSelected = item.isUserSubscriber == true
        if (item.imageUrl != null) binding.subredditImage.loadCircleImage(item.imageUrl!!)
    }
    binding.subscribeButton.setOnClickListener {
        binding.subscribeButton.isSelected = !binding.subscribeButton.isSelected
        val action = if (!binding.subscribeButton.isSelected) UNSUBSCRIBE else SUBSCRIBE
        onClick(SubQuery(name = item.name, action = action), item, ClickableView.SUBSCRIBE)
    }

    binding.fullSubredditCard.setOnClickListener {
        onClick(SubQuery(id = item.id), item, ClickableView.SUBREDDIT)
    }
}

fun postsDelegate(
    onClick: (subQuery: SubQuery, item: ListItem, clickableView: ClickableView) -> Unit,
) = adapterDelegateViewBinding<Post, ListItem, ItemPostImageBinding>(
    { inflater, root -> ItemPostImageBinding.inflate(inflater, root, false) }
) {
    bind {
        showScore(item.score)
        binding.postTitle.text = item.title
        binding.subredditName.text = item.subredditNamePrefixed
        binding.userName.text = context.getString(R.string.author, item.author)
        if (item.postHint == "image") {
            binding.postBodyImage.apply {
                loadImage(item.url)
                visibility = View.VISIBLE
            }
        } else binding.postBodyImage.visibility = View.GONE

        binding.downloadButton.setOnClickListener {
            if (!binding.downloadButton.isSelected) {
                binding.downloadButton.isSelected = true
                Snackbar.make(binding.root, getString(R.string.downloaded), LENGTH_SHORT).show()
            } else Snackbar.make(binding.root, getString(R.string.already_downloaded), LENGTH_SHORT)
                .show()
        }

        binding.upVoteButton.isSelected = item.likedByUser == true

        binding.upVoteButton.setOnClickListener {
            if (!binding.upVoteButton.isSelected) {
                onClick(SubQuery(voteDirection = 1, name = item.name), item, ClickableView.VOTE)
                showScore(item.score + 1)
            } else {
                onClick(SubQuery(voteDirection = 0, name = item.name), item, ClickableView.VOTE)
                showScore(item.score)
            }
            binding.upVoteButton.isSelected = !binding.upVoteButton.isSelected
            binding.downVoteButton.isSelected = false
        }

        binding.downVoteButton.isSelected = item.likedByUser == false
        binding.downVoteButton.setOnClickListener {
            if (!binding.downVoteButton.isSelected) {
                onClick(SubQuery(voteDirection = -1, name = item.name), item, ClickableView.VOTE)
                showScore(item.score - 1)
            } else {
                onClick(SubQuery(voteDirection = 0, name = item.name), item, ClickableView.VOTE)
                showScore(item.score)
            }
            binding.downVoteButton.isSelected = !binding.downVoteButton.isSelected
            binding.upVoteButton.isSelected = false
        }

        binding.saveButton.isSelected = item.saved == true
        binding.saveButton.setOnClickListener {
            if (binding.saveButton.isSelected) {
                Snackbar.make(binding.root, getString(R.string.unsaved), LENGTH_SHORT).show()
                onClick(SubQuery(name = item.name), item, ClickableView.UNSAVE)
            } else {
                Snackbar.make(binding.root, getString(R.string.saved), LENGTH_SHORT)
                    .show()
                onClick(SubQuery(name = item.name), item, ClickableView.SAVE)
            }
            binding.saveButton.isSelected = !binding.saveButton.isSelected
        }

        binding.userName.setOnClickListener {
            onClick(SubQuery(name = item.author), item, ClickableView.USER)
        }
    }
}

private fun AdapterDelegateViewBindingViewHolder<Post, ItemPostImageBinding>.showScore(score: Int) {
    if (score > 999_999) {
        binding.likes.text = getString(R.string.likesM, score / 1_000_000)
    } else {
        if (score > 999) binding.likes.text = getString(R.string.likesK, score / 1_000)
        else binding.likes.text = score.toString()
    }
}
