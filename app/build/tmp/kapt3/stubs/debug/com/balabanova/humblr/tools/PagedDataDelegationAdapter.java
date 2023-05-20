package com.balabanova.humblr.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003BI\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00122\u0010\u0007\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0018\u00010\t0\b\"\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bB\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\fB+\b\u0016\u0012\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u000e\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/balabanova/humblr/tools/PagedDataDelegationAdapter;", "T", "", "Landroidx/paging/PagingDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "delegates", "", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;[Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "delegatesManager", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "(Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getDelegatesManager", "()Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegatesManager;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "payloads", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onFailedToRecycleView", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "app_debug"})
public abstract class PagedDataDelegationAdapter<T extends java.lang.Object> extends androidx.paging.PagingDataAdapter<T, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager<java.util.List<T>> delegatesManager = null;
    
    @org.jetbrains.annotations.NotNull
    protected final com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager<java.util.List<T>> getDelegatesManager() {
        return null;
    }
    
    public PagedDataDelegationAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback, @org.jetbrains.annotations.NotNull
    com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<T>>... delegates) {
        super(null, null, null);
    }
    
    public PagedDataDelegationAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null, null, null);
    }
    
    public PagedDataDelegationAdapter(@org.jetbrains.annotations.NotNull
    com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager<java.util.List<T>> delegatesManager, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull
    java.util.List<?> payloads) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onViewRecycled(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override
    public boolean onFailedToRecycleView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        return false;
    }
    
    @java.lang.Override
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
}