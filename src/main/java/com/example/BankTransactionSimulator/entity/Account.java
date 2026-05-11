package com.example.BankTransactionSimulator.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.concurrent.locks.ReentrantLock;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holderName;

    private Double balance;

    @Transient
    private final ReentrantLock lock = new ReentrantLock();
}