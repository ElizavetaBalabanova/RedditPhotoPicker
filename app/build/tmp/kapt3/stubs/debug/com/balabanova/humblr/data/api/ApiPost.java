package com.balabanova.humblr.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u00020\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/balabanova/humblr/data/api/ApiPost;", "", "getAllSavedPosts", "Lcom/balabanova/humblr/data/api/dto/postDto/PostListingDto;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostListing", "source", "page", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSaved", "getSinglePost", "", "Lcom/balabanova/humblr/data/api/dto/postDto/SinglePostListingDto;", "url", "savePost", "", "postName", "unsaveAllPosts", "unsavePost", "votePost", "dir", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiPost {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/r/popular/{source}")
    public abstract java.lang.Object getPostListing(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.postDto.PostListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/vote")
    public abstract java.lang.Object votePost(@retrofit2.http.Query(value = "dir")
    int dir, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "id")
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/save")
    public abstract java.lang.Object savePost(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "id")
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/unsave")
    public abstract java.lang.Object unsavePost(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "id")
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/comments/{url}/")
    public abstract java.lang.Object getSinglePost(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "url")
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.balabanova.humblr.data.api.dto.postDto.SinglePostListingDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/user/{username}/saved/")
    public abstract java.lang.Object getSaved(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "after")
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.postDto.PostListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/user/{username}/saved/")
    public abstract java.lang.Object getAllSavedPosts(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.postDto.PostListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/unsave")
    public abstract java.lang.Object unsaveAllPosts(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "id")
    java.lang.String postName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}