package com.gupao.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ElectronicProductFactory electronicProductFactory = new AppleProductFactory();
        Phone phone = electronicProductFactory.createPhone();
        phone.call();
        Computer computer = electronicProductFactory.createComputer();
        computer.shangWang();

    }
}
