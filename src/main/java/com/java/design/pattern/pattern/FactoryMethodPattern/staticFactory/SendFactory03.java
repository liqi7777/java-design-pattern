package com.java.design.pattern.pattern.FactoryMethodPattern.staticFactory;

import com.java.design.pattern.pattern.FactoryMethodPattern.MailSender;
import com.java.design.pattern.pattern.FactoryMethodPattern.Sender;
import com.java.design.pattern.pattern.FactoryMethodPattern.SmsSender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
//静态工厂方法模式
public class SendFactory03 {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
