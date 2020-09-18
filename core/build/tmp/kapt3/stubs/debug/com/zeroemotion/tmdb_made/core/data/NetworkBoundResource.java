package com.zeroemotion.tmdb_made.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\u0006H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H$J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0001H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/data/NetworkBoundResource;", "ResultType", "RequestType", "", "()V", "result", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zeroemotion/tmdb_made/core/data/Resource;", "asFlow", "createCall", "Lcom/zeroemotion/tmdb_made/core/data/source/remote/network/ApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromDB", "onFetchFailed", "", "saveCallResult", "data", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldFetch", "", "(Ljava/lang/Object;)Z", "core_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private kotlinx.coroutines.flow.Flow<? extends com.zeroemotion.tmdb_made.core.data.Resource<ResultType>> result;
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract kotlinx.coroutines.flow.Flow<ResultType> loadFromDB();
    
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object createCall(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiResponse<? extends RequestType>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object saveCallResult(RequestType data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.zeroemotion.tmdb_made.core.data.Resource<ResultType>> asFlow() {
        return null;
    }
    
    public NetworkBoundResource() {
        super();
    }
}