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
  * 斐波那契（类似跳台阶）
* Android相关你最擅长哪一块
* TCP与UDP区别与应用（三次握手和四次挥手）涉及到部分细节（如client如何确定自己发送的消息被server收到） HTTP相关
  * http://www.cnblogs.com/azraelly/archive/2012/12/25/2832393.html
  * https://www.zhihu.com/question/39541968
  * http://www.cnblogs.com/zmlctt/p/3690998.html
  * http://iam42.iteye.com/blog/1703351
* WebSocket相关以及与socket的区别
  * https://www.zhihu.com/question/20215561
  * https://zhuanlan.zhihu.com/p/25592934
* 是否熟悉Android jni开发，jni如何调用java层代码
* 进程间通信的方式
  * http://www.jianshu.com/p/fc0ac15342eb
  * http://blog.csdn.net/boyupeng/article/details/47011383
  * http://wangkuiwu.github.io/2014/09/01/Binder-Introduce/
  * http://www.jianshu.com/p/4ee3fd07da14
* java注解
* 计算一个view的嵌套层级
* 项目组件化的理解
  * https://zhuanlan.zhihu.com/p/26535325
* 基于自身工作经验和计算机相关知识，给出 移动端地图局部加载 瓦片大小的像素大小估值
* 多线程断点续传原理
  * http://blog.csdn.net/ljw124213/article/details/51570565
* Android系统为什么会设计ContentProvider，进程共享和线程安全问题
* jvm相关
  * http://www.cnblogs.com/shudonghe/p/3457990.html
  * http://blog.csdn.net/tonytfjing/article/details/44278233
* Android相关优化（如内存优化、网络优化、布局优化、电量优化、业务优化）
  * 内存优化：https://zhuanlan.zhihu.com/p/26043999
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


### 知乎/猎豹
* Activity的四种启动模式以及相关概念，Activity栈，常见情境下的生命周期分析，异常关闭页面之后的恢复
* Service基础概念，生命周期，通信。四大组件是基础，常见问题都要掌握
* IPC
* 同步的问题，常见的那些，锁机制，synchronized关键字，concurrent包下的数据结构，atom包下的数据结构
  * ReenTrantLock与synchronized区别：http://www.cnblogs.com/baizhanshi/p/7211802.html
* HashMap原理(hashmap hashtable hashset)
  * https://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=2651745258&idx=1&sn=df5ffe0fd505a290d49095b3d794ae7a&mpshare=1&scene=1&srcid=0602KPwDM6cb3PTVMdtZ0oX1&key=807bd2816f4e789364526e7bba50ceab7c749cfaca8f63fc1c6b02b65966062194edbc2e5311116c053ad5807fa33c366a23664f76b0b440a62a3d40ec12e7e72973b0481d559380178671cc3771a0db&ascene=0&uin=NjkzMTg2NDA%3D&devicetype=iMac+MacBookPro11%2C2+OSX+OSX+10.12.5+build(16F73)&version=12020810&nettype=WIFI&fontScale=100&pass_ticket=ebineaMbB8BVIeUpnUZjBm8%2BZice%2Bhba5IDsVDpufNY%3D
  * http://blog.csdn.net/u010983881/article/details/49762595
  * http://www.importnew.com/6931.html
  * https://zhuanlan.zhihu.com/p/27325430
  * https://yemengying.com/2016/05/07/threadsafe-hashmap/
* Handler，包括Looper，MessageQueue，ThreadLocal这些类要详细的看
* ArrayList，LinkedList源码要看
* View的事件传递机制，要彻底弄透彻，可问的问题很多
* Asynctask和线程池
* JVM GC算法，问得比较浅
  * http://shiyanjun.cn/archives/397.html
* JVM 类加载过程，问得比较浅
* DexClassLoader和PathClassLoader的区别


### 小米
* 求一个字符串的最长回文
* 给定一个数，以及有序数组，求出来数组里面两个数的和等于给定数的下标
* 二叉树中序遍历，深度优先广度优先，不用递归算法的方法
* 求二叉树第k层节点个数；
* 实现一个栈push，pop，getMaxElementValue，时间复杂度要求0（1）
* 有序数组0（n）时间复杂度求一组和为sum的数组下标
* AsyncTask内部实现，关注默认线程池是一个串行的线程池；
* 事件的传递方式，View，ViewGroup
* 讲解Activity和Window，View的关系，以及DecorView结构
* 自定义View里面OnMeasure参数的意义
* 讲解一下HandlerThread


### 网易
* 求笛卡尔积
* 单词反转
* 两个有序数组，时间复杂度最好的情况下，合并成一个数组
* ClassLoader，类加载相关问题，例如继承、static修饰的这些在类加载时候的实际应用
* 内部类，静态内部类，匿名内部类在加载时候的相关过程
* 直接引用和符号引用相关
* android dalvik虚拟机里的类加载
* scrollview和listview的区别
* 热修复/插件化


### 阿里巴巴
* LRUCache原理
* 图片加载原理
* 模块化实现（好处，原因）
* JVM
* 视频加密传输
* 统计启动时长,标准
* 如何保持应用的稳定性
* ThreadLocal 原理
* 谈谈classloader
* 动态布局
* 热修复,插件化
* HashMap源码,SpareArray原理
* 性能优化,怎么保证应用启动不卡顿
* 怎么去除重复代码
* SP是进程同步的吗?有什么方法做到同步
* 介绍下SurfView
* HashMap实现原理，ConcurrentHashMap 的实现原理
* 红黑树
  * http://blog.csdn.net/v_july_v/article/details/6105630
* BroadcastReceiver，LocalBroadcastReceiver 区别
* Bundle 机制
* Handler 机制
* android 事件传递机制
* 线程间 操作 List
* App启动流程，从点击桌面开始
* 动态加载
* 类加载器
* OSGI
* Https请求慢的解决办法，DNS，携带数据，直接访问IP
* GC回收策略
* 画出 Android 的大体架构图
* 描述清点击 Android Studio 的 build 按钮后发生了什么
* 大体说清一个应用程序安装到手机上时发生了什么；
* 对 Dalvik、ART 虚拟机有基本的了解；
* Android 上的 Inter-Process-Communication 跨进程通信时如何工作的；
* App 是如何沙箱化，为什么要这么做；
* 权限管理系统（底层的权限是如何进行 grant 的）；
* 进程和 Application 的生命周期；
* 系统启动流程 Zygote进程 –> SystemServer进程 –> 各种系统服务 –> 应用进程
* recycleview listview 的区别,性能
