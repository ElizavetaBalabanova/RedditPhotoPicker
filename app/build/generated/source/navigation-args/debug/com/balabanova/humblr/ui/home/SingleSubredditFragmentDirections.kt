package com.balabanova.humblr.ui.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.balabanova.humblr.R
import kotlin.Int
import kotlin.String

public class SingleSubredditFragmentDirections private constructor() {
  private data class ActionNavigationSingleSubredditToNavigationHome(
    public val code: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_single_subreddit_to_navigation_home

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("code", this.code)
        return result
      }
  }

  private data class ActionNavigationSingleSubredditToNavigationUser(
    public val name: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_single_subreddit_to_navigation_user

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    public fun actionNavigationSingleSubredditToNavigationHome(code: String = "\"\""): NavDirections
        = ActionNavigationSingleSubredditToNavigationHome(code)

    public fun actionNavigationSingleSubredditToNavigationUser(name: String = ""): NavDirections =
        ActionNavigationSingleSubredditToNavigationUser(name)
  }
}
