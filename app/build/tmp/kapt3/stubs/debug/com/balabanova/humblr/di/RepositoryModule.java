package com.balabanova.humblr.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/balabanova/humblr/di/RepositoryModule;", "", "()V", "bindProfileRemoteRepository", "Lcom/balabanova/humblr/domain/repository/ProfileRemoteRepository;", "profileRemoteRepository", "Lcom/balabanova/humblr/data/repository/ProfileRemoteRepositoryImpl;", "bindSubredditsRemoteRepository", "Lcom/balabanova/humblr/domain/repository/SubredditsRemoteRepository;", "subredditsRemoteRepository", "Lcom/balabanova/humblr/data/repository/SubredditsRemoteRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.balabanova.humblr.domain.repository.ProfileRemoteRepository bindProfileRemoteRepository(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.repository.ProfileRemoteRepositoryImpl profileRemoteRepository);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.balabanova.humblr.domain.repository.SubredditsRemoteRepository bindSubredditsRemoteRepository(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.repository.SubredditsRemoteRepositoryImpl subredditsRemoteRepository);
}