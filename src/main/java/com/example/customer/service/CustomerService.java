package com.example.customer.service;

import java.util.List;



import com.example.customer.entity.Customer;


public interface CustomerService {
   
    Customer saveCustomer(Customer c);
    List<Customer> fetchAll();
    //Customer updateCustomer(Customer c,int custId);
    void deleteCustomer(int custId);

}
