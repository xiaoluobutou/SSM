package com.shiyanlou.spring.services;
import com.shiyanlou.spring.dao.CustomerDAO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class CustomerService{
    @Autowired
    CustomerDAO customerDAO;

    public String toString(){
        return "CustomerService [customerDAO==" +"customerDAO"+"]";
    }
}