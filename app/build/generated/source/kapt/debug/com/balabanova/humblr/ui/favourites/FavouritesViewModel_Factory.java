// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.ui.favourites;

import com.balabanova.humblr.domain.repository.SubredditsRemoteRepository;
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
public final class FavouritesViewModel_Factory implements Factory<FavouritesViewModel> {
  private final Provider<SubredditsRemoteRepository> repositoryProvider;

  public FavouritesViewModel_Factory(Provider<SubredditsRemoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavouritesViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static FavouritesViewModel_Factory create(
      Provider<SubredditsRemoteRepository> repositoryProvider) {
    return new FavouritesViewModel_Factory(repositoryProvider);
  }

  public static FavouritesViewModel newInstance(SubredditsRemoteRepository repository) {
    return new FavouritesViewModel(repository);
  }
}
