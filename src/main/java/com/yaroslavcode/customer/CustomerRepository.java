package com.yaroslavcode.customer;
//DAO LAYER
import com.yaroslavcode.customer.CustomerController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Component
public class CustomerRepository implements CustomerRepo
{

    @Override
    public List<Customer> getCustomers() {
//        TODO connect to real DB
        return Collections.emptyList();
    }
}
