package com.java.design.pattern.pattern.SingletonPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class Singleton03 {
    /* 私有构造方法，防止被实例化 */
    private Singleton03() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton03 instance = new Singleton03();
    }

    /*获取实例 */
    public static Singleton03 getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

}
