package com.example.sashiframework.msscbrewery.services;

import com.example.sashiframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
}


