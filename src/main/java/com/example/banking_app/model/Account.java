package com.example.banking_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountHolderName;
    private Double balance;

    public Account() {
    }

    public Account(String accountHolderName, Double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
