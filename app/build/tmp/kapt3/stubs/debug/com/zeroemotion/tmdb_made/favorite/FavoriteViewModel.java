package com.zeroemotion.tmdb_made.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/zeroemotion/tmdb_made/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;", "(Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;)V", "movieFavorite", "Landroidx/lifecycle/LiveData;", "", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "getMovieFavorite", "()Landroidx/lifecycle/LiveData;", "tvShowFavorite", "Lcom/zeroemotion/tmdb_made/core/domain/model/TvShow;", "getTvShowFavorite", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> movieFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> tvShowFavorite = null;
    private final com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>> getMovieFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.TvShow>> getTvShowFavorite() {
        return null;
    }
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
}