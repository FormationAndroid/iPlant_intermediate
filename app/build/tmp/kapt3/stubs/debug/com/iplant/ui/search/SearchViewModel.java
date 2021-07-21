package com.iplant.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/iplant/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getApiErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setApiErrorLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "plantsResultLiveData", "", "Lcom/iplant/models/plantsearch/Plant;", "getPlantsResultLiveData", "setPlantsResultLiveData", "searchPlants", "", "query", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.iplant.models.plantsearch.Plant>> plantsResultLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiErrorLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.iplant.models.plantsearch.Plant>> getPlantsResultLiveData() {
        return null;
    }
    
    public final void setPlantsResultLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.iplant.models.plantsearch.Plant>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiErrorLiveData() {
        return null;
    }
    
    public final void setApiErrorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void searchPlants(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public SearchViewModel() {
        super();
    }
}