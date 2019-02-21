package com.java.design.pattern.pattern.AbstractFactoryPattern.FactoryInstances;

import com.java.design.pattern.pattern.AbstractFactoryPattern.Sender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public interface Provider {
    Sender produce();
}
