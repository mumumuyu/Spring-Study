package log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName()+"返回了" +returnValue);
    }
}
