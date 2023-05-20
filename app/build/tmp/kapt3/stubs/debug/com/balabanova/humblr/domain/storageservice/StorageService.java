package com.balabanova.humblr.domain.storageservice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/balabanova/humblr/domain/storageservice/StorageService;", "", "load", "", "key", "", "save", "", "data", "saveEncryptedToken", "app_debug"})
public abstract interface StorageService {
    
    public abstract void saveEncryptedToken(@org.jetbrains.annotations.NotNull
    java.lang.String data);
    
    public abstract void save(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Object data);
    
    public abstract boolean load(@org.jetbrains.annotations.NotNull
    java.lang.String key);
}