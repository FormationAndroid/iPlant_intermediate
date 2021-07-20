package com.iplant.ui.search

import android.os.Bundle
import androidx.navigation.NavDirections
import com.iplant.R
import kotlin.Int
import kotlin.String

public class SearchFragmentDirections private constructor() {
  private data class ActionNavigationSearchToDetailsFragment(
    public val plantId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_navigation_search_to_detailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("plantId", this.plantId)
      return result
    }
  }

  public companion object {
    public fun actionNavigationSearchToDetailsFragment(plantId: String): NavDirections =
        ActionNavigationSearchToDetailsFragment(plantId)
  }
}
