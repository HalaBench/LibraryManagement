package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Loan;
import com.librarymanagementexample.librarymanagement.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }


    public Loan createLoan(Loan loan) {
        loan.setIssueDate(new Date());
        loan.setDueDate(new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000L)); // Set due date to two weeks from now
        return loanRepository.save(loan);
    }

    public void endLoan(Long loanId) {
        Optional<Loan> loanOptional = loanRepository.findById(loanId);
        if (loanOptional.isPresent()) {
            Loan loan = loanOptional.get();
            loan.setReturnDate(new Date());
            loanRepository.save(loan);
        }
    }
}
