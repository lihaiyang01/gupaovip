package com.gupao.pattern.factory.abstractfactory;

public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("apple call");
    }
}
