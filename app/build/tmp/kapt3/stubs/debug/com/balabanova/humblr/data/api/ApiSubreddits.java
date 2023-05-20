package com.balabanova.humblr.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J)\u0010\u000e\u001a\u00020\b2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/balabanova/humblr/data/api/ApiSubreddits;", "", "getSubredditInfo", "Lcom/balabanova/humblr/data/api/dto/subredditDto/SubredditDto;", "source", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubredditListing", "Lcom/balabanova/humblr/data/api/dto/subredditDto/SubredditListingDto;", "page", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubredditPosts", "Lcom/balabanova/humblr/data/api/dto/postDto/PostListingDto;", "getSubscribed", "searchSubredditsPaging", "subscribeOnSubreddit", "", "action", "name", "app_debug"})
public abstract interface ApiSubreddits {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/subreddits/{source}")
    public abstract java.lang.Object getSubredditListing(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/subscribe")
    public abstract java.lang.Object subscribeOnSubreddit(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "action")
    java.lang.String action, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "sr")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/{source}")
    public abstract java.lang.Object getSubredditPosts(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.postDto.PostListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/{source}/about")
    public abstract java.lang.Object getSubredditInfo(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.subredditDto.SubredditDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/subreddits/mine/subscriber")
    public abstract java.lang.Object getSubscribed(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/subreddits/search")
    public abstract java.lang.Object searchSubredditsPaging(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "q")
    java.lang.String source, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto> continuation);
}