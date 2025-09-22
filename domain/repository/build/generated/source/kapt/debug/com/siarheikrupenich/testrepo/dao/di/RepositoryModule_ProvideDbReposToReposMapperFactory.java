package com.siarheikrupenich.testrepo.dao.di;

import com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper;
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
public final class RepositoryModule_ProvideDbReposToReposMapperFactory implements Factory<DbReposToReposMapper> {
  private final RepositoryModule module;

  private RepositoryModule_ProvideDbReposToReposMapperFactory(RepositoryModule module) {
    this.module = module;
  }

  @Override
  public DbReposToReposMapper get() {
    return provideDbReposToReposMapper(module);
  }

  public static RepositoryModule_ProvideDbReposToReposMapperFactory create(
      RepositoryModule module) {
    return new RepositoryModule_ProvideDbReposToReposMapperFactory(module);
  }

  public static DbReposToReposMapper provideDbReposToReposMapper(RepositoryModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDbReposToReposMapper());
  }
}
