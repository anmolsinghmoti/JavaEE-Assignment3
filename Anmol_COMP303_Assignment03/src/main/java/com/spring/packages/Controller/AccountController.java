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

import com.spring.packages.Entities.AccountEntity;
import com.spring.packages.Services.AccountService;
@RestController
//Account controller for REST api
public class AccountController {

	@Autowired
    AccountService accountService;
	
	//GET
    @RequestMapping(value = "/account/{accountNumber}", method = RequestMethod.GET)
    AccountEntity getAccount(@PathVariable("accountNumber") int accountNumber) throws Exception {
        return accountService.getAccount(accountNumber);
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    Iterable<AccountEntity> getAccounts() {
        return accountService.getAccount();
    }
    //POST
    @RequestMapping(value = "/postAccount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addAccount(@RequestBody AccountEntity account) throws Exception {
    	accountService.addAccount(account);
    }
    
    //PUT
    @RequestMapping(value = "/account/{accountNumber}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateAccount(@PathVariable("accountNumber") int accountNumber, @RequestBody AccountEntity account) throws Exception {
    	account.setCustomerId(accountNumber);
    	accountService.updateAccount(account);
    }
    
    //DELETE
    @RequestMapping(value = "/account/{accountNumber}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteAccount(@PathVariable("accountNumber") int accountNumber) throws Exception {
        accountService.deleteAccount(accountNumber);
    }
}
