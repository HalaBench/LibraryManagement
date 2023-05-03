package com.librarymanagementexample.librarymanagement.repositories;

import com.librarymanagementexample.librarymanagement.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
