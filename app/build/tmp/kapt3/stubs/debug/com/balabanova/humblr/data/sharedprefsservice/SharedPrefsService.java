package com.balabanova.humblr.data.sharedprefsservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/balabanova/humblr/data/sharedprefsservice/SharedPrefsService;", "Lcom/balabanova/humblr/domain/storageservice/StorageService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "create", "load", "", "key", "", "save", "", "data", "", "saveEncryptedToken", "value", "app_debug"})
@javax.inject.Singleton
public final class SharedPrefsService implements com.balabanova.humblr.domain.storageservice.StorageService {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject
    public SharedPrefsService(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void save(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object data) {
    }
    
    @java.lang.Override
    public boolean load(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences create(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    public void saveEncryptedToken(@org.jetbrains.annotations.NotNull
    java.lang.String data) {
    }
    
    private final void save(android.content.SharedPreferences $this$save, java.lang.String key, java.lang.Object value) {
    }
}