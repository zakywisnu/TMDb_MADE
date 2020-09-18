package com.zeroemotion.tmdb_made.core.databinding;
import com.zeroemotion.tmdb_made.core.R;
import com.zeroemotion.tmdb_made.core.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMovieBindingImpl extends ItemMovieBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_space, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Space) bindings[5]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.movieId.setTag(null);
        this.movieImage.setTag(null);
        this.movieRelease.setTag(null);
        this.movieTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movie == variableId) {
            setMovie((com.zeroemotion.tmdb_made.core.domain.model.Movie) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.zeroemotion.tmdb_made.core.utils.CustomOnClick) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.zeroemotion.tmdb_made.core.domain.model.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setListener(@Nullable com.zeroemotion.tmdb_made.core.utils.CustomOnClick Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String MovieTitle1 = null;
        java.lang.String movieReleaseDate = null;
        java.lang.String stringValueOfMovieId = null;
        com.zeroemotion.tmdb_made.core.domain.model.Movie movie = mMovie;
        android.view.View.OnClickListener listenerOnClickedAndroidViewViewOnClickListener = null;
        java.lang.String moviePosterPath = null;
        com.zeroemotion.tmdb_made.core.utils.CustomOnClick listener = mListener;
        int MovieId1 = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.title
                    MovieTitle1 = movie.getTitle();
                    // read movie.releaseDate
                    movieReleaseDate = movie.getReleaseDate();
                    // read movie.posterPath
                    moviePosterPath = movie.getPosterPath();
                    // read movie.id
                    MovieId1 = movie.getId();
                }


                // read String.valueOf(movie.id)
                stringValueOfMovieId = java.lang.String.valueOf(MovieId1);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (listener != null) {
                    // read listener::onClicked
                    listenerOnClickedAndroidViewViewOnClickListener = (((mListenerOnClickedAndroidViewViewOnClickListener == null) ? (mListenerOnClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickedAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setTag(MovieId1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieId, stringValueOfMovieId);
            com.zeroemotion.tmdb_made.core.utils.UtilsKt.loadImage(this.movieImage, moviePosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRelease, movieReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTitle, MovieTitle1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(listenerOnClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.zeroemotion.tmdb_made.core.utils.CustomOnClick value;
        public OnClickListenerImpl setValue(com.zeroemotion.tmdb_made.core.utils.CustomOnClick value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}