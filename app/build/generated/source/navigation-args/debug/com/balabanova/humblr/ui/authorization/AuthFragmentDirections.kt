package com.balabanova.humblr.ui.authorization

import android.os.Bundle
import androidx.navigation.NavDirections
import com.balabanova.humblr.R
import kotlin.Int
import kotlin.String

public class AuthFragmentDirections private constructor() {
  private data class ActionNavigationAuthToNavigationHome(
    public val code: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_auth_to_navigation_home

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("code", this.code)
        return result
      }
  }

  public companion object {
    public fun actionNavigationAuthToNavigationHome(code: String = "\"\""): NavDirections =
        ActionNavigationAuthToNavigationHome(code)
  }
}
