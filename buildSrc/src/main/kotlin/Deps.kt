@file:Suppress("SpellCheckingInspection")

import org.gradle.api.Action
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.api.credentials.HttpHeaderCredentials
import org.gradle.authentication.http.HttpHeaderAuthentication

/**
 *  Created by Rain on 2022/9/15
 *
 */

// @formatter:off
object Versions {
    const val kotlin_version                = "1.8.0"
    const val kotlin_coroutines             = "1.6.4"
    const val appcompat                     = "1.4.0-alpha03"
    const val exifinterface                  = "1.3.1"
    const val core_ktx                      = "1.3.2"
    const val toast_compat                  = "1.1.0"
    const val eventbus                      = "3.1.1"
    const val constraintlayout              = "2.1.4"
    const val swiperefreshlayout            = "1.1.0"
    const val recyclerview                  = "1.1.0"
    const val gson                          = "2.10.1"
    const val live_eventbus                 = "1.7.2"
    const val material                      = "1.4.0"
    const val fragment                      = "1.3.0-beta02"
    const val lifecycle                     = "2.3.0-beta01"
    const val activity_ktx                  = "1.2.0-beta02"
    const val annotations                   = "1.6.0"
    const val dynamic_animation             = "1.0.0"
    const val retrofit                       = "2.9.0"
    const val mmkv                          = "1.2.14"
    const val umeng_common                  = "9.5.0"
    const val umeng_asms                    = "1.4.1"
    const val umeng_apm                     = "1.7.0"
    const val umeng_share                   = "7.2.1"
    const val umeng_verify                  = "2.5.7"
    const val umeng_verify_components       = "2.1.4"
    const val umeng_push                    = "6.5.5"
    const val glide                         = "4.11.0"
    const val lottie                        = "3.4.0"
    const val code_locator                  = "2.0.0"
    const val mojito                        = "1.8.7"
    const val commons_codec                 = "1.6"
    const val kotlin_poet                   = "1.8.0"
    const val shadow_version                = "2.3.0"
}

