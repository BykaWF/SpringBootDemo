package com.yaroslavcode.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Business Layer
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;
    @Autowired
    public CustomerService( CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
