package com.balabanova.humblr.ui.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.balabanova.humblr.R

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationProfileToNavigationFriends(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_profile_to_navigation_friends)

    public fun actionNavigationProfileToNavigationAuth(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_profile_to_navigation_auth)
  }
}
