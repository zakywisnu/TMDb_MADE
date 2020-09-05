package com.zeroemotion.tmdb_made.core.di

import androidx.room.Room
import com.zeroemotion.tmdb_made.core.data.MovieRepository
import com.zeroemotion.tmdb_made.core.data.source.local.LocalDataSource
import com.zeroemotion.tmdb_made.core.data.source.local.room.MovieDatabase
import com.zeroemotion.tmdb_made.core.data.source.remote.RemoteDataSource
import com.zeroemotion.tmdb_made.core.data.source.remote.network.ApiService
import com.zeroemotion.tmdb_made.core.domain.repository.IMovieRepository
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieInteractor
import com.zeroemotion.tmdb_made.core.domain.usecase.MovieUseCase
import com.zeroemotion.tmdb_made.core.utils.AppExecutors
import com.zeroemotion.tmdb_made.core.utils.MovieConstant.BASE_URL
import io.reactivex.plugins.RxJavaPlugins
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val databaseModule = module {
    factory { get<MovieDatabase>().movieDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            MovieDatabase::class.java, "tmdb.db"
        ).fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }
    single {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(get())
            .build()
        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { LocalDataSource(get()) }
    single { RemoteDataSource(get()) }
    factory { AppExecutors() }
    single<IMovieRepository> { MovieRepository(get(), get(), get()) }
}

val useCaseModule = module {
    factory <MovieUseCase> { MovieInteractor(get()) }
}