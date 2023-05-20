package com.balabanova.humblr.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002R5\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/balabanova/humblr/ui/profile/FriendsFragment;", "Lcom/balabanova/humblr/tools/BaseFragment;", "Lcom/balabanova/humblr/databinding/FragmentFriendsBinding;", "()V", "adapter", "Lcom/hannesdorfmann/adapterdelegates4/ListDelegationAdapter;", "", "Lcom/balabanova/humblr/domain/ListItem;", "kotlin.jvm.PlatformType", "getAdapter", "()Lcom/hannesdorfmann/adapterdelegates4/ListDelegationAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/balabanova/humblr/ui/profile/FriendsViewModel;", "getViewModel", "()Lcom/balabanova/humblr/ui/profile/FriendsViewModel;", "viewModel$delegate", "getLoadingState", "", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "loadContent", "data", "Lcom/balabanova/humblr/domain/models/Friends;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setToolbarBackButton", "updateUi", "state", "Lcom/balabanova/humblr/domain/state/States;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FriendsFragment extends com.balabanova.humblr.tools.BaseFragment<com.balabanova.humblr.databinding.FragmentFriendsBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    
    public FriendsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.balabanova.humblr.databinding.FragmentFriendsBinding initBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    private final com.balabanova.humblr.ui.profile.FriendsViewModel getViewModel() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter<java.util.List<com.balabanova.humblr.domain.ListItem>> getAdapter() {
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
    
    private final void loadContent(com.balabanova.humblr.domain.models.Friends data) {
    }
    
    private final void setToolbarBackButton() {
    }
}