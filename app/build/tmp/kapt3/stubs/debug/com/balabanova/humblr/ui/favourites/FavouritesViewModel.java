package com.balabanova.humblr.ui.favourites;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0015J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0015J\u0016\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u00060"}, d2 = {"Lcom/balabanova/humblr/ui/favourites/FavouritesViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repository", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "(Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;)V", "_thingFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/balabanova/humblr/domain/tools/Change;", "Lcom/balabanova/humblr/domain/tools/FavoritesQuery;", "query", "thingList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/balabanova/humblr/domain/ListItem;", "getThingList$annotations", "()V", "getThingList", "()Lkotlinx/coroutines/flow/Flow;", "setThingList", "(Lkotlinx/coroutines/flow/Flow;)V", "Landroidx/paging/Pager;", "", "listType", "Lcom/balabanova/humblr/domain/tools/ListTypes;", "source", "navigateToSingleSubreddit", "", "fragment", "Landroidx/fragment/app/Fragment;", "item", "navigateToUser", "name", "savePost", "postName", "setQuery", "position", "", "isTabSource", "", "setSource", "setType", "subscribe", "subQuery", "Lcom/balabanova/humblr/domain/tools/SubQuery;", "unsavePost", "votePost", "voteDirection", "Companion", "app_debug"})
public final class FavouritesViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository = null;
    private final com.balabanova.humblr.domain.tools.FavoritesQuery query = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.balabanova.humblr.domain.tools.Change<com.balabanova.humblr.domain.tools.FavoritesQuery>> _thingFlow = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> thingList;
    @org.jetbrains.annotations.NotNull
    public static final com.balabanova.humblr.ui.favourites.FavouritesViewModel.Companion Companion = null;
    private static final int FIRST_POSITION_INDEX = 0;
    private static final java.lang.String ALL = "";
    private static final java.lang.String SAVED = "saved";
    private static final int PAGE_SIZE_SUBREDDITS = 10;
    
    @javax.inject.Inject
    public FavouritesViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository) {
        super();
    }
    
    public final void setQuery(int position, boolean isTabSource) {
    }
    
    private final void setSource(int position) {
    }
    
    private final void setType(int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> getThingList() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    public static void getThingList$annotations() {
    }
    
    public final void setThingList(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> p0) {
    }
    
    private final androidx.paging.Pager<java.lang.String, com.balabanova.humblr.domain.ListItem> getThingList(com.balabanova.humblr.domain.tools.ListTypes listType, java.lang.String source) {
        return null;
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.tools.SubQuery subQuery) {
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
    
    public final void navigateToSingleSubreddit(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.ListItem item) {
    }
    
    public final void navigateToUser(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/balabanova/humblr/ui/favourites/FavouritesViewModel$Companion;", "", "()V", "ALL", "", "FIRST_POSITION_INDEX", "", "PAGE_SIZE_SUBREDDITS", "SAVED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}