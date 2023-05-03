package com.librarymanagementexample.librarymanagement.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

}
