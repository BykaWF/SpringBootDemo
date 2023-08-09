package com.yaroslavcode.customer;
//DAO LAYER


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer,Long> {

}
