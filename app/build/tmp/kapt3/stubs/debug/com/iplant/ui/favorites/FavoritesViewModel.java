package com.iplant.ui.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/iplant/ui/favorites/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getLastQuestionsError", "Landroidx/lifecycle/MutableLiveData;", "", "getGetLastQuestionsError", "()Landroidx/lifecycle/MutableLiveData;", "getLastQuestionsSuccess", "Lcom/iplant/models/stackoverflow/Questions;", "getGetLastQuestionsSuccess", "getLastQuestions", "", "app_debug"})
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.iplant.models.stackoverflow.Questions> getLastQuestionsSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getLastQuestionsError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.iplant.models.stackoverflow.Questions> getGetLastQuestionsSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGetLastQuestionsError() {
        return null;
    }
    
    public final void getLastQuestions() {
    }
    
    public FavoritesViewModel() {
        super();
    }
}