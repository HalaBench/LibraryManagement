package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Librarian;
import com.librarymanagementexample.librarymanagement.repositories.LibrarianRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianService {

    private LibrarianRepository librarianRepository;

    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public List<Librarian> getAllLibrarians() {
        return librarianRepository.findAll();
    }

    public Librarian getLibrarianById(Long id) {
        return librarianRepository.findById(id).orElse(null);
    }

    public Librarian saveLibrarian(Librarian librarian) {
        return librarianRepository.save(librarian);
    }

    public void deleteLibrarian(Long id) {
        librarianRepository.deleteById(id);
    }
}
