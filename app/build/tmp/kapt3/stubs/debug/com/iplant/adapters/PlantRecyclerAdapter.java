package com.iplant.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/iplant/adapters/PlantRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iplant/adapters/PlantRecyclerAdapter$UserViewHolder;", "plants", "", "Lcom/iplant/models/Plant;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UserViewHolder", "app_debug"})
public final class PlantRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.iplant.adapters.PlantRecyclerAdapter.UserViewHolder> {
    private final java.util.List<com.iplant.models.Plant> plants = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.iplant.adapters.PlantRecyclerAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iplant.adapters.PlantRecyclerAdapter.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PlantRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iplant.models.Plant> plants) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/iplant/adapters/PlantRecyclerAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iplant/databinding/ItemPlantBinding;", "(Lcom/iplant/adapters/PlantRecyclerAdapter;Lcom/iplant/databinding/ItemPlantBinding;)V", "bind", "", "plant", "Lcom/iplant/models/Plant;", "app_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.iplant.databinding.ItemPlantBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.iplant.models.Plant plant) {
        }
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.iplant.databinding.ItemPlantBinding binding) {
            super(null);
        }
    }
}