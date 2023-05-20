package com.balabanova.humblr.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J!\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/balabanova/humblr/data/repository/SubredditsRemoteRepositoryImpl;", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "apiSubreddits", "Lcom/balabanova/humblr/data/api/ApiSubreddits;", "apiPost", "Lcom/balabanova/humblr/data/api/ApiPost;", "apiProfile", "Lcom/balabanova/humblr/data/api/ApiProfile;", "(Lcom/balabanova/humblr/data/api/ApiSubreddits;Lcom/balabanova/humblr/data/api/ApiPost;Lcom/balabanova/humblr/data/api/ApiProfile;)V", "getList", "", "Lcom/balabanova/humblr/domain/ListItem;", "type", "Lcom/balabanova/humblr/domain/tools/ListTypes;", "source", "", "page", "(Lcom/balabanova/humblr/domain/tools/ListTypes;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSinglePost", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubredditInfo", "Lcom/balabanova/humblr/domain/models/Subreddit;", "name", "savePost", "", "postName", "subscribeOnSubreddit", "action", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsaveAllSavedPosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsavePost", "votePost", "dir", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SubredditsRemoteRepositoryImpl implements com.balabanova.humblr.domain.repository.SubredditsRemoteRepository {
    private final com.balabanova.humblr.data.api.ApiSubreddits apiSubreddits = null;
    private final com.balabanova.humblr.data.api.ApiPost apiPost = null;
    private final com.balabanova.humblr.data.api.ApiProfile apiProfile = null;
    
    @javax.inject.Inject
    public SubredditsRemoteRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.ApiSubreddits apiSubreddits, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.ApiPost apiPost, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.ApiProfile apiProfile) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getList(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.tools.ListTypes type, @org.jetbrains.annotations.Nullable
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.balabanova.humblr.domain.ListItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object subscribeOnSubreddit(@org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object votePost(int dir, @org.jetbrains.annotations.NotNull
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object savePost(@org.jetbrains.annotations.NotNull
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object unsavePost(@org.jetbrains.annotations.NotNull
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object unsaveAllSavedPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSubredditInfo(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Subreddit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSinglePost(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.balabanova.humblr.domain.ListItem>> continuation) {
        return null;
    }
}