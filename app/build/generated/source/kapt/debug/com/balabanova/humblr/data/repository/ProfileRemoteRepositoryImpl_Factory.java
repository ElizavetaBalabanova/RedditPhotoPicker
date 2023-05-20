// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.data.repository;

import com.balabanova.humblr.data.api.ApiProfile;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ProfileRemoteRepositoryImpl_Factory implements Factory<ProfileRemoteRepositoryImpl> {
  private final Provider<ApiProfile> apiProfileProvider;

  public ProfileRemoteRepositoryImpl_Factory(Provider<ApiProfile> apiProfileProvider) {
    this.apiProfileProvider = apiProfileProvider;
  }

  @Override
  public ProfileRemoteRepositoryImpl get() {
    return newInstance(apiProfileProvider.get());
  }

  public static ProfileRemoteRepositoryImpl_Factory create(
      Provider<ApiProfile> apiProfileProvider) {
    return new ProfileRemoteRepositoryImpl_Factory(apiProfileProvider);
  }

  public static ProfileRemoteRepositoryImpl newInstance(ApiProfile apiProfile) {
    return new ProfileRemoteRepositoryImpl(apiProfile);
  }
}