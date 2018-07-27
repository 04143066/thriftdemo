package com.service.impl;

import com.service.HelloServie;
import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloServie.Iface {
    @Override
    public String helloString(String para) throws TException {
        return "nihao, "+ para +" !";
    }
}
