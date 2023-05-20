package com.balabanova.humblr.ui.profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/balabanova/humblr/ui/profile/ProfileViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repositoryProfile", "Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "repositorySubreddits", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "storageService", "Lcom/balabanova/humblr/domain/storageservice/StorageService;", "(Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;Lcom/balabanova/humblr/domain/storageservice/StorageService;)V", "clearSaved", "", "getClearedUrlAvatar", "", "urlAvatar", "getProfile", "logout", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToFriends", "app_debug"})
public final class ProfileViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.ProfileRemoteRepository repositoryProfile = null;
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repositorySubreddits = null;
    private final com.balabanova.humblr.domain.storageservice.StorageService storageService = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.ProfileRemoteRepository repositoryProfile, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repositorySubreddits, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.storageservice.StorageService storageService) {
        super();
    }
    
    public final void getProfile() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClearedUrlAvatar(@org.jetbrains.annotations.NotNull
    java.lang.String urlAvatar) {
        return null;
    }
    
    public final void logout(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
    
    public final void navigateToFriends(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
    
    public final void clearSaved() {
    }
}