package com.balabanova.humblr.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/balabanova/humblr/data/api/ApiToken;", "", "getToken", "Lcom/balabanova/humblr/data/api/ResponseToken;", "grantType", "", "code", "redirectUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiToken {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "https://www.reddit.com/api/v1/access_token")
    public abstract java.lang.Object getToken(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "grant_type")
    java.lang.String grantType, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "code")
    java.lang.String code, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "redirect_uri")
    java.lang.String redirectUri, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balabanova.humblr.data.api.ResponseToken> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}