package com.balabanova.humblr.ui.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.balabanova.humblr.R

public class OnboardingFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationOnboardingToNavigationAuth(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_onboarding_to_navigation_auth)
  }
}
