package com.balabanova.humblr.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "", "getAnotherUserProfile", "Lcom/balabanova/humblr/domain/models/Profile;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFriends", "Lcom/balabanova/humblr/domain/models/Friends;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoggedUserProfile", "getUserContent", "", "Lcom/balabanova/humblr/domain/ListItem;", "makeFriends", "", "app_debug"})
public abstract interface ProfileRemoteRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLoggedUserProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Profile> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFriends(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Friends> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAnotherUserProfile(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Profile> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object makeFriends(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserContent(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.balabanova.humblr.domain.ListItem>> continuation);
}