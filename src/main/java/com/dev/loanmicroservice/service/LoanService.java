package com.dev.loanmicroservice.service;

import java.util.List;

import com.dev.loanmicroservice.model.Loan;

public interface LoanService {
    List<Loan> getAllLoans();

    Loan getLoanById(Long id);

    Loan createLoan(Loan Loan);

    Loan updateLoan(Long id, Loan Loan);

    void deleteLoan(Long id);
}
