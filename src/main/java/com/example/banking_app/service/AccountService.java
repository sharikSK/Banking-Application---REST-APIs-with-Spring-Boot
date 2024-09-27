package com.example.banking_app.service;

import com.example.banking_app.model.Account;
import com.example.banking_app.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String accountHolderName, Double initialDeposit) {
        Account account = new Account(accountHolderName, initialDeposit);
        return accountRepository.save(account);
    }

    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account deposit(Long accountId, Double amount) {
        Account account = getAccountById(accountId);
        account.setBalance(account.getBalance() + amount);
        return accountRepository.save(account);
    }

    public Account withdraw(Long accountId, Double amount) {
        Account account = getAccountById(accountId);
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        account.setBalance(account.getBalance() - amount);
        return accountRepository.save(account);
    }

    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
