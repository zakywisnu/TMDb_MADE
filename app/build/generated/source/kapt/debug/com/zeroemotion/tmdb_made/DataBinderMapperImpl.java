package com.zeroemotion.tmdb_made;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zeroemotion.tmdb_made.databinding.FragmentDetailMovieBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentDetailTvShowBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteMovieBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentFavoriteTvShowBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentHomeBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentMovieBindingImpl;
import com.zeroemotion.tmdb_made.databinding.FragmentTvShowBindingImpl;
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
  private static final int LAYOUT_FRAGMENTDETAILMOVIE = 1;

  private static final int LAYOUT_FRAGMENTDETAILTVSHOW = 2;

  private static final int LAYOUT_FRAGMENTFAVORITE = 3;

  private static final int LAYOUT_FRAGMENTFAVORITEMOVIE = 4;

  private static final int LAYOUT_FRAGMENTFAVORITETVSHOW = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTMOVIE = 7;

  private static final int LAYOUT_FRAGMENTTVSHOW = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_detail_movie, LAYOUT_FRAGMENTDETAILMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_detail_tv_show, LAYOUT_FRAGMENTDETAILTVSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_favorite_movie, LAYOUT_FRAGMENTFAVORITEMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_favorite_tv_show, LAYOUT_FRAGMENTFAVORITETVSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_movie, LAYOUT_FRAGMENTMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zeroemotion.tmdb_made.R.layout.fragment_tv_show, LAYOUT_FRAGMENTTVSHOW);
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
        case  LAYOUT_FRAGMENTDETAILMOVIE: {
          if ("layout/fragment_detail_movie_0".equals(tag)) {
            return new FragmentDetailMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILTVSHOW: {
          if ("layout/fragment_detail_tv_show_0".equals(tag)) {
            return new FragmentDetailTvShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_tv_show is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITEMOVIE: {
          if ("layout/fragment_favorite_movie_0".equals(tag)) {
            return new FragmentFavoriteMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITETVSHOW: {
          if ("layout/fragment_favorite_tv_show_0".equals(tag)) {
            return new FragmentFavoriteTvShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_tv_show is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIE: {
          if ("layout/fragment_movie_0".equals(tag)) {
            return new FragmentMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTVSHOW: {
          if ("layout/fragment_tv_show_0".equals(tag)) {
            return new FragmentTvShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tv_show is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.zeroemotion.tmdb_made.core.DataBinderMapperImpl());
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/fragment_detail_movie_0", com.zeroemotion.tmdb_made.R.layout.fragment_detail_movie);
      sKeys.put("layout/fragment_detail_tv_show_0", com.zeroemotion.tmdb_made.R.layout.fragment_detail_tv_show);
      sKeys.put("layout/fragment_favorite_0", com.zeroemotion.tmdb_made.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_favorite_movie_0", com.zeroemotion.tmdb_made.R.layout.fragment_favorite_movie);
      sKeys.put("layout/fragment_favorite_tv_show_0", com.zeroemotion.tmdb_made.R.layout.fragment_favorite_tv_show);
      sKeys.put("layout/fragment_home_0", com.zeroemotion.tmdb_made.R.layout.fragment_home);
      sKeys.put("layout/fragment_movie_0", com.zeroemotion.tmdb_made.R.layout.fragment_movie);
      sKeys.put("layout/fragment_tv_show_0", com.zeroemotion.tmdb_made.R.layout.fragment_tv_show);
    }
  }
}
