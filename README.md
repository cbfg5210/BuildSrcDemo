# BuildSrcDemo

初识 buildSrc 是在[掘金](https://juejin.im/)的一篇文章中：[[译]Kotlin + buildSrc：更好的管理Gadle依赖](https://juejin.im/post/5b0fb0e56fb9a00a012b7fda)。

从此就一直使用 buildSrc 来管理插件和依赖库信息了，并且介绍给团队之后团队也是采用了这种方法。但是随着 kotlin 的升级，不记得是在哪个版本的时候发现 Sync 的时候有问题，需要修改 buildSrc 中的 kotlin 脚本配置才行，于是考虑把 kotlin 换成了 groovy，这样 kotlin 的升级就不会影响到 buildSrc 了。

![部分代码截图](https://raw.githubusercontent.com/cbfg5210/BuildSrcDemo/master/captures/capture_1.png)
![部分代码截图](https://raw.githubusercontent.com/cbfg5210/BuildSrcDemo/master/captures/capture_3.png)

之后在使用过程中又发现了一个问题，插件或者依赖有新版本的话在 Dependencies.groovy 的代码是看不到提示的，而在 build.gradle 中是有新版本提示的。怎么解决这个问题呢，写个插件? 写个脚本? 还是写个 task 吧! 我们的办法是：把插件和依赖库信息配置在一个 versions.gradle 的文件中，这样在 versions.gradle 中就可以看到是否有版本提示了，以后信息的修改都是在 versions.gradle 中进行，通过 updateDependencies.gradle 中的 task 把 version.gradle 中的信息同步到 Dependencies.groovy 中。

![部分代码截图](https://raw.githubusercontent.com/cbfg5210/BuildSrcDemo/master/captures/capture_2.png)

到后来，AndroidX 出来了，为了对应之前的配置，我们增加了 xVersions.gradle 文件，在 xVersions.gradle 中，support 包的依赖换成了对应的 AndroidX 依赖。如果需要在两者之间切换的话，只需要在 updateDependencies.gradle 中把配置文件修改成对应的文件即可。

![部分代码截图](https://raw.githubusercontent.com/cbfg5210/BuildSrcDemo/master/captures/capture_4.png)
