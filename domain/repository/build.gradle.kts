plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.siarheikrupenich.testrepo.domain.repository"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.gson)

    implementation(libs.hilt)
    kapt(libs.hilt.kapt)

    implementation(project(Modules.core_common))
    implementation(project(Modules.core_network))
    implementation(libs.androidx.room.common)
}