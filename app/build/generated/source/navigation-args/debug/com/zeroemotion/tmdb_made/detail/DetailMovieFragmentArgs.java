package com.zeroemotion.tmdb_made.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.zeroemotion.tmdb_made.core.domain.model.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailMovieFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailMovieFragmentArgs() {
  }

  private DetailMovieFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailMovieFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailMovieFragmentArgs __result = new DetailMovieFragmentArgs();
    bundle.setClassLoader(DetailMovieFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movies")) {
      Movie movies;
      if (Parcelable.class.isAssignableFrom(Movie.class) || Serializable.class.isAssignableFrom(Movie.class)) {
        movies = (Movie) bundle.get("movies");
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (movies == null) {
        throw new IllegalArgumentException("Argument \"movies\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("movies", movies);
    } else {
      throw new IllegalArgumentException("Required argument \"movies\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Movie getMovies() {
    return (Movie) arguments.get("movies");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("movies")) {
      Movie movies = (Movie) arguments.get("movies");
      if (Parcelable.class.isAssignableFrom(Movie.class) || movies == null) {
        __result.putParcelable("movies", Parcelable.class.cast(movies));
      } else if (Serializable.class.isAssignableFrom(Movie.class)) {
        __result.putSerializable("movies", Serializable.class.cast(movies));
      } else {
        throw new UnsupportedOperationException(Movie.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailMovieFragmentArgs that = (DetailMovieFragmentArgs) object;
    if (arguments.containsKey("movies") != that.arguments.containsKey("movies")) {
      return false;
    }
    if (getMovies() != null ? !getMovies().equals(that.getMovies()) : that.getMovies() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMovies() != null ? getMovies().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailMovieFragmentArgs{"
        + "movies=" + getMovies()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailMovieFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Movie movies) {
      if (movies == null) {
        throw new IllegalArgumentException("Argument \"movies\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movies", movies);
    }

    @NonNull
    public DetailMovieFragmentArgs build() {
      DetailMovieFragmentArgs result = new DetailMovieFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMovies(@NonNull Movie movies) {
      if (movies == null) {
        throw new IllegalArgumentException("Argument \"movies\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movies", movies);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getMovies() {
      return (Movie) arguments.get("movies");
    }
  }
}
