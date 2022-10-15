//Anmol Singh 301145362
package com.spring.packages.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.packages.Entities.CustomerEntity;
import com.spring.packages.Services.CustomerService;
@RestController
//Controller class for Customer
public class CustomerController {

	@Autowired(required=true)
    CustomerService customerService;
	
	//GET
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    CustomerEntity getCustomer(@PathVariable("customerId") int customerId) throws Exception {
        return customerService.getCustomer(customerId);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    Iterable<CustomerEntity> getCustomer() {
        return customerService.getCustomers();
    }
    //POST
    @RequestMapping(value = "/postCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addCustomer(@RequestBody CustomerEntity customer) throws Exception {
    	customerService.addCustomer(customer);
    }
    
    //PUT
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateCustomer(@PathVariable("customerId") int customerId, @RequestBody CustomerEntity customer) throws Exception {
    	customer.setCustomerId(customerId);
    	customerService.updateCustomer(customer);
    }
    
    //DELETE
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteCustomer(@PathVariable("customerId") int customerId) throws Exception {
        customerService.deleteCustomer(customerId);
    }
}
