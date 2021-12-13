package diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Annocation {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行前log");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("执行后log");
    }
    //在环绕增强中，我们可以给地暖管一个参数，代表我们要获取切入的点
    @Around("execution(* service.UserServiceImpl.*(..))")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        Object proceed = joinPoint.proceed();
        System.out.println("around after");
    }
}
