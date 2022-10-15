//Anmol Singh 301145362
package com.spring.packages.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.packages.Entities.CustomerEntity;
@Service
//Service class for Customer
public class CustomerService {
//hash map to store customer data
	Map<Integer, CustomerEntity> customerMap = new HashMap<>();
	//add customer
    public void addCustomer(CustomerEntity customer) throws Exception {
        if(customerMap.containsKey(customer.getCustomerId())) {
            throw new Exception("This Customer Id already exists");
        }
        else {
        	customerMap.put(customer.getCustomerId(), customer);
        }
    }
    
    //get the list
    public Iterable<CustomerEntity> getCustomers(){
        return customerMap.values();
    }
    
    //get a customer specified by customerId
    public CustomerEntity getCustomer(int customerId) throws Exception {

        if(customerMap.containsKey(customerId)) {
            return customerMap.get(customerId);
        }
        else {
        	return null;
            //throw new Exception("customer Id not found");
        }
    }
    
    //update a customer
    public void updateCustomer(CustomerEntity customer) throws Exception {
        if(customerMap.containsKey(customer.getCustomerId())) {
        	customerMap.put(customer.getCustomerId(), customer);
        }
        else {
            throw new Exception("Customer Id not found");
        }
    }
    //delete a customer
    public void deleteCustomer(int customerId) throws Exception {
        if(customerMap.containsKey(customerId)) {
        	customerMap.remove(customerId);
        }
        else {
            throw new Exception("Customer Id not found");
         
        }
    }

}
