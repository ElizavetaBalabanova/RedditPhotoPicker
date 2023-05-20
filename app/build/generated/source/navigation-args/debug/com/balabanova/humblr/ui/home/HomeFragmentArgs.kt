package com.balabanova.humblr.ui.home

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class HomeFragmentArgs(
  public val code: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("code", this.code)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("code", this.code)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): HomeFragmentArgs {
      bundle.setClassLoader(HomeFragmentArgs::class.java.classLoader)
      val __code : String?
      if (bundle.containsKey("code")) {
        __code = bundle.getString("code")
        if (__code == null) {
          throw IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.")
        }
      } else {
        __code = "\"\""
      }
      return HomeFragmentArgs(__code)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): HomeFragmentArgs {
      val __code : String?
      if (savedStateHandle.contains("code")) {
        __code = savedStateHandle["code"]
        if (__code == null) {
          throw IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value")
        }
      } else {
        __code = "\"\""
      }
      return HomeFragmentArgs(__code)
    }
  }
}
