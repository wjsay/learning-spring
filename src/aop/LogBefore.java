package aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("LogBefore")
public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知：即将执行...");
    }
}
