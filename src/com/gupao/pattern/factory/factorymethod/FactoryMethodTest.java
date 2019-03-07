package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.IPhone;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IPhoneFactory phoneFactory = new HuaWeiPhoneFactory();
        IPhone iPhone = phoneFactory.create();
        System.out.println(iPhone);
    }
}
