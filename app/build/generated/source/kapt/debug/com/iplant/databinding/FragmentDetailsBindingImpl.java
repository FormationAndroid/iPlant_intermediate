package com.iplant.databinding;
import com.iplant.R;
import com.iplant.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline3, 4);
        sViewsWithIds.put(R.id.guideline4, 5);
        sViewsWithIds.put(R.id.button20, 6);
        sViewsWithIds.put(R.id.guideline5, 7);
        sViewsWithIds.put(R.id.imageView, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imageView3.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
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
            setPlant((com.iplant.models.plant.PlantDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlant(@Nullable com.iplant.models.plant.PlantDetails Plant) {
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
        java.lang.String plantMainSpeciesImageUrl = null;
        java.lang.String plantCommonName = null;
        com.iplant.models.plant.PlantDetails plant = mPlant;
        java.util.List<com.iplant.models.plant.Source> plantSources = null;
        java.lang.String plantSourcesGetInt0Citation = null;
        com.iplant.models.plant.MainSpecies plantMainSpecies = null;
        com.iplant.models.plant.Source plantSourcesGetInt0 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (plant != null) {
                    // read plant.commonName
                    plantCommonName = plant.getCommonName();
                    // read plant.sources
                    plantSources = plant.getSources();
                    // read plant.mainSpecies
                    plantMainSpecies = plant.getMainSpecies();
                }


                if (plantSources != null) {
                    // read plant.sources.get(0)
                    plantSourcesGetInt0 = plantSources.get(0);
                }
                if (plantMainSpecies != null) {
                    // read plant.mainSpecies.imageUrl
                    plantMainSpeciesImageUrl = plantMainSpecies.getImageUrl();
                }


                if (plantSourcesGetInt0 != null) {
                    // read plant.sources.get(0).citation
                    plantSourcesGetInt0Citation = plantSourcesGetInt0.getCitation();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.iplant.adapters.binding.ImagesBindingAdaptersKt.loadImage(this.imageView3, plantMainSpeciesImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, plantCommonName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, plantSourcesGetInt0Citation);
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