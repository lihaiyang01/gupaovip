package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.ApplePhone;
import com.gupao.pattern.factory.IPhone;

public class ApplePhoneFactory implements IPhoneFactory {
    @Override
    public IPhone create() {
        return new ApplePhone();
    }
}
