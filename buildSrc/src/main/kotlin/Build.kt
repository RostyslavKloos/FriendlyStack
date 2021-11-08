object Build {
    private const val androidBuildToolsVersion = "7.1.0-alpha03"
    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.Kotlin.version}"

    const val hiltAndroid = "com.google.dagger:hilt-android-gradle-plugin:${Dependencies.Hilt.hiltVersion}"

    const val sqlDelightGradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Dependencies.SqlDelight.version}"
}