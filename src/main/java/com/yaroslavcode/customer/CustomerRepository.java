package com.yaroslavcode.customer;
//DAO LAYER
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


import java.util.Collections;
import java.util.List;
@Repository
@Primary
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
