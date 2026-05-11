package com.example.BankTransactionSimulator.repository;
import com.example.BankTransactionSimulator.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionHistory, Long> {

    List<TransactionHistory> findByFromAccountOrToAccount(
            Long from,
            Long to
    );
}