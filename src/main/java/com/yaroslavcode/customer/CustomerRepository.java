package com.yaroslavcode.customer;
//DAO LAYER


import java.util.Collections;
import java.util.List;
public class CustomerRepository implements CustomerRepo
{

    @Override
    public List<Customer> getCustomers() {
//        TODO connect to real DB
        return Collections.singletonList(
                new Customer(1L, "TODO.Iml real db")
        );
    }
}
