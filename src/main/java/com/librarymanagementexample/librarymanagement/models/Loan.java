package com.librarymanagementexample.librarymanagement.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Temporal(TemporalType.DATE)
    private Date issueDate;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Temporal(TemporalType.DATE)
    private Date returnDate;

}
