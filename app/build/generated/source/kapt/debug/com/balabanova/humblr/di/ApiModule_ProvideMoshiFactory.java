// Generated by Dagger (https://dagger.dev).
package com.balabanova.humblr.di;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ApiModule_ProvideMoshiFactory implements Factory<Moshi> {
  private final ApiModule module;

  public ApiModule_ProvideMoshiFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public Moshi get() {
    return provideMoshi(module);
  }

  public static ApiModule_ProvideMoshiFactory create(ApiModule module) {
    return new ApiModule_ProvideMoshiFactory(module);
  }

  public static Moshi provideMoshi(ApiModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoshi());
  }
}
