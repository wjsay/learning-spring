package aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("ExceptionAdvice")
public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
        System.out.println("异常通知：" + target + ", 方法" + method + ", 参数个数" + method.getParameterCount());
    }
}
