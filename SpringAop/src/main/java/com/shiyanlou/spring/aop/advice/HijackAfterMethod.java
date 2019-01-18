package com.shiyanlou.spring.aop.advice;
import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class HijackAfterMethod implements AfterReturningAdvice{
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target){
        System.out.println("HijackAfterMethod : Agtermethod hijacked!");
        System.out.println(returnValue);
        System.out.println(method);
        System.out.println(args);
        System.out.println(target);
    }
}