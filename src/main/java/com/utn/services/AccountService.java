package com.utn.services;

import com.utn.models.Account;
import com.utn.models.City;
import com.utn.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Matias on 16/08/2018.
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * save a new account.
     */
    public void save (Account account){
        accountRepository.save(account);
    }

    /**
     * save a new account 2.
     */
    public void save(String name, String surname, String email, int age, int phone, City city){
        Account account = new Account();
        account.setName(name);
        account.setSurname(surname);
        account.setEmail(email);
        account.setAge(age);
        account.setPhone(phone);
        account.setCity(city);
        accountRepository.save(account);
    }

    /**
     * update an account by id.
     */
    public void save(Long id, String name, String surname, String email, int age, int phone, City city){
        Account account = accountRepository.findAccountById(id);
        account.setName(name);
        account.setSurname(surname);
        account.setEmail(email);
        account.setAge(age);
        account.setPhone(phone);
        account.setCity(city);
        accountRepository.save(account);
    }

    /**
     * delete by id.
     */
    public void delete(Long id){
        accountRepository.delete(accountRepository.findAccountById(id));
    }

    /**
     * find an account by id.
     */
    public Account findById(Long id){
        return accountRepository.findAccountById(id);
    }

    /**
     * find an account by phone.
     */
    public Account findByPhone(int phone){
        return accountRepository.findAccountByPhone(phone);
    }

    /**
     * "find" etcétera.
     */
}
