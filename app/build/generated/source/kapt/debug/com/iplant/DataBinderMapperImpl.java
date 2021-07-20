package com.iplant;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.iplant.databinding.DialogDeleteConfirmationBindingImpl;
import com.iplant.databinding.FragmentDetailsBindingImpl;
import com.iplant.databinding.FragmentFavoritesBindingImpl;
import com.iplant.databinding.FragmentSearchBindingImpl;
import com.iplant.databinding.FragmentSettingsBindingImpl;
import com.iplant.databinding.ItemPlantBindingImpl;
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
  private static final int LAYOUT_DIALOGDELETECONFIRMATION = 1;

  private static final int LAYOUT_FRAGMENTDETAILS = 2;

  private static final int LAYOUT_FRAGMENTFAVORITES = 3;

  private static final int LAYOUT_FRAGMENTSEARCH = 4;

  private static final int LAYOUT_FRAGMENTSETTINGS = 5;

  private static final int LAYOUT_ITEMPLANT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.dialog_delete_confirmation, LAYOUT_DIALOGDELETECONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.iplant.R.layout.item_plant, LAYOUT_ITEMPLANT);
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
        case  LAYOUT_DIALOGDELETECONFIRMATION: {
          if ("layout/dialog_delete_confirmation_0".equals(tag)) {
            return new DialogDeleteConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_delete_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITES: {
          if ("layout/fragment_favorites_0".equals(tag)) {
            return new FragmentFavoritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPLANT: {
          if ("layout/item_plant_0".equals(tag)) {
            return new ItemPlantBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_plant is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "plant");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/dialog_delete_confirmation_0", com.iplant.R.layout.dialog_delete_confirmation);
      sKeys.put("layout/fragment_details_0", com.iplant.R.layout.fragment_details);
      sKeys.put("layout/fragment_favorites_0", com.iplant.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_search_0", com.iplant.R.layout.fragment_search);
      sKeys.put("layout/fragment_settings_0", com.iplant.R.layout.fragment_settings);
      sKeys.put("layout/item_plant_0", com.iplant.R.layout.item_plant);
    }
  }
}
