object Dependencies {

    object Compose {
        private const val activityComposeVersion = "1.4.0"
        const val activity = "androidx.activity:activity-compose:$activityComposeVersion"

        const val composeVersion = "1.0.1"
        const val ui = "androidx.compose.ui:ui:$composeVersion"
        const val material = "androidx.compose.material:material:$composeVersion"
        const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"

        private const val navigationVersion = "2.4.0-alpha04"
        const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

        private const val hiltNavigationComposeVersion = "1.0.0-alpha03"
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
    }

    object ComposeTest {
        const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeVersion}"
    }

    object Kotlin {
        const val version = "1.5.21"
    }

    object Hilt {
        const val hiltVersion = "2.37"
        const val android = "com.google.dagger:hilt-android:$hiltVersion"
        const val compiler = "com.google.dagger:hilt-compiler:$hiltVersion"
    }

    object HiltTest {
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:${Hilt.hiltVersion}"
    }

    object SqlDelight {

        const val version = "1.5.1"
        const val runtime = "com.squareup.sqldelight:runtime:${version}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${version}"

        const val plugin = "com.squareup.sqldelight"
    }

    object Google {
        private const val materialVersion = "1.4.0"
        const val material = "com.google.android.material:material:$materialVersion"

    }

    object AndroidX {
        private const val coreKtxVersion = "1.6.0"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

        private const val appCompatVersion = "1.3.0"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

        private const val lifecycleVmKtxVersion = "2.4.0-alpha02"
        const val lifecycleVmKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVmKtxVersion"
    }

    object AndroidXTest {
        private const val version = "1.3.0"
        const val runner = "androidx.test:runner:$version"
    }
}