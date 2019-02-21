package com.java.design.pattern.pattern.AdapterPattern.ObjectAdapterPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
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
