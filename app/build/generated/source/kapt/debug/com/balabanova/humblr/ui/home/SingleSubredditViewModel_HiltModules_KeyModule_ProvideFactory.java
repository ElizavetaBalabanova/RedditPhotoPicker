// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.ui.home;

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
public final class SingleSubredditViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static SingleSubredditViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(SingleSubredditViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final SingleSubredditViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SingleSubredditViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}