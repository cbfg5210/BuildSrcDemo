/**
 * 版本信息
 */
interface Versions {
    def minSdk = 17
    def targetSdk = 28
    def compileSdk = 28
    def buildTools = "28.0.3"
}

/**
 * 依赖库路径
 */
interface Deps {
    /*
     * repository plugin
     */
    //gradlePlugin
    def gradlePlugin = "com.android.tools.build:gradle:3.4.1"
    //mavenGradlePlugin
    def mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:2.1"

    /*
     * test
     */
    //junit
    def junit = "junit:junit:4.12"
    //runner
    def runner = "com.android.support.test:runner:1.0.2"
    //espresso
    def espresso = "com.android.support.test.espresso:espresso-core:3.0.2"

    /*
     * support
     */
    //appcompat
    def appcompat = "com.android.support:appcompat-v7:28.0.0"
    //supportV4
    def supportV4 = "com.android.support:support-v4:28.0.0"
    //supportFragment
    def supportFragment = "com.android.support:support-fragment:28.0.0"
    //supportCoreUtils
    def supportCoreUtils = "com.android.support:support-core-utils:28.0.0"
    //annotations
    def annotations = "com.android.support:support-annotations:28.0.0"
    //design
    def design = "com.android.support:design:28.0.0"
    //cardView
    def cardView = "com.android.support:cardview-v7:28.0.0"
    //recyclerView
    def recyclerView = "com.android.support:recyclerview-v7:28.0.0"
    //transition
    def transition = "com.android.support:transition:28.0.0"
    //constraintLayout
    def constraintLayout = "com.android.support.constraint:constraint-layout:1.1.3"
    //multiDex
    def multiDex = "com.android.support:multidex:1.0.3"

    /*
     * room
     */
    //roomRuntime
    def roomRuntime = "android.arch.persistence.room:runtime:1.1.1"
    //roomCompiler
    def roomCompiler = "android.arch.persistence.room:compiler:1.1.1"
    //roomRxJava2
    def roomRxJava2 = "android.arch.persistence.room:rxjava2:1.1.1"
    //roomTesting
    def roomTesting = "android.arch.persistence.room:testing:1.1.1"

    /*
     * lifecycle
     */
    //lifecycleExtensions : view model + live data
    def lifecycleExtensions = "android.arch.lifecycle:extensions:1.1.1"
    //viewModel
    def viewModel = "android.arch.lifecycle:viewmodel:1.1.1"
    //liveData
    def liveData = "android.arch.lifecycle:livedata:1.1.1"
    //lifecycleRuntime : no view model or live data
    def lifecycleRuntime = "android.arch.lifecycle:runtime:1.1.1"
    //lifecycleCompiler
    def lifecycleCompiler = "android.arch.lifecycle:compiler:1.1.1"
    //lifecycleCommonJava8 : if using Java8, use the following instead of compiler
    def lifecycleCommonJava8 = "android.arch.lifecycle:common-java8:1.1.1"
    //lifecycleReactiveStreams : ReactiveStreams support for LiveData
    def lifecycleReactiveStreams = "android.arch.lifecycle:reactivestreams:1.1.1"

    /*
     * google
     */
    //playServicesAd
    def playServicesAd = "com.google.android.gms:play-services-ads:17.2.0"
    //googleService
    def googleService = "com.google.gms:google-services:4.2.0"
    //flexBox : https://github.com/google/flexbox-layout
    def flexBox = "com.google.android:flexbox:1.1.0"
    //gson : https://github.com/google/gson
    def gson = "com.google.code.gson:gson:2.8.5"
    //pagingRuntime
    def pagingRuntime = "android.arch.paging:runtime:1.0.1"

    //kotlinStdlib
    def kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.3.31"
    //kotlinStdlibJdk7    
    def kotlinStdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.31"
    //kotlinStdlibJdk8
    def kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.31"
    //kotlinGradlePlugin
    def kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21"

    /*
     * 模块化框架
     */
    //appJoint : https://github.com/PrototypeZ/AppJoint/blob/master/README_zh.md
    def appJoint = "io.github.prototypez:app-joint:1.6.1"
    //appJointCore
    def appJointCore = "io.github.prototypez:app-joint-core:1.6.1"

    /*
     * 网络
     */
    //okHttp3 : https://github.com/square/okhttp
    def okHttp3 = "com.squareup.okhttp3:okhttp:3.11.0"
    //okHttp3LoggingInterceptor
    def okHttp3LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:3.11.0"

    /*
     * retrofit2
     */
    //retrofit2 : https://github.com/square/retrofit
    def retrofit2 = "com.squareup.retrofit2:retrofit:2.4.0"
    //retrofit2ConverterGson
    def retrofit2ConverterGson = "com.squareup.retrofit2:converter-gson:2.4.0"
    //retrofit2ConverterScalars
    def retrofit2ConverterScalars = "com.squareup.retrofit2:converter-scalars:2.4.0"
    //retrofit2AdapterRxJava2
    def retrofit2AdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:2.4.0"

    //retrofitUrlManager : https://github.com/JessYanCoding/RetrofitUrlManager
    def retrofitUrlManager = "me.jessyan:retrofit-url-manager:1.4.0"

    /*
     * 路由
     */
    //aRouterApi : https://github.com/alibaba/ARouter
    def aRouterApi = "com.alibaba:arouter-api:1.4.1"
    //aRouterCompiler
    def aRouterCompiler = "com.alibaba:arouter-compiler:1.1.4"