@Suppress("unused")
object Deps {
    const val activity_ktx                  = "androidx.activity:activity-ktx:${Versions.activity_ktx}"
    const val android_annotations           = "androidx.annotation:annotation:${Versions.annotations}"
    const val appcompat                     = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintlayout              = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val core_ktx                      = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val dynamic_animation             = "androidx.dynamicanimation:dynamicanimation:${Versions.dynamic_animation}"
    const val exifinterface                  = "androidx.exifinterface:exifinterface:${Versions.exifinterface}"
    const val fragment_ktx                  = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val fragment                      = "androidx.fragment:fragment:${Versions.fragment}"
    const val lifecycle_livedata_ktx        = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycle_runtime_ktx         = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycle_viewmodel_ktx       = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val recyclerview                  = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val eventbus                      = "org.greenrobot:eventbus:${Versions.eventbus}"
    const val kotlin_reflect                 = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin_version}"
    const val kotlin_stdlib                 = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val kotlin_stdlib_jdk7            = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    const val kotlin_stdlib_jdk8            = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin_version}"
    const val kotlin_stdlib_common          = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin_version}"
    const val kotlin_coroutines_android     = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}"
    const val kotlin_coroutines_core        = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin_coroutines}"
    const val retrofit                       = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_converter             = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mmkv                          = "com.tencent:mmkv:${Versions.mmkv}"
    const val umeng_common                  = "com.umeng.umsdk:common:${Versions.umeng_common}"
    const val material                      = "com.google.android.material:material:${Versions.material}"
    const val umeng_asms                    = "com.umeng.umsdk:asms:${Versions.umeng_asms}"
    const val umeng_apm                     = "com.umeng.umsdk:apm:${Versions.umeng_apm}"
    const val glide                         = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler                = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val lottie                        = "com.airbnb.android:lottie:${Versions.lottie}"
    const val newbieGuide                   = "com.github.huburt-Hu:NewbieGuide:v2.4.4"
    const val umeng_push                    = "com.umeng.umsdk:push:${Versions.umeng_push}"
    const val umeng_uverify                 = "com.umeng.umsdk:uverify:${Versions.umeng_verify}"
    const val umeng_uverify_main            = "com.umeng.umsdk:uverify-main:${Versions.umeng_verify_components}"
    const val umeng_uverify_logger          = "com.umeng.umsdk:uverify-logger:${Versions.umeng_verify_components}"
    const val umeng_uverify_crash           = "com.umeng.umsdk:uverify-crashshield:${Versions.umeng_verify_components}"
    const val umeng_share                   = "com.umeng.umsdk:share-core:${Versions.umeng_share}"
    const val umeng_share_wx                = "com.umeng.umsdk:share-wx:${Versions.umeng_share}"
    const val umeng_share_qq                = "com.umeng.umsdk:share-qq:${Versions.umeng_share}"
    const val phone_input_watcher           = "com.github.jaydroid1024:PhoneTextWatcher:0.0.2"
    const val code_locator                  = "com.bytedance.tools.codelocator:codelocator-core:${Versions.code_locator}"
    const val mojito                        = "com.github.mikaelzero.mojito:mojito:${Versions.mojito}"
    const val mojito_sketch                 = "com.github.mikaelzero.mojito:SketchImageViewLoader:${Versions.mojito}"
    const val mojito_glide                  = "com.github.mikaelzero.mojito:GlideImageLoader:${Versions.mojito}"
    const val common_codec                  = "commons-codec:commons-codec:${Versions.commons_codec}"
    const val umeng_push_huawei_accs        = "com.umeng.umsdk:huawei-umengaccs:1.4.1"
    const val umeng_push_huawei             = "com.huawei.hms:push:6.7.0.300"
    const val umeng_push_xiaomi_accs        = "com.umeng.umsdk:xiaomi-umengaccs:1.3.1"
    const val umeng_push_xiaomi             = "com.umeng.umsdk:xiaomi-push:5.0.8"
    const val umeng_push_vivo_accs          = "com.umeng.umsdk:vivo-umengaccs:1.1.6"
    const val umeng_push_vivo               = "com.umeng.umsdk:vivo-push:3.0.0.4"
    const val umeng_push_oppo_accs          = "com.umeng.umsdk:oppo-umengaccs:1.0.8-fix"
    const val umeng_push_oppo               = "com.umeng.umsdk:oppo-push:3.1.0"
    const val umeng_push_honor_accs         = "com.umeng.umsdk:honor-umengaccs:1.1.0"
    const val umeng_push_honor              = "com.umeng.umsdk:honor-push:7.0.1.103"
    const val sensorsdata                   = "com.sensorsdata.analytics.android:SensorsAnalyticsSDK:6.6.1"
    const val kotlin_poet                   = "com.squareup:kotlinpoet:${Versions.kotlin_poet}"
    const val kotlin_poet_metadata          = "com.squareup:kotlinpoet-metadata:${Versions.kotlin_poet}"
    const val kotlin_poet_metadata_specs    = "com.squareup:kotlinpoet-metadata-specs:${Versions.kotlin_poet}"
    const val shadow_manager                = "com.tencent.shadow.dynamic:manager:${Versions.shadow_version}"
    const val shadow_common                 = "com.tencent.shadow.core:common:${Versions.shadow_version}"
    const val shadow_core_loader            = "com.tencent.shadow.core:loader:${Versions.shadow_version}"
    const val shadow_core_manager           = "com.tencent.shadow.core:manager:${Versions.shadow_version}"
    const val shadow_host                   = "com.tencent.shadow.dynamic:host:${Versions.shadow_version}"
    const val shadow_activity_container     = "com.tencent.shadow.core:activity-container:${Versions.shadow_version}"
    const val shadow_loader_impl            = "com.tencent.shadow.dynamic:loader-impl:${Versions.shadow_version}"
    const val shadow_loader                 = "com.tencent.shadow.dynamic:loader:${Versions.shadow_version}"
    const val shadow_runtime                = "com.tencent.shadow.core:runtime:${Versions.shadow_version}"

    @JvmStatic
    val depsMap = Deps::class.java.fields.toList().map {
        it.get(Deps).toString()
    }.filter {
        it.contains(":")
    }.associate { dep ->
        val endIndex = dep.lastIndexOf(":")
        val module = dep.substring(0, endIndex)
        val version = dep.substring(endIndex + 1)
        module to version
    }
}

@Suppress("unused")
object GradlePlugin {
    const val android_gradle_plugin         = "com.android.tools.build:gradle:7.0.3"
    const val kotlin_gradle_plugin          = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
    const val huawei_gradle_plugin          = "com.huawei.agconnect:agcp:1.6.0.300"
    const val sensorsdata_gradle_plugin     = "com.sensorsdata.analytics.android:android-gradle-plugin2:3.5.3"
    const val shadow_gradle_plugin          = "com.tencent.shadow.core:gradle-plugin:${Versions.shadow_version}"
}

object Maven {
    @JvmStatic
    fun shadow(): Action<MavenArtifactRepository> {
        return Action<MavenArtifactRepository> { repo ->
            repo.apply {
                name = "GitHubPackages"
                setUrl("https://maven.pkg.github.com/tencent/shadow")
                //一个只读账号兼容Github Packages暂时不支持匿名下载
                //https://github.community/t/download-from-github-package-registry-without-authentication/14407
                credentials(HttpHeaderCredentials::class.java) { credential ->
                    credential.apply {
                        name = "readonlypat"
                        value = "\u0067hp_s3VOOZnLf1bTyvHWblPfaessrVYyEU4JdNbs"
                    }
                }
//                credentials {
//                    username = 'readonlypat'
//                    password = '\u0067hp_s3VOOZnLf1bTyvHWblPfaessrVYyEU4JdNbs'
//                }
            }
        }
    }
}
// @formatter:on