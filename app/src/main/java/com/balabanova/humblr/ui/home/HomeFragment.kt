package com.balabanova.humblr.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.balabanova.humblr.R
import com.balabanova.humblr.databinding.FragmentHomeBinding
import com.balabanova.humblr.domain.ListItem
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.domain.tools.ClickableView
import com.balabanova.humblr.domain.tools.SUBSCRIBE
import com.balabanova.humblr.domain.tools.SubQuery
import com.balabanova.humblr.tools.BaseFragment
import com.balabanova.humblr.tools.setSelectedTabListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentHomeBinding.inflate(inflater)
    private val viewModel by viewModels<HomeViewModel>()

    private val args : HomeFragmentArgs by navArgs()

    private val adapter by lazy {
        HomePagedDataDelegationAdapter { subQuery: SubQuery, item: ListItem, clickableView: ClickableView ->
            onClick(subQuery, item, clickableView)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getLoadingState()
        tabLayoutListener(binding.toggleSource)
        setSearchListener()
        loadContent()

        viewModel.createToken(args.code)
    }

    private fun loadContent() {

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            viewModel.subredditsList.collect { pagingData ->
                adapter.submitData(pagingData)
                setAdapter()
            }
        }
    }

    private fun setAdapter() {
        binding.recyclerView.adapter = adapter
    }

    private fun getLoadingState() {
        viewModel.getSubreddits()
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

            }
            is States.Error -> {
                binding.common.progressBar.isVisible = true
                binding.recyclerView.isVisible = false
            }
        }
    }

    private fun tabLayoutListener(tabLayout: TabLayout) {
        tabLayout.setSelectedTabListener { position ->
            viewModel.setSource(position)
        }
    }

    private fun setSearchListener() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (query.isNotEmpty()) viewModel.onSearchButtonClick(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }

    private fun onClick(subQuery: SubQuery, item: ListItem, clickableView: ClickableView) {
        if (clickableView == ClickableView.SUBREDDIT)
            viewModel.navigateToSingleSubreddit(this, item)
        if (clickableView == ClickableView.SUBSCRIBE) {
            viewModel.subscribe(subQuery)
            val text =
                if (subQuery.action == SUBSCRIBE) getString(R.string.subscribed)
                else getString(R.string.unsubscribed)
            Snackbar.make(binding.recyclerView, text, LENGTH_SHORT).show()
        }
    }
}
