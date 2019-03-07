package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.HuaWeiPhone;
import com.gupao.pattern.factory.IPhone;

public class HuaWeiPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone create() {
        return new HuaWeiPhone();
    }
}
