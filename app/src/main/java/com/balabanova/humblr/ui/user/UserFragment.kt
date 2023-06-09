package com.balabanova.humblr.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.balabanova.humblr.R
import com.balabanova.humblr.databinding.FragmentUserBinding
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.models.Profile
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.domain.tools.ClickableView
import com.balabanova.humblr.domain.tools.SubQuery
import com.balabanova.humblr.ui.delegates.postsDelegate
import com.balabanova.humblr.tools.BaseFragment
import com.balabanova.humblr.tools.loadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : BaseFragment<FragmentUserBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentUserBinding.inflate(inflater)
    private val viewModel by viewModels<UserViewModel>()

    private val adapter by lazy { ListDelegationAdapter(postsDelegate{
            subQuery: SubQuery, _: ListItem, clickableView: ClickableView ->
        onClick(subQuery, clickableView)
    }) }

    private val args by navArgs<UserFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getLoadingState()
        setMakeFriendsClick(args.name)
    }

    private fun getLoadingState() {
        viewModel.getProfileAndContent(args.name)
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.state.collect { state -> updateUi(state) }
        }
    }

    private fun updateUi(state: States) {
        when (state) {
            States.NotStarted -> {}
            States.Loading -> {
                binding.containerView.isVisible = false
                binding.common.progressBar.isVisible = true
                binding.common.error.isVisible = false
            }
            is States.Error -> {
                binding.containerView.isVisible = false
                binding.common.progressBar.isVisible = false
                binding.common.error.isVisible = true
            }
            is States.Success -> {
                binding.containerView.isVisible = true
                binding.common.progressBar.isVisible = false
                binding.common.error.isVisible = false
                val data = state.data as Profile
                if (data.urlAvatar != null) loadAvatar(data.urlAvatar!!)
                loadProfileTexts(data)
                loadUserContent(state.data2 as List<ListItem>)
            }
        }
    }

    private fun loadAvatar(url: String) {
        binding.imageView.loadImage(url)
    }

    private fun loadProfileTexts(data: Profile) {
        with(binding) {
            userName.text = data.name
            userId.text = getString(R.string.user_id, data.id)
            karma.text = getString(R.string.karma, data.total_karma ?: 0)
            followers.text =
                getString(R.string.followers, data.more_infos?.subscribers ?: "0")
        }
    }

    private fun loadUserContent(data: List<ListItem>) {
        binding.recycler.adapter = adapter
        adapter.items = data

    }

    private fun setMakeFriendsClick(name: String) {
        binding.buttonMakeFriends.setOnClickListener {
            viewModel.makeFriends(name)
            Snackbar.make(binding.containerView, getString(R.string.friends_now), LENGTH_SHORT).show()
        }
    }

    private fun onClick(subQuery: SubQuery, clickableView: ClickableView) {
        when (clickableView) {
            ClickableView.SAVE -> viewModel.savePost(postName = subQuery.name)
            ClickableView.UNSAVE -> viewModel.unsavePost(postName = subQuery.name)
            ClickableView.VOTE ->
                viewModel.votePost(voteDirection = subQuery.voteDirection, postName = subQuery.name)
            else -> {}
        }
    }
}
