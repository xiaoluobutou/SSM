package com.shiyanlou.spring.aop.advice;
import org.springframework.aop.ThrowsAdvice;
public class HijackThrowExceptionMethod implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException ex){
        System.out.println("HijackThrowExceptionMethod:Throw exception hijacked!");
    }
}