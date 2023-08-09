package com.yaroslavcode.customer;

import java.util.Arrays;
import java.util.List;
public class CustomerFakeRepo implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Yaroslav", "123", "email@mail.com"),
                new Customer(2L,"Elmira", "124", "email@mail.com")

        );
    }
}
