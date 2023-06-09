// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.ui.home;

import com.balabanova.humblr.data.api.ApiToken;
import com.balabanova.humblr.domain.repository.SubredditsRemoteRepository;
import com.balabanova.humblr.domain.storageservice.StorageService;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<SubredditsRemoteRepository> repositoryProvider;

  private final Provider<StorageService> storageServiceProvider;

  private final Provider<ApiToken> apiTokenProvider;

  public HomeViewModel_Factory(Provider<SubredditsRemoteRepository> repositoryProvider,
      Provider<StorageService> storageServiceProvider, Provider<ApiToken> apiTokenProvider) {
    this.repositoryProvider = repositoryProvider;
    this.storageServiceProvider = storageServiceProvider;
    this.apiTokenProvider = apiTokenProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(repositoryProvider.get(), storageServiceProvider.get(), apiTokenProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<SubredditsRemoteRepository> repositoryProvider,
      Provider<StorageService> storageServiceProvider, Provider<ApiToken> apiTokenProvider) {
    return new HomeViewModel_Factory(repositoryProvider, storageServiceProvider, apiTokenProvider);
  }

  public static HomeViewModel newInstance(SubredditsRemoteRepository repository,
      StorageService storageService, ApiToken apiToken) {
    return new HomeViewModel(repository, storageService, apiToken);
  }
}
