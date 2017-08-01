package cc.logirl.motan.annotation;


import com.weibo.api.motan.config.springsupport.annotation.MotanService;

// service的实现类上添加@MotanService注解，注解的配置参数与xml配置方式的service标签一致
@MotanService(export = "demoMotan:8002")
public class FooServiceImpl implements FooService {

    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
