package com.zeroemotion.tmdb_made.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u001a\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0006H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0006H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieInteractor;", "Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;", "movieRepository", "Lcom/zeroemotion/tmdb_made/core/domain/repository/IMovieRepository;", "(Lcom/zeroemotion/tmdb_made/core/domain/repository/IMovieRepository;)V", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zeroemotion/tmdb_made/core/data/Resource;", "", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "getAllTvShow", "Lcom/zeroemotion/tmdb_made/core/domain/model/TvShow;", "getFavoriteMovie", "getFavoriteTvShow", "getTrendingMovie", "Lio/reactivex/Single;", "getTrendingTvShow", "setFavoriteMovie", "", "movie", "state", "", "setFavoriteTvShow", "tvShow", "core_debug"})
public final class MovieInteractor implements com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase {
    private final com.zeroemotion.tmdb_made.core.domain.repository.IMovieRepository movieRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>>> getAllTvShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> getFavoriteMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> getFavoriteTvShow() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.Movie movie, boolean state) {
    }
    
    @java.lang.Override()
    public void setFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.TvShow tvShow, boolean state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> getTrendingMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> getTrendingTvShow() {
        return null;
    }
    
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.repository.IMovieRepository movieRepository) {
        super();
    }
}