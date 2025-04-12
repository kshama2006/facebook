package io.github.kshama2006.facebook.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST - Representational State Transfer
//JESON - JavaScript Object Notation
@RestController
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //CREATE - POST
    @PostMapping("/accounts/add")
    public Account addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
        return account;
    }

    //READ - GET
    @GetMapping("/accounts")
    public List<Account> getAccontList() {
        return accountService.getAccountList();
    }

    //READ - GET
    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    //UPDATE - PUT
    @PutMapping("/accounts")
    public Account updateAccount(@RequestBody Account account){
       return accountService.updateAccount(account);

    }

    //DELETE - DELETE
    @DeleteMapping("/accounts")
    public Account deleteAccount(@RequestBody Account account) {
        accountService.deleteAccount(account);
        return account;
    }

    //REQUEST - HTTP METHOD & URL
    // RESPONSE - STATUS & RESPONSE BODY
}
