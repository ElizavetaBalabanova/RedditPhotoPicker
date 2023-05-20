package com.balabanova.humblr.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/balabanova/humblr/data/api/ApiProfile;", "", "getAnotherUserProfile", "Lcom/balabanova/humblr/data/api/dto/profileDto/ClickedUserProfileDto;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFriends", "Lcom/balabanova/humblr/data/api/dto/profileDto/FriendsListingDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoggedUserProfile", "Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto;", "getUserContent", "Lcom/balabanova/humblr/data/api/dto/postDto/SinglePostListingDto;", "makeFriends", "", "requestBody", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiProfile {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/v1/me")
    public abstract java.lang.Object getLoggedUserProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.profileDto.ProfileDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/v1/me/friends")
    public abstract java.lang.Object getFriends(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.profileDto.FriendsListingDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/user/{username}/about")
    public abstract java.lang.Object getAnotherUserProfile(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.profileDto.ClickedUserProfileDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "/api/v1/me/friends/{username}")
    public abstract java.lang.Object makeFriends(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.lang.String requestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/user/{username}")
    public abstract java.lang.Object getUserContent(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.dto.postDto.SinglePostListingDto> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}