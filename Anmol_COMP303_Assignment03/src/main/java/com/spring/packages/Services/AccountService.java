//Anmol Singh 301145362
package com.spring.packages.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.packages.Entities.AccountEntity;

@Service
//Service class for Account
public class AccountService {
	//hash map to store account data
	Map<Integer, AccountEntity> accountRepository = new HashMap<>();

    public void addAccount(AccountEntity account) throws Exception {
    	//check existence
        if(accountRepository.containsKey(account.getAccountNumber())) {
            throw new Exception("This account number already exists");
        }
        else {
        	accountRepository.put(account.getAccountNumber(), account);
        }
    }
    //get the list of accounts
    public Iterable<AccountEntity> getAccount(){
        return accountRepository.values();
    }
    //get an account specified by account number
    public AccountEntity getAccount(int accountNumber) throws Exception {

        if(accountRepository.containsKey(accountNumber)) {
            return accountRepository.get(accountNumber);
        }
        else {
            throw new Exception("Account Id not found");
        }
    }
    //update an account
    public void updateAccount(AccountEntity account) throws Exception {
        if(accountRepository.containsKey(account.getAccountNumber())) {
        	accountRepository.put(account.getAccountNumber(), account);
        }
        else {
            throw new Exception("Account Id not found");
        }
    }
    //delete an account
    public void deleteAccount(int accountNumber) throws Exception {
        if(accountRepository.containsKey(accountNumber)) {
        	accountRepository.remove(accountNumber);
        }
        else {
            throw new Exception("Account Id not found");
        }
    }

}
