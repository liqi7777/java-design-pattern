package com.java.design.pattern.pattern.AdapterPattern.ClassAdapterPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
//这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
