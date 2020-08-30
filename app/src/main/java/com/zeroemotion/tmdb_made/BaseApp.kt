package com.zeroemotion.tmdb_made

import android.app.Application
import com.zeroemotion.tmdb_made.core.di.databaseModule
import com.zeroemotion.tmdb_made.core.di.networkModule
import com.zeroemotion.tmdb_made.core.di.repositoryModule
import com.zeroemotion.tmdb_made.core.di.useCaseModule
import com.zeroemotion.tmdb_made.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@BaseApp)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}