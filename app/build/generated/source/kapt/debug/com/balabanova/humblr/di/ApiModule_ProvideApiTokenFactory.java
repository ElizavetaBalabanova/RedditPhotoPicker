// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.di;

import com.balabanova.humblr.data.api.ApiToken;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ApiModule_ProvideApiTokenFactory implements Factory<ApiToken> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideApiTokenFactory(ApiModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiToken get() {
    return provideApiToken(module, retrofitProvider.get());
  }

  public static ApiModule_ProvideApiTokenFactory create(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideApiTokenFactory(module, retrofitProvider);
  }

  public static ApiToken provideApiToken(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiToken(retrofit));
  }
}
