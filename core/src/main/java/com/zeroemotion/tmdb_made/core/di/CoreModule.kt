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
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import okhttp3.CertificatePinner
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
        val passPhrase : ByteArray = SQLiteDatabase.getBytes("movies".toCharArray())
        val factory = SupportFactory(passPhrase)
        Room.databaseBuilder(
            androidContext(),
            MovieDatabase::class.java, "tmdb1.db"
        ).fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }
}

val networkModule = module {
    single {
        val hostname = "api.themoviedb.org"
        val certificatePinner = CertificatePinner.Builder()
            .add(hostname, "sha256/nKWcsYrc+y5I8vLf1VGByjbt+Hnasjl+9h8lNKJytoE=")
            .add(hostname, "sha256/HkCBucsA3Tgiby96X7vjb/ojHaE1BrjvZ2+LRdJJd0E=")
            .build()

        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .certificatePinner(certificatePinner)
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