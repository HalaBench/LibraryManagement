package com.librarymanagementexample.librarymanagement.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book")
public class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    private String isbn;
    private String genre;
    private String status;

    //updateBook method
    public void updateBook(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publicationDate = book.getPublicationDate();
        this.isbn = book.getIsbn();
        this.genre = book.getGenre();
        this.status = book.getStatus();
    }


    //isAvailable method
    public boolean isAvailable() {
        return this.status.equals("Available");
    }
}
