package com.zeroemotion.tmdb_made.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/data/source/remote/network/ApiService;", "", "getMovie", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/ListResponse;", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/MovieResponse;", "api_key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovie", "Lio/reactivex/Single;", "getTrendingTvShow", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/response/TvShowResponse;", "getTvShow", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/movie/popular?")
    public abstract java.lang.Object getMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/3/tv/popular?")
    public abstract java.lang.Object getTvShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/trending/movie/day?")
    public abstract io.reactivex.Single<com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.MovieResponse>> getTrendingMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/trending/tv/day?")
    public abstract io.reactivex.Single<com.zeroemotion.tmdb_made.core.data.source.remote.response.ListResponse<com.zeroemotion.tmdb_made.core.data.source.remote.response.TvShowResponse>> getTrendingTvShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key);
}