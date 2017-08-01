package cc.logirl.motan.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用spring-boot启动client
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Client {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ClientConfig.class, args);
    }
}
