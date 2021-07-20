package com.iplant.ui.details

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val plantId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("plantId", this.plantId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __plantId : String?
      if (bundle.containsKey("plantId")) {
        __plantId = bundle.getString("plantId")
        if (__plantId == null) {
          throw IllegalArgumentException("Argument \"plantId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"plantId\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__plantId)
    }
  }
}
