package com.gupao.pattern.factory.abstractfactory;

public class AppleProductFactory implements ElectronicProductFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}
