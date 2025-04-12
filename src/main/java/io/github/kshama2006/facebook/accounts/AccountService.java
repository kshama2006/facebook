package io.github.kshama2006.facebook.accounts;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AccountService {
    private List<Account> accountList;

    public AccountService() {
        accountList = new LinkedList<>();
    }

    //CRUD - CREATE READ UPDATE DELETE
    //CREATE
    public Account addAccount(Account account) {
        accountList.add(account);
        return account;

    }

    //READ
    public List<Account> getAccountList() {
        return accountList;
    }

    //READ - Single Products:
    public Account getAccount(Long id) {
        return accountList.stream()
                .filter(account -> account.getId().equals(id)
                ).findFirst()
                .orElse(null);

    }

    //UPDATE
    public Account updateAccount(Account account) {
        accountList.stream()
                .filter(Account -> account.getId().equals(account.getId()))
                .findFirst()
                .ifPresent(Account -> account.setId(account.getId()));

        return account;

    }

    //DELETE
    public boolean deleteAccount(Account account) {
        accountList.remove(account);
        return true;
    }


}


