package com.java.design.pattern.pattern.FactoryMethodPattern;

import com.java.design.pattern.pattern.FactoryMethodPattern.commonFactory.SendFactory01;
import com.java.design.pattern.pattern.FactoryMethodPattern.multipleFactory.SendFactory02;
import com.java.design.pattern.pattern.FactoryMethodPattern.staticFactory.SendFactory03;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class FactoryTest {

    public static void main(String[] args) {
        sendFactory01();
        sendFactory02();
        sendFactory03();
    }

    //普通工厂模式
    public static void sendFactory01() {
        SendFactory01 factory = new SendFactory01();
        Sender sender = factory.produce("sms");
        sender.send();
    }

    //多个工厂方法模式
    public static void sendFactory02() {
        SendFactory02 sendFactory02 = new SendFactory02();
        Sender sender = sendFactory02.produceMail();
        sender.send();
    }

    //静态工厂方法模式
    public static void sendFactory03() {
        SendFactory03.produceMail().send();
    }

}
