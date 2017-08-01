package cc.logirl.motan.zookeeper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 客户端，同步调用
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        FooService service = (FooService) ctx.getBean("remoteService");
        System.out.println(service.hello("motan"));
    }
}
