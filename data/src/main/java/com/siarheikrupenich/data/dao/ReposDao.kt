package com.siarheikrupenich.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.siarheikrupenich.testrepo.dao.entity.LicenseEntity
import com.siarheikrupenich.testrepo.dao.entity.OwnerEntity
import com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity
import com.siarheikrupenich.testrepo.dao.entity.RepoEntity
import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations

@Dao
interface ReposDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRepos(repos: List<RepoEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOwners(owners: List<OwnerEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLicenses(licenses: List<LicenseEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPermissions(permissions: List<PermissionsEntity>)

    @Transaction
    suspend fun insertReposWithRelations(repos: List<RepoWithRelations>) {
        val repoEntities = repos.map { it.repo }
        val ownerEntities = repos.map { it.owner }
        val licenseEntities = repos.mapNotNull { it.license }
        val permissionsEntities = repos.map { it.permissions }

        insertOwners(ownerEntities)
        insertLicenses(licenseEntities)
        insertPermissions(permissionsEntities)

        val permissions = getPermissions()
        val updatedRepo = repoEntities.map { repo ->
            repo.copy(
                permissionsId = permissions.findLast { it.repoId == repo.id }?.id ?: 0
            )
        }

        insertRepos(updatedRepo)
    }

    @Transaction
    @Query("SELECT * FROM repos")
    suspend fun getReposWithRelations(): List<RepoWithRelations>

    @Query("SELECT * FROM owners")
    suspend fun getOwners(): List<OwnerEntity>

    @Query("SELECT * FROM license")
    suspend fun getLicense(): List<LicenseEntity>

    @Query("SELECT * FROM permissions")
    suspend fun getPermissions(): List<PermissionsEntity>

    @Query("DELETE FROM repos")
    suspend fun clearRepos()
}
