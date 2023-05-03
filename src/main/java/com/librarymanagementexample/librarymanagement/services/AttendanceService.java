package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Attendance;
import com.librarymanagementexample.librarymanagement.repositories.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    private AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    public Attendance registerAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public void unregisterAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }
}
