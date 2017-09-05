# Android知识整理

## Java
* 静态变量的生命周期
  * http://blog.csdn.net/ctcwri/article/details/8858414
* hashCode方法作用
* HashMap原理(hashmap hashtable hashset)
  * https://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=2651745258&idx=1&sn=df5ffe0fd505a290d49095b3d794ae7a&mpshare=1&scene=1&srcid=0602KPwDM6cb3PTVMdtZ0oX1&key=807bd2816f4e789364526e7bba50ceab7c749cfaca8f63fc1c6b02b65966062194edbc2e5311116c053ad5807fa33c366a23664f76b0b440a62a3d40ec12e7e72973b0481d559380178671cc3771a0db&ascene=0&uin=NjkzMTg2NDA%3D&devicetype=iMac+MacBookPro11%2C2+OSX+OSX+10.12.5+build(16F73)&version=12020810&nettype=WIFI&fontScale=100&pass_ticket=ebineaMbB8BVIeUpnUZjBm8%2BZice%2Bhba5IDsVDpufNY%3D
  * http://blog.csdn.net/u010983881/article/details/49762595
  * http://www.importnew.com/6931.html
  * https://zhuanlan.zhihu.com/p/27325430
  * https://yemengying.com/2016/05/07/threadsafe-hashmap/
* SpareArray原理
* JVM内存模型
  * http://www.cnblogs.com/shudonghe/p/3457990.html
  * http://blog.csdn.net/tonytfjing/article/details/44278233
* JVM GC算法
  * http://shiyanjun.cn/archives/397.html
* JVM 类加载过程
* DexClassLoader和PathClassLoader的区别
* synchronize
  * http://www.cnblogs.com/paddix/p/5367116.html
  * http://blog.csdn.net/jsqfengbao/article/details/44837281
* ReenTrantLock
  * http://www.cnblogs.com/easycloud/p/3726464.html
* ReenTrantLock与synchronized区别
  * http://www.cnblogs.com/baizhanshi/p/7211802.html
* 线程挂起，休眠，释放资源相关，唤醒，线程同步，数据传递
  * http://blog.csdn.net/zhandoushi1982/article/details/5506597
  * https://www.zhihu.com/question/39440766/answer/89210950
* volatile原理
* ThreadLocal 原理
  * http://toughcoder.net/blog/2016/11/14/understanding-java-threadlocal/
* 线程同步的问题，常用的线程同步。Lock与synchronized区别,Join用法
  * join http://blog.csdn.net/cyp331203/article/details/40824499
* 进程和线程的区别
* 如何终止线程
  * http://tanxiaoluo.com/2016/04/27/%E5%A6%82%E4%BD%95%E4%BC%98%E9%9B%85%E7%9A%84%E5%81%9C%E6%AD%A2%E4%B8%80%E4%B8%AA%E6%AD%A3%E5%9C%A8%E8%BF%90%E8%A1%8C%E7%9A%84JAVA%E7%BA%BF%E7%A8%8B/
* 内部类和静态内部类和匿名内部类
* arraylist和linkedlist的区别，以及应用场景
  * http://www.importnew.com/6629.html
* String、StringBuffer与StringBuilder的区别
* Java的四种引用的区别
* java注解
* java反射


## 网络
* 网络七层结构，五层结构
* Http请求头，响应头，状态码
* Http请求的方法有哪些？Get和Post的区别？
* HTTP请求的IP报文结构
* https相关，如何验证证书的合法性，https中哪里用了对称加密，哪里用了非对称加密，对加密算法（如RSA）
  - https://segmentfault.com/a/1190000004461428
  - https://segmentfault.com/a/1190000004461428
  - http://www.cnblogs.com/zery/p/5164795.html
  - http://blog.csdn.net/ituling/article/details/52541585
  - http://www.jianshu.com/p/7158568e4867
* TCP与UDP区别与应用（三次握手和四次挥手）涉及到部分细节（如client如何确定自己发送的消息被server收到） HTTP相关
  * http://www.cnblogs.com/azraelly/archive/2012/12/25/2832393.html
  * https://www.zhihu.com/question/39541968
  * http://www.cnblogs.com/zmlctt/p/3690998.html
  * http://iam42.iteye.com/blog/1703351
* WebSocket相关以及与socket的区别
  * https://www.zhihu.com/question/20215561
  * https://zhuanlan.zhihu.com/p/25592934
* 网络请求相关，主要是网络请求优化。网络请求的时候遇到的问题。

## Android
#### UI
* 图片加载库相关，bitmap如何处理大图，如一张30M的大图，如何预防OOM
* ListView图片加载错乱的原理和解决方案
* down、move、up事件的传递
  * http://www.jianshu.com/p/2be492c1df96
  * http://www.jianshu.com/p/38015afcdb58
