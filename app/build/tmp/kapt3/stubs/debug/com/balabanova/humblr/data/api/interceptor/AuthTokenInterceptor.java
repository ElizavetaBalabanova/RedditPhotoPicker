package com.balabanova.humblr.data.api.interceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/balabanova/humblr/data/api/interceptor/AuthTokenInterceptor;", "Lokhttp3/Interceptor;", "tokenProvider", "Lcom/balabanova/humblr/data/api/interceptor/AuthTokenProvider;", "(Lcom/balabanova/humblr/data/api/interceptor/AuthTokenProvider;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "app_debug"})
public final class AuthTokenInterceptor implements okhttp3.Interceptor {
    private final com.balabanova.humblr.data.api.interceptor.AuthTokenProvider tokenProvider = null;
    @org.jetbrains.annotations.NotNull
    public static final com.balabanova.humblr.data.api.interceptor.AuthTokenInterceptor.Companion Companion = null;
    private static final java.lang.String authString = "gXxLOu6qIfr7_rS58hXMfg:qxtbGLVSzg5ThNQxY3hQzXoSkHXlTQ";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String encodedAuthString = null;
    
    public AuthTokenInterceptor(@org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.interceptor.AuthTokenProvider tokenProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/balabanova/humblr/data/api/interceptor/AuthTokenInterceptor$Companion;", "", "()V", "authString", "", "encodedAuthString", "getEncodedAuthString", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEncodedAuthString() {
            return null;
        }
    }
}