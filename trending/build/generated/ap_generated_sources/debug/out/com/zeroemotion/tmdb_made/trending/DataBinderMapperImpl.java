package com.zeroemotion.tmdb_made.trending;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingBindingImpl;
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingMovieBindingImpl;
import com.zeroemotion.tmdb_made.trending.databinding.FragmentTrendingTvShowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTTRENDING = 1;

  private static final int LAYOUT_FRAGMENTTRENDINGMOVIE = 2;

  private static final int LAYOUT_FRAGMENTTRENDINGTVSHOW = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending, LAYOUT_FRAGMENTTRENDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending_movie, LAYOUT_FRAGMENTTRENDINGMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending_tv_show, LAYOUT_FRAGMENTTRENDINGTVSHOW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTTRENDING: {
          if ("layout/fragment_trending_0".equals(tag)) {
            return new FragmentTrendingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trending is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRENDINGMOVIE: {
          if ("layout/fragment_trending_movie_0".equals(tag)) {
            return new FragmentTrendingMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trending_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRENDINGTVSHOW: {
          if ("layout/fragment_trending_tv_show_0".equals(tag)) {
            return new FragmentTrendingTvShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trending_tv_show is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(0);
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "listener");
      sKeys.put(2, "movie");
      sKeys.put(3, "tvShow");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_trending_0", com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending);
      sKeys.put("layout/fragment_trending_movie_0", com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending_movie);
      sKeys.put("layout/fragment_trending_tv_show_0", com.zeroemotion.tmdb_made.trending.R.layout.fragment_trending_tv_show);
    }
  }
}
