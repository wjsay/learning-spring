package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("LogAround")
public class LogAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;
        try {
            System.out.println("环绕通知");
            // 前置
            result = methodInvocation.proceed();
            // 后置
            System.out.println("环绕通知：后置通知");
        } catch (Exception e) {
            // 异常
            System.out.println("环绕通知：异常通知");
            // methodInvocation.getMethod();
            // methodInvocation.getThis();
        }
        return result;
    }
}
