package com.balabanova.humblr.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/balabanova/humblr/ui/home/SingleSubredditViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repository", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "(Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;)V", "getPostsList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/balabanova/humblr/domain/ListItem;", "name", "", "getSubredditInfo", "", "navigateBack", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToUser", "savePost", "postName", "subscribe", "subQuery", "Lcom/balabanova/humblr/domain/tools/SubQuery;", "unsavePost", "votePost", "voteDirection", "", "app_debug"})
public final class SingleSubredditViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository = null;
    
    @javax.inject.Inject
    public SingleSubredditViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> getPostsList(@org.jetbrains.annotations.Nullable
    java.lang.String name) {
        return null;
    }
    
    public final void getSubredditInfo(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.tools.SubQuery subQuery) {
    }
    
    public final void votePost(int voteDirection, @org.jetbrains.annotations.NotNull
    java.lang.String postName) {
    }
    
    public final void savePost(@org.jetbrains.annotations.NotNull
    java.lang.String postName) {
    }
    
    public final void unsavePost(@org.jetbrains.annotations.NotNull
    java.lang.String postName) {
    }
    
    public final void navigateToUser(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void navigateBack(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
}