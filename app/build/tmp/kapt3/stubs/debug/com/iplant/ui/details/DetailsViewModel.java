package com.iplant.ui.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/iplant/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getApiErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setApiErrorLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "idPlantLiveData", "getIdPlantLiveData", "plantDetailsResultLiveData", "Lcom/iplant/models/plant/PlantDetails;", "getPlantDetailsResultLiveData", "setPlantDetailsResultLiveData", "plantFavoriteLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/iplant/models/plantsearch/Plant;", "getPlantFavoriteLiveData", "()Landroidx/lifecycle/LiveData;", "addOrRemoveFromFavorite", "", "getPlantDetails", "plantId", "setIdPlant", "idPlant", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.iplant.models.plant.PlantDetails> plantDetailsResultLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiErrorLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> idPlantLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.iplant.models.plantsearch.Plant> plantFavoriteLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.iplant.models.plant.PlantDetails> getPlantDetailsResultLiveData() {
        return null;
    }
    
    public final void setPlantDetailsResultLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.iplant.models.plant.PlantDetails> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiErrorLiveData() {
        return null;
    }
    
    public final void setApiErrorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void getPlantDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String plantId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getIdPlantLiveData() {
        return null;
    }
    
    public final void setIdPlant(@org.jetbrains.annotations.NotNull()
    java.lang.String idPlant) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.iplant.models.plantsearch.Plant> getPlantFavoriteLiveData() {
        return null;
    }
    
    public final void addOrRemoveFromFavorite() {
    }
    
    public DetailsViewModel() {
        super();
    }
}