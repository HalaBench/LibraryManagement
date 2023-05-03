package com.librarymanagementexample.librarymanagement.services;

import com.librarymanagementexample.librarymanagement.models.Book;
import com.librarymanagementexample.librarymanagement.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public boolean isAvailable(Long bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            return book.isAvailable();
        }
        return false;
    }

    public void setStatus(Long bookId, String status) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book.setStatus(status);
            bookRepository.save(book);
        }
    }

    public Book updateBook(Long bookId, Book book) {
            Optional<Book> bookOptional = bookRepository.findById(bookId);
            if (bookOptional.isPresent()) {
                Book bookToUpdate = bookOptional.get();
                bookToUpdate.setAuthor(book.getAuthor());
                bookToUpdate.setTitle(book.getTitle());
                bookToUpdate.setPublicationDate(book.getPublicationDate());
                bookToUpdate.setIsbn(book.getIsbn());
                bookToUpdate.setGenre(book.getGenre());
                bookToUpdate.setStatus(book.getStatus());
                return bookRepository.save(bookToUpdate);
            }
            return null;
        }


}
