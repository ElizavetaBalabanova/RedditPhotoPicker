package com.balabanova.humblr.data.api.dto.commentDto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto;", "Lcom/balabanova/humblr/data/api/dto/ThingDto;", "kind", "", "data", "Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto$CommentDataDto;", "(Ljava/lang/String;Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto$CommentDataDto;)V", "getData", "()Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto$CommentDataDto;", "getKind", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toComment", "Lcom/balabanova/humblr/domain/models/Comment;", "toString", "CommentDataDto", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CommentDto implements com.balabanova.humblr.data.api.dto.ThingDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String kind = null;
    @org.jetbrains.annotations.NotNull
    private final com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto data = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.balabanova.humblr.data.api.dto.commentDto.CommentDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String kind, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto data) {
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
    
    public CommentDto(@org.jetbrains.annotations.NotNull
    java.lang.String kind, @org.jetbrains.annotations.NotNull
    com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balabanova.humblr.domain.models.Comment toComment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u00b7\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d8\u0001\u0010C\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u000bH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b.\u0010(R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001a\u00a8\u0006I"}, d2 = {"Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto$CommentDataDto;", "", "subredditId", "", "likes", "", "saved", "id", "author", "parentId", "score", "", "authorFullname", "body", "name", "permalink", "created", "", "linkId", "subredditNamePrefixed", "depth", "count", "children", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getAuthor", "()Ljava/lang/String;", "getAuthorFullname", "getBody", "getChildren", "()Ljava/util/List;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDepth", "getId", "getLikes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLinkId", "getName", "getParentId", "getPermalink", "getSaved", "getScore", "getSubredditId", "getSubredditNamePrefixed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/balabanova/humblr/data/api/dto/commentDto/CommentDto$CommentDataDto;", "equals", "other", "hashCode", "toString", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class CommentDataDto {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String subredditId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean likes = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean saved = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String author = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String parentId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer score = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String authorFullname = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String body = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String permalink = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Double created = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String linkId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String subredditNamePrefixed = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer depth = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer count = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> children = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.balabanova.humblr.data.api.dto.commentDto.CommentDto.CommentDataDto copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "subreddit_id")
        java.lang.String subredditId, @org.jetbrains.annotations.Nullable
        java.lang.Boolean likes, @org.jetbrains.annotations.Nullable
        java.lang.Boolean saved, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.NotNull
        java.lang.String author, @org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "parent_id")
        java.lang.String parentId, @org.jetbrains.annotations.Nullable
        java.lang.Integer score, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "author_fullname")
        java.lang.String authorFullname, @org.jetbrains.annotations.Nullable
        java.lang.String body, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String permalink, @org.jetbrains.annotations.Nullable
        java.lang.Double created, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "link_id")
        java.lang.String linkId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "subreddit_name_prefixed")
        java.lang.String subredditNamePrefixed, @org.jetbrains.annotations.Nullable
        java.lang.Integer depth, @org.jetbrains.annotations.Nullable
        java.lang.Integer count, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> children) {
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
        
        public CommentDataDto(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "subreddit_id")
        java.lang.String subredditId, @org.jetbrains.annotations.Nullable
        java.lang.Boolean likes, @org.jetbrains.annotations.Nullable
        java.lang.Boolean saved, @org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.NotNull
        java.lang.String author, @org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "parent_id")
        java.lang.String parentId, @org.jetbrains.annotations.Nullable
        java.lang.Integer score, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "author_fullname")
        java.lang.String authorFullname, @org.jetbrains.annotations.Nullable
        java.lang.String body, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String permalink, @org.jetbrains.annotations.Nullable
        java.lang.Double created, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "link_id")
        java.lang.String linkId, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "subreddit_name_prefixed")
        java.lang.String subredditNamePrefixed, @org.jetbrains.annotations.Nullable
        java.lang.Integer depth, @org.jetbrains.annotations.Nullable
        java.lang.Integer count, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> children) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubredditId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getLikes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getSaved() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getParentId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getScore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAuthorFullname() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPermalink() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double getCreated() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLinkId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubredditNamePrefixed() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getDepth() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getCount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getChildren() {
            return null;
        }
    }
}