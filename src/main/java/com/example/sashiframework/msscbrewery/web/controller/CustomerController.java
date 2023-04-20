package com.example.sashiframework.msscbrewery.web.controller;

import com.example.sashiframework.msscbrewery.services.CustomerService;
import com.example.sashiframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO>getCustomer(@PathVariable("customerId") UUID customerId){
    return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);

    }
}
