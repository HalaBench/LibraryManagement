package com.librarymanagementexample.librarymanagement.repositories;

import com.librarymanagementexample.librarymanagement.models.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
