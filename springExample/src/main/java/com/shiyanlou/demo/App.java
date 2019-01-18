package com.shiyanlou.demo;

import com.shiyanlou.demo.helloworld.HelloWorld;
import com.shiyanlou.demo.loosely_coupled.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    private static ApplicationContext context;

    public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        OutputHelper obj = (OutputHelper)context.getBean("OutputHelper");
        obj.outputGenerator.generateOutput();
    }
}
