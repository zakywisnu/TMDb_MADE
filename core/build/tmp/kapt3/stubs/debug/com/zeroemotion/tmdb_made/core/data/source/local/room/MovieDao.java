package com.zeroemotion.tmdb_made.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\'J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/data/source/local/room/MovieDao;", "", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/zeroemotion/tmdb_made/core/data/source/local/entity/MovieEntity;", "getAllTvShow", "Lcom/zeroemotion/tmdb_made/core/data/source/local/entity/TvShowEntity;", "getFavoriteMovie", "getFavoriteTvShow", "insertMovie", "", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvShow", "tvShow", "updateFavoriteMovie", "updateFavoriteTvShow", "core_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from movie")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity>> getAllMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from tv_show")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity>> getAllTvShow();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from movie where is_favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from tv_show where is_favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity>> getFavoriteTvShow();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity> tvShow, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity movie);
    
    @androidx.room.Update()
    public abstract void updateFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity tvShow);
}