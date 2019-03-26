package aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("LogAfter")
public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知-目标对象：" + o1 + ", 调用方法名" + method.getName()
                + ",方法参数个数" + method.getParameterCount());
    }
}
