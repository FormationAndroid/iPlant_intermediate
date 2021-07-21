package com.iplant.databinding;
import com.iplant.R;
import com.iplant.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPlantBindingImpl extends ItemPlantBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPlantBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemPlantBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.imageViewPlant.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.textView3.setTag(null);
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
        if (BR.plant == variableId) {
            setPlant((com.iplant.models.plantsearch.Plant) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlant(@Nullable com.iplant.models.plantsearch.Plant Plant) {
        this.mPlant = Plant;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.plant);
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
        com.iplant.models.plantsearch.Plant plant = mPlant;
        java.lang.String plantScientificName = null;
        java.lang.String plantImageUrl = null;
        java.lang.String plantFamily = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (plant != null) {
                    // read plant.scientificName
                    plantScientificName = plant.getScientificName();
                    // read plant.imageUrl
                    plantImageUrl = plant.getImageUrl();
                    // read plant.family
                    plantFamily = plant.getFamily();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.iplant.adapters.binding.ImagesBindingAdaptersKt.loadImage(this.imageViewPlant, plantImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, plantScientificName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, plantFamily);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): plant
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}