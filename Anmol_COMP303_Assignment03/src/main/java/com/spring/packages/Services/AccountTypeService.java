//Anmol Singh 301145362
package com.spring.packages.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.packages.Entities.AccountTypeEntity;

@Service
//Service class for Account
public class AccountTypeService {
	//hash map to store Account type data
	Map<Integer, AccountTypeEntity> accountTypeMap = new HashMap<>();
	//Add Account Type
    public void addAccountType(AccountTypeEntity accountType) throws Exception {
        if(accountTypeMap.containsKey(accountType.getAccountTypeId())) {
            throw new Exception("This Account Type Id already exists");
        }
        else {
        	accountTypeMap.put(accountType.getAccountTypeId(), accountType);
        }
    }
    
    //get the Account Type list
    public Iterable<AccountTypeEntity > getAccountTypes(){
        return accountTypeMap.values();
    }
    
    //get a Account Type specified by AccountTypeId
    public AccountTypeEntity  getAccountType(int accountTypeId) throws Exception {

        if(accountTypeMap.containsKey(accountTypeId)) {
            return accountTypeMap.get(accountTypeId);
        }
        else {
            throw new Exception("Account Type Id not found");
        }
    }
    
    //update an Account Type
    public void updateAccountType(AccountTypeEntity  accountType) throws Exception {
        if(accountTypeMap.containsKey(accountType.getAccountTypeId())) {
        	accountTypeMap.put(accountType.getAccountTypeId(), accountType);
        }
        else {
            throw new Exception("Account Type Id not found");
        }
    }
    //delete an Account Type
    public void deleteAccountType(int accountTypeId) throws Exception {
        if(accountTypeMap.containsKey(accountTypeId)) {
        	accountTypeMap.remove(accountTypeId);
        }
        else {
            throw new Exception("Account Type Id not found");
         
        }
    }

}
