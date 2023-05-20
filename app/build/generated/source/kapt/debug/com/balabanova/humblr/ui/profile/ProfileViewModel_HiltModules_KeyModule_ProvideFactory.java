// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.ui.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ProfileViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ProfileViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ProfileViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ProfileViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ProfileViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
