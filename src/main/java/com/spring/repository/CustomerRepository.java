/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.repository;

import com.spring.model.Customer;
import java.util.List;

/**
 *
 * @author User01
 */
public interface CustomerRepository {

    List<Customer> findAll();
    
}
