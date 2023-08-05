package com.yaroslavcode;

import com.yaroslavcode.customer.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


import java.util.List;




@SpringBootApplication // this gives us all needed configuration in one line
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }


}



