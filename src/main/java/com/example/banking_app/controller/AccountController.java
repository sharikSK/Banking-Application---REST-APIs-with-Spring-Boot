package com.example.banking_app.controller;

import com.example.banking_app.model.Account;
import com.example.banking_app.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestParam String accountHolderName, @RequestParam Double initialDeposit) {
        Account account = accountService.createAccount(accountHolderName, initialDeposit);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable Long id) {
        Account account = accountService.getAccountById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/{id}/deposit")
    public ResponseEntity<Account> deposit(@PathVariable Long id, @RequestParam Double amount) {
        Account account = accountService.deposit(id, amount);
        return ResponseEntity.ok(account);
    }

    @PutMapping("/{id}/withdraw")
    public ResponseEntity<Account> withdraw(@PathVariable Long id, @RequestParam Double amount) {
        Account account = accountService.withdraw(id, amount);
        return ResponseEntity.ok(account);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok().build();
    }
}
