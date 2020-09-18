package com.zeroemotion.tmdb_made.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/zeroemotion/tmdb_made/movie/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;", "(Lcom/zeroemotion/tmdb_made/core/domain/usecase/MovieUseCase;)V", "movieList", "Landroidx/lifecycle/LiveData;", "Lcom/zeroemotion/tmdb_made/core/data/Resource;", "", "Lcom/zeroemotion/tmdb_made/core/domain/model/Movie;", "getMovieList", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>>> movieList = null;
    private final com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.zeroemotion.tmdb_made.core.data.Resource<java.util.List<com.zeroemotion.tmdb_made.core.domain.model.Movie>>> getMovieList() {
        return null;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
}