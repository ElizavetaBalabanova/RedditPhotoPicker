package com.balabanova.humblr.data.api.dto.profileDto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto;", "", "name", "", "id", "urlAvatar", "more_infos", "Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto$UserDataSubDto;", "total_karma", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto$UserDataSubDto;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMore_infos", "()Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto$UserDataSubDto;", "setMore_infos", "(Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto$UserDataSubDto;)V", "getName", "setName", "getTotal_karma", "()Ljava/lang/Integer;", "setTotal_karma", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUrlAvatar", "setUrlAvatar", "UserDataSubDto", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ProfileDto {
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String urlAvatar;
    @org.jetbrains.annotations.Nullable
    private com.balabanova.humblr.data.api.dto.profileDto.ProfileDto.UserDataSubDto more_infos;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer total_karma;
    
    public ProfileDto(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "icon_img")
    java.lang.String urlAvatar, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "subreddit")
    com.balabanova.humblr.data.api.dto.profileDto.ProfileDto.UserDataSubDto more_infos, @org.jetbrains.annotations.Nullable
    java.lang.Integer total_karma) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrlAvatar() {
        return null;
    }
    
    public final void setUrlAvatar(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.balabanova.humblr.data.api.dto.profileDto.ProfileDto.UserDataSubDto getMore_infos() {
        return null;
    }
    
    public final void setMore_infos(@org.jetbrains.annotations.Nullable
    com.balabanova.humblr.data.api.dto.profileDto.ProfileDto.UserDataSubDto p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotal_karma() {
        return null;
    }
    
    public final void setTotal_karma(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/balabanova/humblr/data/api/dto/profileDto/ProfileDto$UserDataSubDto;", "", "subscribers", "", "title", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getSubscribers", "()Ljava/lang/Integer;", "setSubscribers", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class UserDataSubDto {
        @org.jetbrains.annotations.Nullable
        private java.lang.Integer subscribers;
        @org.jetbrains.annotations.Nullable
        private java.lang.String title;
        
        public UserDataSubDto(@org.jetbrains.annotations.Nullable
        java.lang.Integer subscribers, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "title")
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getSubscribers() {
            return null;
        }
        
        public final void setSubscribers(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
    }
}