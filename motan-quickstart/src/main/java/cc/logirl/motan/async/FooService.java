package cc.logirl.motan.async;


import com.weibo.api.motan.transport.async.MotanAsync;

@MotanAsync
public interface FooService {
    String hello(String name);
}
