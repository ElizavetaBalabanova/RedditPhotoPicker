package com.balabanova.humblr.ui.user;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/balabanova/humblr/ui/user/UserViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repositoryProfile", "Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "repositorySubreddits", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "(Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;)V", "getProfileAndContent", "", "name", "", "makeFriends", "savePost", "postName", "unsavePost", "votePost", "voteDirection", "", "app_debug"})
public final class UserViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.ProfileRemoteRepository repositoryProfile = null;
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repositorySubreddits = null;
    
    @javax.inject.Inject
    public UserViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.ProfileRemoteRepository repositoryProfile, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repositorySubreddits) {
        super();
    }
    
    public final void getProfileAndContent(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void makeFriends(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
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
}