* 封装view的时候怎么知道view的大小
  * http://www.cnblogs.com/xs104/p/5410404.html
* view渲染
* Activity和Window，View的关系，以及DecorView结构
* SurfView相关

#### 四大组件
* Activity栈
  * http://blog.csdn.net/janice0529/article/details/40905285
* 广播（动态注册和静态注册区别，有序广播和标准广播）
  * http://www.jianshu.com/p/0b3a7b35d76d
* intent-filter
  * http://blog.csdn.net/iispring/article/details/48481793
* 怎么启动service，service和activity怎么进行数据交互
* service生命周期
  * https://my.oschina.net/tingzi/blog/376545
* 下拉状态栏是不是影响activity的生命周期，如果在onStop的时候做了网络请求，onResume的时候怎么恢复
  * https://www.zhihu.com/question/41352677/answer/91030381
* BroadcastReceiver，LocalBroadcastReceiver 区别

#### 安全
* 动态权限适配方案，权限组的概念
* RecyclerView优点，原理
  * https://dev.qq.com/topic/5811d3e3ab10c62013697408
* Android系统为什么会设计ContentProvider，进程共享和线程安全问题

#### 进程和线程
* Handler发消息给子线程，looper怎么启动
* 多线程断点续传原理
  * http://blog.csdn.net/ljw124213/article/details/51570565
* 多线程（关于AsyncTask缺陷引发的思考）
  * http://blog.csdn.net/boyupeng/article/details/49001215
* 四种线程池区别，以及常见应用场景，线程池的深入了解
  * http://blog.csdn.net/boyupeng/article/details/47040045
* 进程间通信的方式
  * http://www.jianshu.com/p/838c6a95eaad
  * http://gityuan.com/2015/11/01/binder-driver/
  * http://www.jianshu.com/p/fc0ac15342eb
  * http://blog.csdn.net/boyupeng/article/details/47011383
  * http://wangkuiwu.github.io/2014/09/01/Binder-Introduce/
  * http://www.jianshu.com/p/4ee3fd07da14
* 结束进程的方法
  * http://www.cnblogs.com/crazypebble/archive/2011/04/08/2006213.html
* 进程保活
  - https://segmentfault.com/a/1190000006251859
* binder
  * http://www.bijishequ.com/detail/266914?p=
* APP启动流程
  * http://gityuan.com/2016/03/12/start-activity/
  * https://www.kancloud.cn/digest/androidframeworks/127782
  * http://www.jianshu.com/p/910df9643d8c
* 进程和 Application 的生命周期

#### 其它
* LRUCache实现
* SP是进程同步的吗?有什么方法做到同步
* 设计模式中的基本原则
* 设计模式相关（例如Android中哪里使用了观察者模式，单例模式相关）
  * http://www.jianshu.com/p/1a9f571ad7c0
* Android相关优化（如内存优化、网络优化、布局优化、电量优化、业务优化）
  * 内存优化：https://zhuanlan.zhihu.com/p/26043999
* Parcelable和Serializable
  * https://www.zhihu.com/question/34306952
  * http://blog.csdn.net/androidzhaoxiaogang/article/details/8172539
  * https://github.com/android-cn/android-discuss/issues/142
* 数据库性能优化
  * https://zhuanlan.zhihu.com/p/25447017
* APK打包流程
  * http://blog.csdn.net/jason0539/article/details/44917745
* Gradle配置
* 一个应用程序安装到手机上时发生了什么
* App是如何沙箱化，为什么要这么做
* 什么是内存泄露，如何分析？MAT和LeakCanary。MAT和LeakCanary的各自优缺点是什么？

#### Android新技术和第三方组件
* EventBus原理
  * http://blog.csdn.net/crazy__chen/article/details/47425779
* 项目组件化的理解
  * https://zhuanlan.zhihu.com/p/26535325
* 热修复
  * https://github.com/DiyCodes/code_news/blob/master/dialy_news/2016/06/%E7%AC%AC34%E6%9C%9F%EF%BC%9AAndroid%E7%83%AD%E4%BF%AE%E5%A4%8D%E6%8A%80%E6%9C%AF%E4%B8%93%E9%A2%98%EF%BC%9A%E6%9D%A5%E8%87%AA%E5%BE%AE%E4%BF%A1%E3%80%81%E6%B7%98%E5%AE%9D%E3%80%81%E6%94%AF%E4%BB%98%E5%AE%9D%E3%80%81QQ%E7%A9%BA%E9%97%B4%E7%9A%84%E7%83%AD%E4%BF%AE%E5%A4%8D%E6%96%B9%E6%A1%88.md
* Fresco原理
  * http://blog.csdn.net/u010687392/article/details/50266633
* Volley原理
  * http://a.codekk.com/detail/Android/grumoon/Volley%20%E6%BA%90%E7%A0%81%E8%A7%A3%E6%9E%90
