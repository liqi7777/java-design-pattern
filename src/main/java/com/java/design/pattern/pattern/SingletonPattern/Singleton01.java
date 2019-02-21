package com.java.design.pattern.pattern.SingletonPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class Singleton01 {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton01 instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton01() {
    }

    /* 静态工程方法，创建实例 */
    public static synchronized Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
