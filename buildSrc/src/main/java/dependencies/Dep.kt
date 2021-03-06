package dependencies

object Dep {
    const val tagEditText = "com.github.mabbas007:TagsEditText:1.0.5"
    const val material = "com.google.android.material:material:1.1.0"
    const val mediaPicker = "com.github.kimdohun0104:MediaPicker:1.1.0"

    object GradlePlugin {
        const val gradle = "com.android.tools.build:gradle:3.5.3"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        const val googleService = "com.google.gms:google-services:4.3.3"
        const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.version}"
    }

    object Kotlin {
        const val version = "1.3.61"
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$version"

        const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        const val viewPager = "androidx.viewpager2:viewpager2:1.0.0"

        object Room {
            private const val version = "2.2.3"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
        }

        object Navigation {
            const val version = "2.3.0-alpha01"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
            const val dynamicFeature = "androidx.navigation:navigation-dynamic-features-fragment:$version"
        }

        object LifeCycle {
            private const val version = "2.2.0"
            const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val roomKtx = "androidx.lifecycle:lifecycle-room-ktx:$version"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
        }

        object Koin {
            private const val version = "2.1.0"
            const val viewModel = "org.koin:koin-androidx-viewmodel:$version"
        }
    }

    object Firebase {
        const val storage = "com.google.firebase:firebase-storage:19.1.1"
        const val auth = "com.google.firebase:firebase-auth:19.1.0"
    }

    object Retrofit {
        private const val version = "2.7.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val gson = "com.squareup.retrofit2:converter-gson:$version"
    }

    object OkHttp {
        const val logging = "com.squareup.okhttp3:logging-interceptor:4.3.1"
    }

    object Groupie {
        private const val version = "2.7.0"
        const val groupie = "com.xwray:groupie:$version"
        const val dataBinding = "com.xwray:groupie-databinding:$version"
    }

    object Glide {
        private const val version = "4.11.0"
        const val glide = "com.github.bumptech.glide:glide:$version"
        const val compiler = "com.github.bumptech.glide:compiler:$version"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val mockitoCore = "org.mockito:mockito-core:2.21.0"
        const val mockitoInline = "org.mockito:mockito-inline:3.2.4"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.3"
        const val coreTesting = "androidx.arch.core:core-testing:2.1.0"
        const val liveDataTesting = "com.jraska.livedata:testing-ktx:1.1.0"
    }
}
