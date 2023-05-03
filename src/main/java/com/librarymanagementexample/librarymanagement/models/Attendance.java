package com.librarymanagementexample.librarymanagement.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
