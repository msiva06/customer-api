package com.example.customer.service;

import java.util.List;

import com.example.customer.entity.Customer;
import com.example.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer c) {
       return customerRepository.save(c);
    }

    @Override
    public List<Customer> fetchAll() {
        return customerRepository.findAll();
    }

    // @Override
    // public Customer updateCustomer(Customer c, int custId) {
    //     Customer cust = customerRepository.findById(custId).get();
        

    // }

    @Override
    public void deleteCustomer(int custId) {
        Customer cust = customerRepository.findById(custId).get();
        customerRepository.delete(cust);
    }
    
}
