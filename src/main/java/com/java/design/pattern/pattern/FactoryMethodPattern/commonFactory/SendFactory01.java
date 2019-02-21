package com.java.design.pattern.pattern.FactoryMethodPattern.commonFactory;

import com.java.design.pattern.pattern.FactoryMethodPattern.MailSender;
import com.java.design.pattern.pattern.FactoryMethodPattern.Sender;
import com.java.design.pattern.pattern.FactoryMethodPattern.SmsSender;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
//普通工厂模式
public class SendFactory01 {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

}
