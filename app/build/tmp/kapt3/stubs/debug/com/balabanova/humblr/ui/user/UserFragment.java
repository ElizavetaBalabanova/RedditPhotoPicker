package com.balabanova.humblr.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u001a\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001fH\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u000202H\u0002R5\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00063"}, d2 = {"Lcom/balabanova/humblr/ui/user/UserFragment;", "Lcom/balabanova/humblr/tools/BaseFragment;", "Lcom/balabanova/humblr/databinding/FragmentUserBinding;", "()V", "adapter", "Lcom/hannesdorfmann/adapterdelegates4/ListDelegationAdapter;", "", "Lcom/balabanova/humblr/domain/ListItem;", "kotlin.jvm.PlatformType", "getAdapter", "()Lcom/hannesdorfmann/adapterdelegates4/ListDelegationAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "args", "Lcom/balabanova/humblr/ui/user/UserFragmentArgs;", "getArgs", "()Lcom/balabanova/humblr/ui/user/UserFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/balabanova/humblr/ui/user/UserViewModel;", "getViewModel", "()Lcom/balabanova/humblr/ui/user/UserViewModel;", "viewModel$delegate", "getLoadingState", "", "initBinding", "inflater", "Landroid/view/LayoutInflater;", "loadAvatar", "url", "", "loadProfileTexts", "data", "Lcom/balabanova/humblr/domain/models/Profile;", "loadUserContent", "onClick", "subQuery", "Lcom/balabanova/humblr/domain/tools/SubQuery;", "clickableView", "Lcom/balabanova/humblr/domain/tools/ClickableView;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setMakeFriendsClick", "name", "updateUi", "state", "Lcom/balabanova/humblr/domain/state/States;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class UserFragment extends com.balabanova.humblr.tools.BaseFragment<com.balabanova.humblr.databinding.FragmentUserBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public UserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.balabanova.humblr.databinding.FragmentUserBinding initBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    private final com.balabanova.humblr.ui.user.UserViewModel getViewModel() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter<java.util.List<com.balabanova.humblr.domain.ListItem>> getAdapter() {
        return null;
    }
    
    private final com.balabanova.humblr.ui.user.UserFragmentArgs getArgs() {
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
    
    private final void loadAvatar(java.lang.String url) {
    }
    
    private final void loadProfileTexts(com.balabanova.humblr.domain.models.Profile data) {
    }
    
    private final void loadUserContent(java.util.List<? extends com.balabanova.humblr.domain.ListItem> data) {
    }
    
    private final void setMakeFriendsClick(java.lang.String name) {
    }
    
    private final void onClick(com.balabanova.humblr.domain.tools.SubQuery subQuery, com.balabanova.humblr.domain.tools.ClickableView clickableView) {
    }
}