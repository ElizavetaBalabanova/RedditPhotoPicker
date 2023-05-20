package com.balabanova.humblr.ui.profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/balabanova/humblr/ui/profile/FriendsViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repository", "Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "(Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;)V", "getFriends", "", "navigateBack", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class FriendsViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.ProfileRemoteRepository repository = null;
    
    @javax.inject.Inject
    public FriendsViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.ProfileRemoteRepository repository) {
        super();
    }
    
    public final void getFriends() {
    }
    
    public final void navigateBack(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
}