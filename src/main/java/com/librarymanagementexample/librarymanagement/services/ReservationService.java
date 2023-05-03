package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Reservation;
import com.librarymanagementexample.librarymanagement.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }


    public Reservation createReservation(Reservation reservation) {
        reservation.setStatus("Reserved");
        return reservationRepository.save(reservation);
    }

    public void cancelReservation(Long reservationId) {
        Optional<Reservation> reservationOptional = reservationRepository.findById(reservationId);
        if (reservationOptional.isPresent()) {
            Reservation reservation = reservationOptional.get();
            reservation.setStatus("Cancelled");
            reservationRepository.save(reservation);
        }
    }
}
