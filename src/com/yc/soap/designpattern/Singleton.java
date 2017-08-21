package com.yc.soap.designpattern;

/**
 * Created by yc-mac on 2017/8/16.
 */
public class Singleton {

    private volatile static Singleton sSingleton;

    private Singleton() {
    }

//    public static Singleton getInstance() {
//        return sSingleton;
//    }

//    public static Singleton getInstance() {
//        if (sSingleton == null) {
//            sSingleton = new Singleton();
//        }
//        return sSingleton;
//    }

//    public synchronized static Singleton getInstance() {
//        if (sSingleton == null) {
//            sSingleton = new Singleton();
//        }
//        return sSingleton;
//    }

//    public static Singleton getInstance() {
//        synchronized (Singleton.class) {
//            if (sSingleton == null) {
//                sSingleton = new Singleton();
//            }
//        }
//        return sSingleton;
//    }

    public static Singleton getInstance() {
        if (sSingleton == null) {
            synchronized (Singleton.class) {
                if (sSingleton == null) {
                    sSingleton = new Singleton();
                }
            }
        }
        return sSingleton;
    }
}
