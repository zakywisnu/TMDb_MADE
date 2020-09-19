package com.zeroemotion.tmdb_made.splashscreen;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.zeroemotion.tmdb_made.R;

public class SplashScreenFragmentDirections {
  private SplashScreenFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionToHome() {
    return new ActionOnlyNavDirections(R.id.actionToHome);
  }
}
