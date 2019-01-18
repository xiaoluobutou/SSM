package com.shiyanlou.spring;

import com.shiyanlou.spring.services.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringFiltering.xml");
        CustomerService cust = (CustomerService)context.getBean("customerService");
        System.out.println(cust);

    }
}
