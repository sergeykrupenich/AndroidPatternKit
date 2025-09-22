package com.siarheikrupenich.testrepo.dao.entity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/siarheikrupenich/testrepo/dao/entity/RepoWithRelations;", "", "repo", "Lcom/siarheikrupenich/testrepo/dao/entity/RepoEntity;", "owner", "Lcom/siarheikrupenich/testrepo/dao/entity/OwnerEntity;", "license", "Lcom/siarheikrupenich/testrepo/dao/entity/LicenseEntity;", "permissions", "Lcom/siarheikrupenich/testrepo/dao/entity/PermissionsEntity;", "<init>", "(Lcom/siarheikrupenich/testrepo/dao/entity/RepoEntity;Lcom/siarheikrupenich/testrepo/dao/entity/OwnerEntity;Lcom/siarheikrupenich/testrepo/dao/entity/LicenseEntity;Lcom/siarheikrupenich/testrepo/dao/entity/PermissionsEntity;)V", "getRepo", "()Lcom/siarheikrupenich/testrepo/dao/entity/RepoEntity;", "getOwner", "()Lcom/siarheikrupenich/testrepo/dao/entity/OwnerEntity;", "getLicense", "()Lcom/siarheikrupenich/testrepo/dao/entity/LicenseEntity;", "getPermissions", "()Lcom/siarheikrupenich/testrepo/dao/entity/PermissionsEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "repository_debug"})
public final class RepoWithRelations {
    @androidx.room.Embedded()
    @org.jetbrains.annotations.NotNull()
    private final com.siarheikrupenich.testrepo.dao.entity.RepoEntity repo = null;
    @androidx.room.Relation(parentColumn = "ownerId", entityColumn = "id")
    @org.jetbrains.annotations.NotNull()
    private final com.siarheikrupenich.testrepo.dao.entity.OwnerEntity owner = null;
    @androidx.room.Relation(parentColumn = "licenseKey", entityColumn = "key")
    @org.jetbrains.annotations.Nullable()
    private final com.siarheikrupenich.testrepo.dao.entity.LicenseEntity license = null;
    @androidx.room.Relation(parentColumn = "permissionsId", entityColumn = "id")
    @org.jetbrains.annotations.NotNull()
    private final com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity permissions = null;
    
    public RepoWithRelations(@org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.RepoEntity repo, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.OwnerEntity owner, @org.jetbrains.annotations.Nullable()
    com.siarheikrupenich.testrepo.dao.entity.LicenseEntity license, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity permissions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.RepoEntity getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.OwnerEntity getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siarheikrupenich.testrepo.dao.entity.LicenseEntity getLicense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity getPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.RepoEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.OwnerEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siarheikrupenich.testrepo.dao.entity.LicenseEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations copy(@org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.RepoEntity repo, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.OwnerEntity owner, @org.jetbrains.annotations.Nullable()
    com.siarheikrupenich.testrepo.dao.entity.LicenseEntity license, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity permissions) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}