package com.zeroemotion.tmdb_made.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\fH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\fH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0015"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;", "", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zeroemotion/tmdb_made/core/data/Resource;", "", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "getAllTvShow", "Lcom/zeroemotion/tmdb_made/core/domain/model/TvShow;", "getFavoriteMovie", "getFavoriteTvShow", "getTrendingMovie", "Lio/reactivex/Single;", "getTrendingTvShow", "setFavoriteMovie", "", "movie", "state", "", "setFavoriteTvShow", "tvShow", "core_debug"})
public abstract interface MovieUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>>> getAllMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>>> getAllTvShow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> getFavoriteMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> getFavoriteTvShow();
    
    public abstract void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.Movie movie, boolean state);
    
    public abstract void setFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.TvShow tvShow, boolean state);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> getTrendingMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> getTrendingTvShow();
}