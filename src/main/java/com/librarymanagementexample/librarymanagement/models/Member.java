package com.librarymanagementexample.librarymanagement.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@Table(name = "member")
public class Member extends Person{

    @Temporal(TemporalType.DATE)
    private Date joinDate;
    private String status;


}
