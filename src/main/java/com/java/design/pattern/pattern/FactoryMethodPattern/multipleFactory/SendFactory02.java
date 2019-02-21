package com.java.design.pattern.pattern.FactoryMethodPattern.multipleFactory;

import com.java.design.pattern.pattern.FactoryMethodPattern.MailSender;
import com.java.design.pattern.pattern.FactoryMethodPattern.Sender;
import com.java.design.pattern.pattern.FactoryMethodPattern.SmsSender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
//多个工厂方法模式
public class SendFactory02 {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
