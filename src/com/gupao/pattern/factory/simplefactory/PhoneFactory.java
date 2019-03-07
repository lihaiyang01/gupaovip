package com.gupao.pattern.factory.simplefactory;

import com.gupao.pattern.factory.ApplePhone;
import com.gupao.pattern.factory.HuaWeiPhone;
import com.gupao.pattern.factory.IPhone;

public class PhoneFactory {

    public IPhone create(String className) {

        try{

            IPhone phone = (IPhone)Class.forName(className).newInstance();
            return phone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
