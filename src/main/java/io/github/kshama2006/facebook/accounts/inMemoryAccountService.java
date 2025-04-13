package io.github.kshama2006.facebook.accounts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface inMemoryAccountService {

    @Service
    public class InMemoryAccountService extends AccountService {

        private final List<Account> accounts = new ArrayList<>();

        @Override
        public Account createAccount(Account account) {
            accounts.add(account);
            return account;
        }

        @Override
        public List<Account> getAllAccounts() {
            return accounts;
        }

        @Override
        public Account getAccountById(long id) {
            return accounts.stream().filter(acc -> acc.getId() == id).findFirst().orElse(null);
        }

        @Override
        public Account updateAccountProfile(long id, String newProfile) {
            Account account = getAccountById(id);
            if (account != null) {
                account.setProfile(newProfile);
            }
            return account;
        }

        @Override
        public boolean deleteAccount(long id) {
            Account account = getAccountById(id);
            return account != null && accounts.remove(account);
        }
    }

}
