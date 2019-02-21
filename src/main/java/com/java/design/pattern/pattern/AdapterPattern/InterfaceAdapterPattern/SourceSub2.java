package com.java.design.pattern.pattern.AdapterPattern.InterfaceAdapterPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class SourceSub2 extends Wrapper2 {
    @Override
    public void method2() {
        System.out.println("the sourceable interface's second Sub2!");
    }
}
