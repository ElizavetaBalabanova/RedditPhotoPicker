package com.balabanova.humblr.ui.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.balabanova.humblr.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionNavigationHomeToNavigationSingleSubredditFragment(
    public val name: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_navigation_home_to_navigation_single_subreddit_fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    public fun actionNavigationHomeToNavigationSingleSubredditFragment(name: String): NavDirections
        = ActionNavigationHomeToNavigationSingleSubredditFragment(name)
  }
}
