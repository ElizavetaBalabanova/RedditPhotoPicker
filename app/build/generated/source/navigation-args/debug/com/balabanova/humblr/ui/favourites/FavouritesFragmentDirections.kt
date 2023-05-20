package com.balabanova.humblr.ui.favourites

import android.os.Bundle
import androidx.navigation.NavDirections
import com.balabanova.humblr.R
import kotlin.Int
import kotlin.String

public class FavouritesFragmentDirections private constructor() {
  private data class ActionNavigationFavouritesToNavigationUser(
    public val name: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_favourites_to_navigation_user

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  private data class ActionNavigationFavouritesToNavigationSingleSubredditFragment(
    public val name: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_navigation_favourites_to_navigation_single_subreddit_fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    public fun actionNavigationFavouritesToNavigationUser(name: String = ""): NavDirections =
        ActionNavigationFavouritesToNavigationUser(name)

    public fun actionNavigationFavouritesToNavigationSingleSubredditFragment(name: String):
        NavDirections = ActionNavigationFavouritesToNavigationSingleSubredditFragment(name)
  }
}
