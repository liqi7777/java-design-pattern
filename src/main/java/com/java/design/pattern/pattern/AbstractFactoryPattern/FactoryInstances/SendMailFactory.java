package com.java.design.pattern.pattern.AbstractFactoryPattern.FactoryInstances;

import com.java.design.pattern.pattern.AbstractFactoryPattern.MailSender;
import com.java.design.pattern.pattern.AbstractFactoryPattern.Sender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
