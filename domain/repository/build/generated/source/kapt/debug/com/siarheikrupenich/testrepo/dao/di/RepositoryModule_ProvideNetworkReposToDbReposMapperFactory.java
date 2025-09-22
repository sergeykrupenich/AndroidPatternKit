package com.siarheikrupenich.testrepo.dao.di;

import com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class RepositoryModule_ProvideNetworkReposToDbReposMapperFactory implements Factory<NetworkReposToDbReposMapper> {
  private final RepositoryModule module;

  private RepositoryModule_ProvideNetworkReposToDbReposMapperFactory(RepositoryModule module) {
    this.module = module;
  }

  @Override
  public NetworkReposToDbReposMapper get() {
    return provideNetworkReposToDbReposMapper(module);
  }

  public static RepositoryModule_ProvideNetworkReposToDbReposMapperFactory create(
      RepositoryModule module) {
    return new RepositoryModule_ProvideNetworkReposToDbReposMapperFactory(module);
  }

  public static NetworkReposToDbReposMapper provideNetworkReposToDbReposMapper(
      RepositoryModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideNetworkReposToDbReposMapper());
  }
}
