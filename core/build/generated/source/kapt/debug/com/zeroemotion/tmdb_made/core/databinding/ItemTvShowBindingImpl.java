package com.zeroemotion.tmdb_made.core.databinding;
import com.zeroemotion.tmdb_made.core.R;
import com.zeroemotion.tmdb_made.core.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTvShowBindingImpl extends ItemTvShowBinding  {

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

    public ItemTvShowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemTvShowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Space) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvShowId.setTag(null);
        this.tvShowImage.setTag(null);
        this.tvShowRelease.setTag(null);
        this.tvShowTitle.setTag(null);
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
        if (BR.listener == variableId) {
            setListener((com.zeroemotion.tmdb_made.core.utils.CustomOnClick) variable);
        }
        else if (BR.tvShow == variableId) {
            setTvShow((com.zeroemotion.tmdb_made.core.domain.model.TvShow) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable com.zeroemotion.tmdb_made.core.utils.CustomOnClick Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setTvShow(@Nullable com.zeroemotion.tmdb_made.core.domain.model.TvShow TvShow) {
        this.mTvShow = TvShow;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.String tvShowName = null;
        android.view.View.OnClickListener listenerOnClickedAndroidViewViewOnClickListener = null;
        int TvShowId1 = 0;
        java.lang.String tvShowFirstAirDate = null;
        com.zeroemotion.tmdb_made.core.utils.CustomOnClick listener = mListener;
        com.zeroemotion.tmdb_made.core.domain.model.TvShow tvShow = mTvShow;
        java.lang.String stringValueOfTvShowId = null;
        java.lang.String tvShowPosterPath = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (listener != null) {
                    // read listener::onClicked
                    listenerOnClickedAndroidViewViewOnClickListener = (((mListenerOnClickedAndroidViewViewOnClickListener == null) ? (mListenerOnClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickedAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (tvShow != null) {
                    // read tvShow.name
                    tvShowName = tvShow.getName();
                    // read tvShow.id
                    TvShowId1 = tvShow.getId();
                    // read tvShow.firstAirDate
                    tvShowFirstAirDate = tvShow.getFirstAirDate();
                    // read tvShow.posterPath
                    tvShowPosterPath = tvShow.getPosterPath();
                }


                // read String.valueOf(tvShow.id)
                stringValueOfTvShowId = java.lang.String.valueOf(TvShowId1);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setTag(TvShowId1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvShowId, stringValueOfTvShowId);
            com.zeroemotion.tmdb_made.core.utils.UtilsKt.loadImage(this.tvShowImage, tvShowPosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvShowRelease, tvShowFirstAirDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvShowTitle, tvShowName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
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
        flag 0 (0x1L): listener
        flag 1 (0x2L): tvShow
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}