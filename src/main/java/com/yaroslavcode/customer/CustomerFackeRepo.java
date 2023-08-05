package com.yaroslavcode.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component(value = "fake")
public class CustomerFackeRepo implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Yaroslav"),
                new Customer(2L,"ELmira")

        );
    }
}
