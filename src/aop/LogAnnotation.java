package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("LogAnnotation")
@Aspect
public class LogAnnotation {
    @Before("execution(public * service.impl.StudentServiceImpl.addStudent(..))")
    public void mybefore() {
        System.out.println("注解-前置通知");
    }

    @AfterReturning(pointcut = "execution(public * service.impl.StudentServiceImpl.addStudent(..))", returning = "returningValue")
    public void myafter(JoinPoint jp, Object returningValue) {
        System.out.println("注解-后置通知");
    }

    @AfterThrowing(pointcut = "execution(public * service.impl.StudentServiceImpl.addStudent(..))")
    public void myerror(JoinPoint jp) {
        System.out.println("注解-异常通知");
    }

    @Around("execution(public * service.impl.StudentServiceImpl.addStudent(..))")
    public void myaround(ProceedingJoinPoint pjp) {
        try {
            // 前置
            pjp.proceed();
            // 后置
        }catch (Throwable e) {
            // 异常
        } finally {
            // 最终
        }
    }
}
