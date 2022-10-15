//Anmol Singh 301145362
package com.spring.packages.Controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.packages.Entities.CustomerEntity;
import com.spring.packages.Services.CustomerService;

//Controller class for Customer to handle UI
@Controller
public class CustomerUIController {



	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}

	    
  //GET
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(Model model) {
      
        return "registration";
    }
   //POST
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void  addCustomer(@ModelAttribute("customer") CustomerEntity customer, HttpServletResponse response) throws Exception {
   
    	var check=customer.getCustomerId();

    if(customerService.getCustomer(check)==null)
    {
    	customerService.addCustomer(customer);
        response.sendRedirect("/listOfCustomers");
    }
    else {
    	
        
        response.sendError(0, "Please enter unique id");  
    }
    }
    
    //GET
    //to show list of all registered customers
    @RequestMapping(value = "/listOfCustomers", method = RequestMethod.GET)
    public String listCustomer(Model model) {
        model.addAttribute("customerList",customerService.getCustomers());
        return "listOfCustomers";
    }
	//GET
    //to update customer details
    @RequestMapping(value = "/update/{customerId}", method = RequestMethod.GET)
       public String modifyCustomer(@PathVariable("customerId") int customerId ,Model model ) throws Exception {
        model.addAttribute("customer",customerService.getCustomer(customerId));
        return "updateCustomer";
    }
    //POST
    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateCustomer(@ModelAttribute("customer") CustomerEntity customer, HttpServletResponse response) throws Exception {
        customerService.updateCustomer(customer);
        response.sendRedirect("/listOfCustomers");
    }
  //GET
    //to show the customer details
    @RequestMapping(value = "/view/{customerId}", method = RequestMethod.GET)
       public String viewCustomer(@PathVariable("customerId") int customerId ,Model model ) throws Exception {
        model.addAttribute("customer",customerService.getCustomer(customerId));
        return "customerDetails";
    }
 //GET
    //to delete customer
    @RequestMapping(value = "/deleteCustomer/{customerId}", method = RequestMethod.GET)
    public ModelAndView deleteCustomer(@PathVariable("customerId") int customerId) throws Exception {
    	customerService.deleteCustomer(customerId);
     return new ModelAndView("forward:/listOfCustomers");
    }
    
}


