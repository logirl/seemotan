package cc.logirl.motan.async;

import com.weibo.api.motan.rpc.ResponseFuture;
import java.lang.String;

public interface FooServiceAsync extends FooService {
  ResponseFuture helloAsync(String name);
}
