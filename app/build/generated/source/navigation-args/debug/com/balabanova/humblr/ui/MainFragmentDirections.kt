package com.balabanova.humblr.ui

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.balabanova.humblr.R
import kotlin.Int
import kotlin.String

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToNavigationHome(
    public val code: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainFragment_to_navigation_home

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("code", this.code)
        return result
      }
  }

  public companion object {
    public fun actionMainFragmentToNavigationOnboarding(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_navigation_onboarding)

    public fun actionMainFragmentToAuthFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_authFragment)

    public fun actionMainFragmentToNavigationHome(code: String = "\"\""): NavDirections =
        ActionMainFragmentToNavigationHome(code)
  }
}
