package com.balabanova.humblr.ui.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.balabanova.humblr.R

public class FriendsFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationFriendsToNavigationProfile(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_friends_to_navigation_profile)
  }
}
