package com.zeroemotion.tmdb_made.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/utils/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "networkIO", "mainThread", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "Companion", "MainThreadExecutor", "core_debug"})
public final class AppExecutors {
    private final java.util.concurrent.Executor diskIO = null;
    private final java.util.concurrent.Executor networkIO = null;
    private final java.util.concurrent.Executor mainThread = null;
    private static final int THREAD_COUNT = 3;
    public static final com.zeroemotion.tmdb_made.core.utils.AppExecutors.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor diskIO() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public AppExecutors(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor diskIO, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor networkIO, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor mainThread) {
        super();
    }
    
    public AppExecutors() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/utils/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "core_debug"})
    static final class MainThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mainThreadHandler = null;
        
        @java.lang.Override()
        public void execute(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable command) {
        }
        
        public MainThreadExecutor() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/zeroemotion/tmdb_made/core/utils/AppExecutors$Companion;", "", "()V", "THREAD_COUNT", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}