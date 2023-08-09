package com.yaroslavcode.customer;
//REST LAYER

import com.yaroslavcode.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping(path = "api/v2/customers")
@RestController
public class CustomerControllerV2 {

    //Connection controller with service good variant
    private  final CustomerService customerService; // gain immutability
    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException(
                "API Request Exception fro customer " + id
        );
    }

    @PostMapping
    void createNewCustomer(@RequestBody @Valid Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }
    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
    }

}

