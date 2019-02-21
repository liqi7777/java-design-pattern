package com.java.design.pattern.pattern.AbstractFactoryPattern.FactoryInstances;

import com.java.design.pattern.pattern.AbstractFactoryPattern.Sender;
import com.java.design.pattern.pattern.AbstractFactoryPattern.SmsSender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
