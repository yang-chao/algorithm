# 算法练习

## Android知识整理

### 腾讯OMG
* synchronize用法
* volatile用法
* 动态权限适配方案，权限组的概念
* 网络请求缓存处理，okhttp如何处理网络缓存的
* 图片加载库相关，bitmap如何处理大图，如一张30M的大图，如何预防OOM
* 进程保活
  - https://segmentfault.com/a/1190000006251859
* ListView图片加载错乱的原理和解决方案
* https相关，如何验证证书的合法性，https中哪里用了对称加密，哪里用了非对称加密，对加密算法（如RSA）等是否有了解
  - https://segmentfault.com/a/1190000004461428
  - https://segmentfault.com/a/1190000004461428
  - http://www.cnblogs.com/zery/p/5164795.html
  - http://blog.csdn.net/ituling/article/details/52541585
  - http://www.jianshu.com/p/7158568e4867


### 美团
* 线程挂起，休眠，释放资源相关，唤醒，线程同步，数据传递
  * http://blog.csdn.net/zhandoushi1982/article/details/5506597
  * https://www.zhihu.com/question/39440766/answer/89210950
* static synchronized 方法的多线程访问和作用，同一个类里面两个synchronized方法，两个线程同时访问的问题
* 内部类和静态内部类和匿名内部类，以及项目中的应用
* 泛型是什么以及在项目中的应用
* Handler发消息给子线程，looper怎么启动
* down、move、up事件的传递
  * http://www.jianshu.com/p/2be492c1df96
  * http://www.jianshu.com/p/38015afcdb58
* activity栈
  * http://blog.csdn.net/janice0529/article/details/40905285
* 封装view的时候怎么知道view的大小
  * http://www.cnblogs.com/xs104/p/5410404.html
* intent-filter
  * http://blog.csdn.net/iispring/article/details/48481793
* arraylist和linkedlist的区别，以及应用场景
  * http://www.importnew.com/6629.html
* 怎么启动service，service和activity怎么进行数据交互
* 下拉状态栏是不是影响activity的生命周期，如果在onStop的时候做了网络请求，onResume的时候怎么恢复
  * https://www.zhihu.com/question/41352677/answer/91030381
* view渲染


### 滴滴
* MVP
* 广播（动态注册和静态注册区别，有序广播和标准广播）
  * http://www.jianshu.com/p/0b3a7b35d76d
* service生命周期
  * https://my.oschina.net/tingzi/blog/376545
* handler实现机制（很多细节需要关注：如线程如何建立和退出消息循环等等）
* 多线程（关于AsyncTask缺陷引发的思考）
  * http://blog.csdn.net/boyupeng/article/details/49001215
* 数据库数据迁移问题
* 设计模式相关（例如Android中哪里使用了观察者模式，单例模式相关）
  * http://www.jianshu.com/p/1a9f571ad7c0
* 微信的聊天数据在本地都是加密处理的（防止root了被破解），设计一个类似的本地数据存储系统
* x个苹果，一天只能吃一个、两个、或者三个，问多少天可以吃完
* Android相关你最擅长哪一块
* TCP与UDP区别与应用（三次握手和四次挥手）涉及到部分细节（如client如何确定自己发送的消息被server收到） HTTP相关 提到过Websocket 问了WebSocket相关以及与socket的区别
* 是否熟悉Android jni开发，jni如何调用java层代码
* 进程间通信的方式
  * http://www.jianshu.com/p/fc0ac15342eb
  * http://blog.csdn.net/boyupeng/article/details/47011383
  * http://wangkuiwu.github.io/2014/09/01/Binder-Introduce/
  * http://www.jianshu.com/p/4ee3fd07da14
* java注解
* 计算一个view的嵌套层级
* 项目组件化的理解
* 基于自身工作经验和计算机相关知识，给出 移动端地图局部加载 瓦片大小的像素大小估值
* 多线程断点续传原理
* Android系统为什么会设计ContentProvider，进程共享和线程安全问题
* jvm相关
  * http://www.cnblogs.com/shudonghe/p/3457990.html
  * http://blog.csdn.net/tonytfjing/article/details/44278233
* Android相关优化（如内存优化、网络优化、布局优化、电量优化、业务优化）
* EventBus实现原理


### 今日头条
* 快速排序
* JSON字符串解析算法及优化
* 线程同步的问题，常用的线程同步
* 问项目，根据项目引申：主要有Asynctask和线程池，多进程以及IPC，GC相关（四种引用，怎么判断哪些内存该GC，GC算法），why，when，how 这些都是要从项目里面举出来例子
  * http://blog.csdn.net/mazhimazh/article/details/19752475
* 图片加载三级缓存，有一个功能，做一个能放大缩小的图片查看器，加载一张巨大的图片，怎么做
* 图片加载框架优劣比较，以及之前项目选用加载框架时候的考虑
* 网络请求相关，主要是网络请求优化。网络请求的时候遇到的问题
* ListView性能优化，以及ListView的各种原理
* RecyclerView优点，原理
  * https://dev.qq.com/topic/5811d3e3ab10c62013697408
* 怎么做上传下载的断点续传
* EventBus原理
  * http://blog.csdn.net/crazy__chen/article/details/47425779
* 四种线程池区别，以及常见应用场景，线程池的深入了解
  * http://blog.csdn.net/boyupeng/article/details/47040045
* CoordinatorLayout、CollapsingToolbarLayout原理以及使用
* 数据库性能优化
  * https://zhuanlan.zhihu.com/p/25447017
* APP启动流程
  * http://www.weyye.me/detail/android-source-activity-oncreate/
  * http://www.jianshu.com/p/910df9643d8c
* ManiFest原理
* APK打包流程
  * http://blog.csdn.net/jason0539/article/details/44917745




hashmap hashtable hashset
http://blog.csdn.net/u010983881/article/details/49762595
http://www.importnew.com/6931.html
https://zhuanlan.zhihu.com/p/27325430