    /*
     * 图片加载
     */
    //picasso : https://github.com/square/picasso
    def picasso = "com.squareup.picasso:picasso:2.71828"

    //glideV3 : https://github.com/bumptech/glide
    def glideV3 = "com.github.bumptech.glide:glide:3.8.0"
    //glideV4 : https://github.com/bumptech/glide
    def glideV4 = "com.github.bumptech.glide:glide:4.9.0"
    //glideV4Compiler
    def glideV4Compiler = "com.github.bumptech.glide:compiler:4.8.0"

    /*
     * 资源选择
     */
    //matisse : https://github.com/zhihu/Matisse
    def matisse = "com.zhihu.android:matisse:0.5.2-beta2"

    /*
     * 事件总线
     */
    //eventBus : https://github.com/greenrobot/EventBus
    def eventBus = "org.greenrobot:eventbus:3.1.1"

    /*
     * bug反馈
     */
    //bugly
    def bugly = "com.tencent.bugly:crashreport:2.8.6.0"

    /*
     * 自定义view
     */
    //discreteScrollview : https://github.com/yarolegovich/DiscreteScrollView
    def discreteScrollview = "com.yarolegovich:discrete-scrollview:1.4.9"
    //easySwipeMenuLayout : https://github.com/anzaizai/EasySwipeMenuLayout
    def easySwipeMenuLayout = "com.github.anzaizai:EasySwipeMenuLayout:1.1.2"
    //pageIndicatorView : https://github.com/romandanylyk/PageIndicatorView
    def pageIndicatorView = "com.romandanylyk:pageindicatorview:1.0.1"
    //swipeBack : https://github.com/gongwen/SwipeBackLayout
    def swipeBack = "com.gongwen:swipeback:1.0.2"
    //banner : https://github.com/youth5201314/banner
    def banner = "com.youth.banner:banner:1.4.10"
    //photoView : https://github.com/chrisbanes/PhotoView
    def photoView = "com.github.chrisbanes:PhotoView:2.2.0"
    //shapedImageView : https://github.com/gavinliu/ShapedImageView
    def shapedImageView = "cn.gavinliu:ShapedImageView:0.8.6"

    /*
     * 动画
     */
    //transitionsEverywhere : https://github.com/andkulikov/Transitions-Everywhere
    def transitionsEverywhere = "com.andkulikov:transitionseverywhere:1.8.0"

    /*
     * 权限
     */
    //andPermission : https://github.com/yanzhenjie/AndPermission
    def andPermission = "com.yanzhenjie:permission:2.0.0-rc5"

    /*
     * 实用
     */
    //butterKnife : https://github.com/JakeWharton/butterknife
    def butterKnife = "com.jakewharton:butterknife:8.8.1"
    //butterKnifeCompiler
    def butterKnifeCompiler = "com.jakewharton:butterknife-compiler:8.8.1"
    //butterKnifeGradlePlugin
    def butterKnifeGradlePlugin = "com.jakewharton:butterknife-gradle-plugin:8.8.1"

    //rxJava2 : https://github.com/ReactiveX/RxJava
    def rxJava2 = "io.reactivex.rxjava2:rxjava:2.2.8"
    //rxAndroid2
    def rxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.0"

    //rxLifecycle : https://github.com/trello/RxLifecycle
    def rxLifecycle = "com.trello.rxlifecycle2:rxlifecycle:2.2.2"
    //rxLifecycleComponents
    def rxLifecycleComponents = "com.trello.rxlifecycle2:rxlifecycle-components:2.2.2"

    //oneDrawable : https://github.com/maoruibin/OneDrawable
    def oneDrawable = "com.github.maoruibin:OneDrawable:1.1.0"

    //zxing : https://github.com/zxing/zxing
    def zxing = "com.google.zxing:core:3.3.0"
    //greenDao : https://github.com/greenrobot/greenDAO
    def greenDao = "de.greenrobot:greendao:2.1.0"
    //mmkv : 基于mmap的高性能通用key-value组件 https://github.com/Tencent/MMKV/blob/master/readme_cn.md
    def mmkv = "com.tencent:mmkv:1.0.16"

    /*
     * 插件
     */
    //saveState : https://github.com/PrototypeZ/SaveState
    def saveState = "io.github.prototypez:save-state:0.1.7"

    /*
    * 测试工具
    */
    //stetho : https://github.com/facebook/stetho
    def stetho = "com.facebook.stetho:stetho:1.5.0"
    //stethoOkHttp3
    def stethoOkHttp3 = "com.facebook.stetho:stetho-okhttp3:1.5.0"
    //stethoUrlConnection
    def stethoUrlConnection = "com.facebook.stetho:stetho-urlconnection:1.5.0"

    //leakCanaryAndroid : https://github.com/square/leakcanary
    def leakCanaryAndroid = "com.squareup.leakcanary:leakcanary-android:1.6.1"
    //leakCanaryAndroidNoOp
    def leakCanaryAndroidNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:1.6.1"
    //leakCanarySupportFragment
    def leakCanarySupportFragment = "com.squareup.leakcanary:leakcanary-support-fragment:1.6.1"

    //blockCanaryAndroid :卡顿监控和提示 https://github.com/markzhai/AndroidPerformanceMonitor
    def blockCanaryAndroid = "com.github.markzhai:blockcanary-android:1.5.0"

    //crashwoodpecker
    def crashwoodpecker = "me.drakeet.library:crashwoodpecker:2.1.1"

    //debugDb : https://github.com/amitshekhariitbhu/Android-Debug-Database
    def debugDb = "com.amitshekhar.android:debug-db:1.0.4"
}
