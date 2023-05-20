package com.balabanova.humblr.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.balabanova.humblr.databinding.FragmentFriendsBinding
import com.balabanova.humblr.domain.models.Friends
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.ui.delegates.friendsDelegate
import com.balabanova.humblr.tools.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FriendsFragment : BaseFragment<FragmentFriendsBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentFriendsBinding.inflate(inflater)
    private val viewModel by viewModels<FriendsViewModel>()

    private val adapter by lazy { ListDelegationAdapter(friendsDelegate()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getLoadingState()
        setToolbarBackButton()
    }

    private fun getLoadingState() {
        viewModel.getFriends()
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.state.collect { state -> updateUi(state) }
        }
    }

    private fun updateUi(state: States) {
        when (state) {
            States.NotStarted -> {}
            States.Loading -> {
                binding.common.progressBar.isVisible = true
                binding.common.error.isVisible = false
                binding.recyclerView.isVisible = false
            }
            is States.Success -> {
                binding.common.progressBar.isVisible = false
                binding.common.error.isVisible = false
                binding.recyclerView.isVisible = true
                loadContent(state.data as Friends)
            }
            is States.Error -> {
                binding.common.progressBar.isVisible = false
                binding.common.error.isVisible = true
                binding.recyclerView.isVisible = false
            }
        }
    }

    private fun loadContent(data: Friends) {
        adapter.items = data.friends_list
        binding.recyclerView.adapter = adapter
    }

    private fun setToolbarBackButton() {
        binding.buttonBack.setOnClickListener {
            viewModel.navigateBack(this)
        }
    }
}
