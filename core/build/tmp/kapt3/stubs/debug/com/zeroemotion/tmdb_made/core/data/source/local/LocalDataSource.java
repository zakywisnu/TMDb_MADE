package com.zeroemotion.tmdb_made.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/data/source/local/LocalDataSource;", "", "movieDao", "Lcom/zeroemotion/tmdb_made/core/data/source/local/room/MovieDao;", "(Lcom/zeroemotion/tmdb_made/core/data/source/local/room/MovieDao;)V", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/zeroemotion/tmdb_made/core/data/source/local/entity/MovieEntity;", "getAllTvShow", "Lcom/zeroemotion/tmdb_made/core/data/source/local/entity/TvShowEntity;", "getFavoriteMovie", "getFavoriteTvShow", "insertMovie", "", "movie", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTvShow", "tvShow", "setFavoriteMovie", "state", "", "setFavoriteTvShow", "core_debug"})
public final class LocalDataSource {
    private final com.zeroemotion.tmdb_made.core.data.source.local.room.MovieDao movieDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity>> getAllTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity>> getFavoriteTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity> movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity> tvShow, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.local.entity.MovieEntity movie, boolean state) {
    }
    
    public final void setFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.local.entity.TvShowEntity tvShow, boolean state) {
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.local.room.MovieDao movieDao) {
        super();
    }
}