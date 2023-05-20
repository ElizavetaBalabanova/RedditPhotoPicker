package com.balabanova.humblr.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006!"}, d2 = {"Lcom/balabanova/humblr/ui/profile/ProfileFragment;", "Lcom/balabanova/humblr/tools/BaseFragment;", "Lcom/balabanova/humblr/databinding/FragmentProfileBinding;", "()V", "viewModel", "Lcom/balabanova/humblr/ui/profile/ProfileViewModel;", "getViewModel", "()Lcom/balabanova/humblr/ui/profile/ProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getLoadingState", "", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "loadAvatar", "url", "", "loadProfileTexts", "data", "Lcom/balabanova/humblr/domain/models/Profile;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAlertDialog", "setClearSaved", "setFriendsListClick", "setLogoutButton", "updateUi", "state", "Lcom/balabanova/humblr/domain/state/States;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProfileFragment extends com.balabanova.humblr.tools.BaseFragment<com.balabanova.humblr.databinding.FragmentProfileBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ProfileFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.balabanova.humblr.databinding.FragmentProfileBinding initBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    private final com.balabanova.humblr.ui.profile.ProfileViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLoadingState() {
    }
    
    private final void updateUi(com.balabanova.humblr.domain.state.States state) {
    }
    
    private final void loadProfileTexts(com.balabanova.humblr.domain.models.Profile data) {
    }
    
    private final void loadAvatar(java.lang.String url) {
    }
    
    private final void setFriendsListClick() {
    }
    
    private final void setClearSaved() {
    }
    
    private final void setLogoutButton() {
    }
    
    private final void setAlertDialog() {
    }
}