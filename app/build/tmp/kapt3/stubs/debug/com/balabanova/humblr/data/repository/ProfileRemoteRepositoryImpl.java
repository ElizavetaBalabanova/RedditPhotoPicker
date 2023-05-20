package com.balabanova.humblr.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/balabanova/humblr/data/repository/ProfileRemoteRepositoryImpl;", "Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "apiProfile", "Lcom/balabanova/humblr/data/api/ApiProfile;", "(Lcom/balabanova/humblr/data/api/ApiProfile;)V", "getAnotherUserProfile", "Lcom/balabanova/humblr/domain/models/Profile;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFriends", "Lcom/balabanova/humblr/domain/models/Friends;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoggedUserProfile", "getUserContent", "", "Lcom/balabanova/humblr/domain/ListItem;", "makeFriends", "", "app_debug"})
public final class ProfileRemoteRepositoryImpl implements com.balabanova.humblr.domain.repository.ProfileRemoteRepository {
    private final com.balabanova.humblr.data.api.ApiProfile apiProfile = null;
    
    @javax.inject.Inject
    public ProfileRemoteRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.ApiProfile apiProfile) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getLoggedUserProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Profile> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFriends(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Friends> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAnotherUserProfile(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.domain.models.Profile> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object makeFriends(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * no comments in tech.reqs, but can add later, after comments view implementation
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getUserContent(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.balabanova.humblr.domain.ListItem>> continuation) {
        return null;
    }
}