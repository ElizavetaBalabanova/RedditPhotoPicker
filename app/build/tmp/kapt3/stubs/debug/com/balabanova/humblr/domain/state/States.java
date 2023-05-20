package com.balabanova.humblr.domain.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/balabanova/humblr/domain/state/States;", "", "Error", "Loading", "NotStarted", "Success", "Lcom/balabanova/humblr/domain/state/States$Error;", "Lcom/balabanova/humblr/domain/state/States$Loading;", "Lcom/balabanova/humblr/domain/state/States$NotStarted;", "Lcom/balabanova/humblr/domain/state/States$Success;", "app_debug"})
public abstract interface States {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/balabanova/humblr/domain/state/States$NotStarted;", "Lcom/balabanova/humblr/domain/state/States;", "()V", "app_debug"})
    public static final class NotStarted implements com.balabanova.humblr.domain.state.States {
        @org.jetbrains.annotations.NotNull
        public static final com.balabanova.humblr.domain.state.States.NotStarted INSTANCE = null;
        
        private NotStarted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/balabanova/humblr/domain/state/States$Loading;", "Lcom/balabanova/humblr/domain/state/States;", "()V", "app_debug"})
    public static final class Loading implements com.balabanova.humblr.domain.state.States {
        @org.jetbrains.annotations.NotNull
        public static final com.balabanova.humblr.domain.state.States.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/balabanova/humblr/domain/state/States$Success;", "Lcom/balabanova/humblr/domain/state/States;", "data", "", "data2", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "getData2", "setData2", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success implements com.balabanova.humblr.domain.state.States {
        @org.jetbrains.annotations.Nullable
        private java.lang.Object data;
        @org.jetbrains.annotations.Nullable
        private java.lang.Object data2;
        
        @org.jetbrains.annotations.NotNull
        public final com.balabanova.humblr.domain.state.States.Success copy(@org.jetbrains.annotations.Nullable
        java.lang.Object data, @org.jetbrains.annotations.Nullable
        java.lang.Object data2) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Success() {
            super();
        }
        
        public Success(@org.jetbrains.annotations.Nullable
        java.lang.Object data, @org.jetbrains.annotations.Nullable
        java.lang.Object data2) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getData2() {
            return null;
        }
        
        public final void setData2(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/balabanova/humblr/domain/state/States$Error;", "Lcom/balabanova/humblr/domain/state/States;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error implements com.balabanova.humblr.domain.state.States {
        @org.jetbrains.annotations.NotNull
        private java.lang.String message;
        
        @org.jetbrains.annotations.NotNull
        public final com.balabanova.humblr.domain.state.States.Error copy(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Error() {
            super();
        }
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}