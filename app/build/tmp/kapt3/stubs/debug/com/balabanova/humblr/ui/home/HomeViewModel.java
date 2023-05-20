package com.balabanova.humblr.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rJ\u0006\u0010\u001e\u001a\u00020\u001cJ&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u001f2\b\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00060"}, d2 = {"Lcom/balabanova/humblr/ui/home/HomeViewModel;", "Lcom/balabanova/humblr/tools/BaseViewModel;", "repository", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "storageService", "Lcom/balabanova/humblr/domain/storageservice/StorageService;", "apiToken", "Lcom/balabanova/humblr/data/api/ApiToken;", "(Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;Lcom/balabanova/humblr/domain/storageservice/StorageService;Lcom/balabanova/humblr/data/api/ApiToken;)V", "_query", "Lcom/balabanova/humblr/domain/tools/Query;", "_subredditsSourceFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "subredditsList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/balabanova/humblr/domain/ListItem;", "getSubredditsList$annotations", "()V", "getSubredditsList", "()Lkotlinx/coroutines/flow/Flow;", "setSubredditsList", "(Lkotlinx/coroutines/flow/Flow;)V", "subredditsSource", "getSubredditsSource", "()Ljava/lang/String;", "createToken", "", "code", "getSubreddits", "Landroidx/paging/Pager;", "source", "listType", "Lcom/balabanova/humblr/domain/tools/ListTypes;", "navigateToSingleSubreddit", "fragment", "Landroidx/fragment/app/Fragment;", "item", "onSearchButtonClick", "text", "setSource", "position", "", "subscribe", "subQuery", "Lcom/balabanova/humblr/domain/tools/SubQuery;", "Companion", "app_debug"})
public final class HomeViewModel extends com.balabanova.humblr.tools.BaseViewModel {
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository = null;
    private final com.balabanova.humblr.domain.storageservice.StorageService storageService = null;
    private final com.balabanova.humblr.data.api.ApiToken apiToken = null;
    private final com.balabanova.humblr.domain.tools.Query _query = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _subredditsSourceFlow = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> subredditsList;
    @org.jetbrains.annotations.NotNull
    public static final com.balabanova.humblr.ui.home.HomeViewModel.Companion Companion = null;
    private static final int FIRST_POSITION_INDEX = 0;
    private static final java.lang.String NEW = "new";
    private static final java.lang.String POPULAR = "";
    private static final int PAGE_SIZE_SUBREDDITS = 10;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.storageservice.StorageService storageService, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.ApiToken apiToken) {
        super();
    }
    
    private final java.lang.String getSubredditsSource() {
        return null;
    }
    
    public final void setSource(int position) {
    }
    
    public final void createToken(@org.jetbrains.annotations.NotNull
    java.lang.String code) {
    }
    
    public final void getSubreddits() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> getSubredditsList() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    public static void getSubredditsList$annotations() {
    }
    
    public final void setSubredditsList(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.balabanova.humblr.domain.ListItem>> p0) {
    }
    
    private final androidx.paging.Pager<java.lang.String, com.balabanova.humblr.domain.ListItem> getSubredditsList(java.lang.String source, com.balabanova.humblr.domain.tools.ListTypes listType) {
        return null;
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.tools.SubQuery subQuery) {
    }
    
    public final void navigateToSingleSubreddit(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.ListItem item) {
    }
    
    public final void onSearchButtonClick(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/balabanova/humblr/ui/home/HomeViewModel$Companion;", "", "()V", "FIRST_POSITION_INDEX", "", "NEW", "", "PAGE_SIZE_SUBREDDITS", "POPULAR", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}