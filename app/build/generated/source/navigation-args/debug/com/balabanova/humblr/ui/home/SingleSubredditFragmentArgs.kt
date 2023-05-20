package com.balabanova.humblr.ui.home

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SingleSubredditFragmentArgs(
  public val name: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("name", this.name)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("name", this.name)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SingleSubredditFragmentArgs {
      bundle.setClassLoader(SingleSubredditFragmentArgs::class.java.classLoader)
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue")
      }
      return SingleSubredditFragmentArgs(__name)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SingleSubredditFragmentArgs {
      val __name : String?
      if (savedStateHandle.contains("name")) {
        __name = savedStateHandle["name"]
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue")
      }
      return SingleSubredditFragmentArgs(__name)
    }
  }
}
