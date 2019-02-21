package com.java.design.pattern.pattern.AbstractFactoryPattern;

import com.java.design.pattern.pattern.AbstractFactoryPattern.FactoryInstances.Provider;
import com.java.design.pattern.pattern.AbstractFactoryPattern.FactoryInstances.SendSmsFactory;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendSmsFactory();
        provider.produce().send();
    }
}
