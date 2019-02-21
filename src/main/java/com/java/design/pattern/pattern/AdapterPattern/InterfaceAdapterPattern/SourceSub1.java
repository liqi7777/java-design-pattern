package com.java.design.pattern.pattern.AdapterPattern.InterfaceAdapterPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class SourceSub1 extends Wrapper2 {
    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1!");
    }
}
