package com.example.sashiframework.msscbrewery.services;

import com.example.sashiframework.msscbrewery.web.model.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        CustomerDTO joe_buck = CustomerDTO.builder().id(UUID.randomUUID()).name("Joe Buck").build();
        System.out.println(joe_buck.toString());
        return joe_buck;
    }
}
