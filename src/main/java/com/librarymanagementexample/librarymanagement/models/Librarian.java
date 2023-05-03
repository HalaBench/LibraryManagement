package com.librarymanagementexample.librarymanagement.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@Table(name = "librarian")
public class Librarian extends Person{

    private String employeeNumber;

    @Temporal(TemporalType.DATE)
    private Date hireDate;
}
