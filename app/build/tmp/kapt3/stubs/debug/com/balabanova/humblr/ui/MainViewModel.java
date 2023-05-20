package com.balabanova.humblr.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/balabanova/humblr/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "storageService", "Lcom/balabanova/humblr/domain/storageservice/StorageService;", "(Lcom/balabanova/humblr/domain/storageservice/StorageService;)V", "setNavigation", "", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.balabanova.humblr.domain.storageservice.StorageService storageService = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.storageservice.StorageService storageService) {
        super();
    }
    
    public final void setNavigation(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
}