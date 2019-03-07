package com.gupao.pattern.factory.simplefactory;

import com.gupao.pattern.factory.IPhone;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        IPhone iPhone = phoneFactory.create("com.gupao.pattern.factory.ApplePhone");
        System.out.println(iPhone);
    }
}
