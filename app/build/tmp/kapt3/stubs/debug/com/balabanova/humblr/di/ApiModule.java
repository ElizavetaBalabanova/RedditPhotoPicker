package com.balabanova.humblr.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u000eH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u001c\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u000eH\u0007J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/balabanova/humblr/di/ApiModule;", "", "()V", "provideApiPost", "Lcom/balabanova/humblr/data/api/ApiPost;", "retrofit", "Lretrofit2/Retrofit;", "provideApiProfile", "Lcom/balabanova/humblr/data/api/ApiProfile;", "provideApiSubreddits", "Lcom/balabanova/humblr/data/api/ApiSubreddits;", "provideApiToken", "Lcom/balabanova/humblr/data/api/ApiToken;", "provideAuthTokenInterceptor", "Lokhttp3/Interceptor;", "tokenProvider", "Lcom/balabanova/humblr/data/api/interceptor/AuthTokenProvider;", "provideAuthTokenProvider", "context", "Landroid/content/Context;", "provideLoginInterceptor", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideRedditClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "authTokenInterceptor", "provideRetrofit", "okhttpClient", "moshi", "app_debug"})
@dagger.Module
public final class ApiModule {
    
    public ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balabanova.humblr.data.api.interceptor.AuthTokenProvider provideAuthTokenProvider(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @com.balabanova.humblr.data.api.interceptor.AuthTokenInterceptorQualifier
    @dagger.Provides
    public final okhttp3.Interceptor provideAuthTokenInterceptor(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.interceptor.AuthTokenProvider tokenProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @com.balabanova.humblr.data.api.interceptor.LoggingInterceptorQualifier
    @dagger.Provides
    public final okhttp3.Interceptor provideLoginInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideRedditClient(@org.jetbrains.annotations.NotNull
    @com.balabanova.humblr.data.api.interceptor.LoggingInterceptorQualifier
    okhttp3.Interceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    @com.balabanova.humblr.data.api.interceptor.AuthTokenInterceptorQualifier
    okhttp3.Interceptor authTokenInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okhttpClient, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balabanova.humblr.data.api.ApiToken provideApiToken(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balabanova.humblr.data.api.ApiProfile provideApiProfile(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balabanova.humblr.data.api.ApiSubreddits provideApiSubreddits(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balabanova.humblr.data.api.ApiPost provideApiPost(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}