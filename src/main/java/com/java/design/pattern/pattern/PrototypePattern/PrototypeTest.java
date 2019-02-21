package com.java.design.pattern.pattern.PrototypePattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class PrototypeTest {
    public static void main(String[] args) {
        ShallowPerson shallowPerson1 = new ShallowPerson();
        ShallowPerson shallowPerson2 = shallowPerson1.clone();
        System.out.println(shallowPerson1 == shallowPerson2);
    }

}
