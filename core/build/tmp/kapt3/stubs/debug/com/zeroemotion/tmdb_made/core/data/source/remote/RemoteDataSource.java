package com.zeroemotion.tmdb_made.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000eJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/network/ApiService;", "(Lcom/zeroemotion/tmdb_made/core/data/source/remote/network/ApiService;)V", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/network/ApiResponse;", "", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTvShow", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/TvShowResponse;", "getTrendingMovie", "Lio/reactivex/Single;", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/ListResponse;", "getTrendingTvShow", "core_debug"})
public final class RemoteDataSource {
    private final com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllMovie(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllTvShow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse>> getTrendingMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse>> getTrendingTvShow() {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiService apiService) {
        super();
    }
}