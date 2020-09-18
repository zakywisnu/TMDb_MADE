package com.zeroemotion.tmdb_made.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/zeroemotion/tmdb_made/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;", "(Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;)V", "setFavoriteMovie", "", "movie", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "newStatus", "", "setFavoriteTvShow", "tvShow", "Lcom/zeroemotion/tmdb_made/core/domain/model/TvShow;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase = null;
    
    public final void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.Movie movie, boolean newStatus) {
    }
    
    public final void setFavoriteTvShow(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.model.TvShow tvShow, boolean newStatus) {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
}