package com.balabanova.humblr.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016J+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/balabanova/humblr/data/repository/PagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/balabanova/humblr/domain/ListItem;", "repository", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "source", "listType", "Lcom/balabanova/humblr/domain/tools/ListTypes;", "(Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;Ljava/lang/String;Lcom/balabanova/humblr/domain/tools/ListTypes;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PagingSource extends androidx.paging.PagingSource<java.lang.String, com.balabanova.humblr.domain.ListItem> {
    private final com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository = null;
    private final java.lang.String source = null;
    private final com.balabanova.humblr.domain.tools.ListTypes listType = null;
    @org.jetbrains.annotations.NotNull
    private static final com.balabanova.humblr.data.repository.PagingSource.Companion Companion = null;
    @java.lang.Deprecated
    private static final java.lang.String FIRST_PAGE = "";
    
    @javax.inject.Inject
    public PagingSource(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.repository.SubredditsRemoteRepository repository, @org.jetbrains.annotations.Nullable
    java.lang.String source, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.domain.tools.ListTypes listType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.String, com.balabanova.humblr.domain.ListItem> state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, com.balabanova.humblr.domain.ListItem>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/balabanova/humblr/data/repository/PagingSource$Companion;", "", "()V", "FIRST_PAGE", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}