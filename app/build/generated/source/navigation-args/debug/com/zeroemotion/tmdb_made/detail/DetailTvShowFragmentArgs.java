package com.zeroemotion.tmdb_made.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.zeroemotion.tmdb_made.core.domain.model.TvShow;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailTvShowFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailTvShowFragmentArgs() {
  }

  private DetailTvShowFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailTvShowFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailTvShowFragmentArgs __result = new DetailTvShowFragmentArgs();
    bundle.setClassLoader(DetailTvShowFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("tvshow")) {
      TvShow tvshow;
      if (Parcelable.class.isAssignableFrom(TvShow.class) || Serializable.class.isAssignableFrom(TvShow.class)) {
        tvshow = (TvShow) bundle.get("tvshow");
      } else {
        throw new UnsupportedOperationException(TvShow.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (tvshow == null) {
        throw new IllegalArgumentException("Argument \"tvshow\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("tvshow", tvshow);
    } else {
      throw new IllegalArgumentException("Required argument \"tvshow\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public TvShow getTvshow() {
    return (TvShow) arguments.get("tvshow");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailTvShowFragmentArgs that = (DetailTvShowFragmentArgs) object;
    if (arguments.containsKey("tvshow") != that.arguments.containsKey("tvshow")) {
      return false;
    }
    if (getTvshow() != null ? !getTvshow().equals(that.getTvshow()) : that.getTvshow() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTvshow() != null ? getTvshow().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailTvShowFragmentArgs{"
        + "tvshow=" + getTvshow()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailTvShowFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull TvShow tvshow) {
      if (tvshow == null) {
        throw new IllegalArgumentException("Argument \"tvshow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvshow", tvshow);
    }

    @NonNull
    public DetailTvShowFragmentArgs build() {
      DetailTvShowFragmentArgs result = new DetailTvShowFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTvshow(@NonNull TvShow tvshow) {
      if (tvshow == null) {
        throw new IllegalArgumentException("Argument \"tvshow\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tvshow", tvshow);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvShow getTvshow() {
      return (TvShow) arguments.get("tvshow");
    }
  }
}
