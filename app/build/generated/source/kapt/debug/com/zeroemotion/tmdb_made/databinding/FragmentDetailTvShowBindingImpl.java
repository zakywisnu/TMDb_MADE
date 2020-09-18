package com.zeroemotion.tmdb_made.databinding;
import com.zeroemotion.tmdb_made.R;
import com.zeroemotion.tmdb_made.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailTvShowBindingImpl extends FragmentDetailTvShowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_tvshow, 6);
        sViewsWithIds.put(R.id.fab_tv_show, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailTvShowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentDetailTvShowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            );
        this.detailTvShowImage.setTag(null);
        this.detailTvShowOverview.setTag(null);
        this.detailTvShowRelease.setTag(null);
        this.detailTvShowTitle.setTag(null);
        this.detailTvShowVote.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.tvShow == variableId) {
            setTvShow((com.zeroemotion.tmdb_made.core.domain.model.TvShow) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTvShow(@Nullable com.zeroemotion.tmdb_made.core.domain.model.TvShow TvShow) {
        this.mTvShow = TvShow;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tvShow);
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
        java.lang.String tvShowOverview = null;
        java.lang.String tvShowName = null;
        java.lang.String tvShowVoteAverage = null;
        java.lang.String tvShowFirstAirDate = null;
        com.zeroemotion.tmdb_made.core.domain.model.TvShow tvShow = mTvShow;
        java.lang.String tvShowPosterPath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tvShow != null) {
                    // read tvShow.overview
                    tvShowOverview = tvShow.getOverview();
                    // read tvShow.name
                    tvShowName = tvShow.getName();
                    // read tvShow.voteAverage
                    tvShowVoteAverage = tvShow.getVoteAverage();
                    // read tvShow.firstAirDate
                    tvShowFirstAirDate = tvShow.getFirstAirDate();
                    // read tvShow.posterPath
                    tvShowPosterPath = tvShow.getPosterPath();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.zeroemotion.tmdb_made.core.utils.UtilsKt.loadImage(this.detailTvShowImage, tvShowPosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailTvShowOverview, tvShowOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailTvShowRelease, tvShowFirstAirDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailTvShowTitle, tvShowName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailTvShowVote, tvShowVoteAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tvShow
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}