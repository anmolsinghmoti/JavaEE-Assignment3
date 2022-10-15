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

import com.spring.packages.Entities.AccountTypeEntity;
import com.spring.packages.Services.AccountTypeService;

@RestController
//Controller class for Account type
public class AccountTypeController {

		@Autowired(required=true)
	    AccountTypeService accountTypeService;
		
		//GET
	    @RequestMapping(value = "/accountType/{accountTypeId}", method = RequestMethod.GET)
	    AccountTypeEntity getAccountType(@PathVariable("accountTypeId") int accountTypeId) throws Exception {
	        return accountTypeService.getAccountType(accountTypeId);
	    }

	    @RequestMapping(value = "/accountTypes", method = RequestMethod.GET)
	    Iterable<AccountTypeEntity> getAccountTypes() {
	        return accountTypeService.getAccountTypes();
	    }
	    //POST
	    @RequestMapping(value = "/postAccountType", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseStatus(value = HttpStatus.OK)
	    void addAccountType(@RequestBody AccountTypeEntity accountType) throws Exception {
	    	accountTypeService.addAccountType(accountType);
	    }
	    
	    //PUT
	    @RequestMapping(value = "/accountType/{accountTypeId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseStatus(value = HttpStatus.OK)
	    void updateAccountType(@PathVariable("accountTypeId") int accountTypeId, @RequestBody AccountTypeEntity accountType) throws Exception {
	    	accountType.setAccountTypeId(accountTypeId);
	    	accountTypeService.updateAccountType(accountType);
	    }
	    
	    //DELETE
	    @RequestMapping(value = "/accountType/{accountTypeId}", method = RequestMethod.DELETE)
	    @ResponseStatus(value = HttpStatus.OK)
	    void deleteAccountType(@PathVariable("accountTypeId") int accountTypeId) throws Exception {
	        accountTypeService.deleteAccountType(accountTypeId);
	    }
}
