package com.librarymanagementexample.librarymanagement.repositories;

import com.librarymanagementexample.librarymanagement.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
