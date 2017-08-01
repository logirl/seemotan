package cc.logirl.motan.annotation;


import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 在使用motan service 的对象上添加@MotanReferer注解，注册配置与xml方式的referer标签一致
@RestController
public class HelloController {

    @MotanReferer(basicReferer = "motantestClientBasicConfig", group = "testgroup", directUrl = "127.0.0.1:8002")
    FooService service;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        String result = service.hello("test");
        return result;
    }
}
