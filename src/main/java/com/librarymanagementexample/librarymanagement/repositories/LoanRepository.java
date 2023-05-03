package com.librarymanagementexample.librarymanagement.repositories;

import com.librarymanagementexample.librarymanagement.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
