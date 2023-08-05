package com.yaroslavcode.customer;
//REST LAYER

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    //Connection controller with service good variant
    private  final CustomerService customerService; // gain immutability
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

}

