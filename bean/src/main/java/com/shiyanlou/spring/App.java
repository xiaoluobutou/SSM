package com.shiyanlou.spring;


import com.shiyanlou.spring.innerbean.Customer;

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
        Customer customer = (Customer)context.getBean("CustomerBean");
        System.out.println(customer.toString());
    }
}
