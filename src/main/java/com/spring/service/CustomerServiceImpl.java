/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
    
    //@Autowired
    private CustomerRepository customerRepository;
    
    public CustomerServiceImpl() {
        
    }
    
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor injection");
        this.customerRepository = customerRepository;
    }
    
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection");
        this.customerRepository = customerRepository;
    }  
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
