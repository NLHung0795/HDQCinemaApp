plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

}

android {
    namespace = "com.example.hdqcinema"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.hdqcinema"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") //chạy tác vụ bất đồng bộ (asynchronous) như gọi API mà không chặn giao diện (UI).
    implementation("com.squareup.retrofit2:retrofit:2.9.0") //Là HTTP client giúp bạn gọi REST API, tương tự như fetch() trong JS
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Dùng để tự động chuyển đổi JSON ↔ Kotlin object.
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11") //Ghi log chi tiết request & response HTTP (URL, header, body...).

    implementation("com.github.bumptech.glide:glide:4.16.0") // Hiển thị và tải ảnh từ Internet
    implementation("com.github.ismaeldivita:chip-navigation-bar:1.4.0") // Chip Navigation Bar — Thanh điều hướng đẹp mắt
    implementation("com.github.Dimezis:BlurView:version-2.0.3") // BlurView — Làm mờ nền (hiệu ứng bl   ur)


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}