package com.zeroemotion.tmdb_made.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/zeroemotion/tmdb_made/movie/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zeroemotion/tmdb_made/movie/MovieAdapter$MovieViewHolder;", "Lcom/zeroemotion/tmdb_made/core/utils/CustomOnClick;", "()V", "listData", "Ljava/util/ArrayList;", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClicked", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "", "MovieViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zeroemotion.tmdb_made.movie.MovieAdapter.MovieViewHolder> implements com.zeroemotion.tmdb_made.core.utils.CustomOnClick {
    private java.util.ArrayList<com.zeroemotion.tmdb_made.core.domain.model.Movie> listData;
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zeroemotion.tmdb_made.movie.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.movie.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public MovieAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/zeroemotion/tmdb_made/movie/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/zeroemotion/tmdb_made/core/databinding/ItemMovieBinding;", "(Lcom/zeroemotion/tmdb_made/core/databinding/ItemMovieBinding;)V", "getView", "()Lcom/zeroemotion/tmdb_made/core/databinding/ItemMovieBinding;", "setView", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.zeroemotion.tmdb_made.core.databinding.ItemMovieBinding view;
        
        @org.jetbrains.annotations.NotNull()
        public final com.zeroemotion.tmdb_made.core.databinding.ItemMovieBinding getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        com.zeroemotion.tmdb_made.core.databinding.ItemMovieBinding p0) {
        }
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        com.zeroemotion.tmdb_made.core.databinding.ItemMovieBinding view) {
            super(null);
        }
    }
}