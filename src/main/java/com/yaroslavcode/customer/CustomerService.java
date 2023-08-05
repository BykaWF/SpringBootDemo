package com.yaroslavcode.customer;

import org.springframework.stereotype.Component;

import java.util.List;

//Business Layer
@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
}
