package com.shiyanlou.demo.helloworld;
public class HelloWorld{
    private String name;
    public void setname(String n){
        this.name = n;
    }
    public void printHello(){
        System.out.println("The first spring :hello"+name);
    }
}