package com.balabanova.humblr.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001fH\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0018H\u0002J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u000203H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/balabanova/humblr/ui/home/SingleSubredditFragment;", "Lcom/balabanova/humblr/tools/BaseFragment;", "Lcom/balabanova/humblr/databinding/FragmentSingleSubredditBinding;", "()V", "adapter", "Lcom/balabanova/humblr/ui/home/HomePagedDataDelegationAdapter;", "getAdapter", "()Lcom/balabanova/humblr/ui/home/HomePagedDataDelegationAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "args", "Lcom/balabanova/humblr/ui/home/SingleSubredditFragmentArgs;", "getArgs", "()Lcom/balabanova/humblr/ui/home/SingleSubredditFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/balabanova/humblr/ui/home/SingleSubredditViewModel;", "getViewModel", "()Lcom/balabanova/humblr/ui/home/SingleSubredditViewModel;", "viewModel$delegate", "getLoadingState", "", "name", "", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "loadPosts", "loadSubredditDescription", "subreddit", "Lcom/balabanova/humblr/domain/models/Subreddit;", "onClick", "subQuery", "Lcom/balabanova/humblr/domain/tools/SubQuery;", "clickableView", "Lcom/balabanova/humblr/domain/tools/ClickableView;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setExpandButtonClick", "setShareButtonClick", "data", "setSubscribeButtonClick", "setToolbarBackButton", "shareLinkOnSubreddit", "url", "updateUi", "state", "Lcom/balabanova/humblr/domain/state/States;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SingleSubredditFragment extends com.balabanova.humblr.tools.BaseFragment<com.balabanova.humblr.databinding.FragmentSingleSubredditBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public SingleSubredditFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.balabanova.humblr.databinding.FragmentSingleSubredditBinding initBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    private final com.balabanova.humblr.ui.home.SingleSubredditViewModel getViewModel() {
        return null;
    }
    
    private final com.balabanova.humblr.ui.home.HomePagedDataDelegationAdapter getAdapter() {
        return null;
    }
    
    private final com.balabanova.humblr.ui.home.SingleSubredditFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadPosts() {
    }
    
    private final void getLoadingState(java.lang.String name) {
    }
    
    private final void updateUi(com.balabanova.humblr.domain.state.States state) {
    }
    
    private final void loadSubredditDescription(com.balabanova.humblr.domain.models.Subreddit subreddit) {
    }
    
    private final void setExpandButtonClick() {
    }
    
    private final void setShareButtonClick(com.balabanova.humblr.domain.models.Subreddit data) {
    }
    
    private final void setSubscribeButtonClick(com.balabanova.humblr.domain.models.Subreddit data) {
    }
    
    private final void shareLinkOnSubreddit(java.lang.String url) {
    }
    
    private final void onClick(com.balabanova.humblr.domain.tools.SubQuery subQuery, com.balabanova.humblr.domain.tools.ClickableView clickableView) {
    }
    
    private final void setToolbarBackButton() {
    }
}