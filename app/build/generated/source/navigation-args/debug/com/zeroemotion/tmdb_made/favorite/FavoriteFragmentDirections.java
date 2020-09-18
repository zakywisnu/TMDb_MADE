package com.zeroemotion.tmdb_made.favorite;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.zeroemotion.tmdb_made.R;
import com.zeroemotion.tmdb_made.core.domain.model.Movie;
import com.zeroemotion.tmdb_made.core.domain.model.TvShow;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoriteFragmentDirections {
  private FavoriteFragmentDirections() {
  }

  @NonNull
  public static ActionFavoriteToDetailMovie actionFavoriteToDetailMovie(@NonNull Movie movies) {
    return new ActionFavoriteToDetailMovie(movies);
  }

  @NonNull
  public static ActionFavoriteToDetailTvShow actionFavoriteToDetailTvShow(@NonNull TvShow tvshow) {
    return new ActionFavoriteToDetailTvShow(tvshow);
  }

  public static class ActionFavoriteToDetailMovie implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFavoriteToDetailMovie(@NonNull Movie movies) {
      if (movies == null) {
        throw new IllegalArgumentException("Argument \"movies\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movies", movies);
    }

    @NonNull
    public ActionFavoriteToDetailMovie setMovies(@NonNull Movie movies) {
      if (movies == null) {
        throw new IllegalArgumentException("Argument \"movies\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movies", movies);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.actionFavoriteToDetailMovie;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Movie getMovies() {
      return (Movie) arguments.get("movies");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFavoriteToDetailMovie that = (ActionFavoriteToDetailMovie) object;
      if (arguments.containsKey("movies") != that.arguments.containsKey("movies")) {
        return false;
      }
      if (getMovies() != null ? !getMovies().equals(that.getMovies()) : that.getMovies() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMovies() != null ? getMovies().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFavoriteToDetailMovie(actionId=" + getActionId() + "){"
          + "movies=" + getMovies()
          + "}";
    }
  }

  public static class ActionFavoriteToDetailTvShow implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFavoriteToDetailTvShow(@NonNull TvShow tvshow) {
      if (tvshow == null) {
        throw new IllegalArgumentException("Argument \"tvshow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvshow", tvshow);
    }

    @NonNull
    public ActionFavoriteToDetailTvShow setTvshow(@NonNull TvShow tvshow) {
      if (tvshow == null) {
        throw new IllegalArgumentException("Argument \"tvshow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvshow", tvshow);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("tvshow")) {
        TvShow tvshow = (TvShow) arguments.get("tvshow");
        if (Parcelable.class.isAssignableFrom(TvShow.class) || tvshow == null) {
          __result.putParcelable("tvshow", Parcelable.class.cast(tvshow));
        } else if (Serializable.class.isAssignableFrom(TvShow.class)) {
          __result.putSerializable("tvshow", Serializable.class.cast(tvshow));
        } else {
          throw new UnsupportedOperationException(TvShow.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.actionFavoriteToDetailTvShow;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvShow getTvshow() {
      return (TvShow) arguments.get("tvshow");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFavoriteToDetailTvShow that = (ActionFavoriteToDetailTvShow) object;
      if (arguments.containsKey("tvshow") != that.arguments.containsKey("tvshow")) {
        return false;
      }
      if (getTvshow() != null ? !getTvshow().equals(that.getTvshow()) : that.getTvshow() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTvshow() != null ? getTvshow().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFavoriteToDetailTvShow(actionId=" + getActionId() + "){"
          + "tvshow=" + getTvshow()
          + "}";
    }
  }
}
