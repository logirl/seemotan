package cc.logirl.motan.async;

import cc.logirl.motan.sync.FooService;

public class FooServiceImpl implements FooService {

    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
