package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Book;
import com.librarymanagementexample.librarymanagement.models.Event;
import com.librarymanagementexample.librarymanagement.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public void cancelEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public Event updateEvent(Long eventId, Event event) {
        Optional<Event> eventOptional = eventRepository.findById(eventId);
        if (eventOptional.isPresent()) {
            Event eventToUpdate = eventOptional.get();
            eventToUpdate.setName(event.getName());
            eventToUpdate.setDescription(event.getDescription());
            eventToUpdate.setStartDate(event.getStartDate());
            eventToUpdate.setEndDate(event.getEndDate());

            return eventRepository.save(eventToUpdate);
        }
        return null;
    }


}
