package com.java.design.pattern.pattern.AbstractFactoryPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
