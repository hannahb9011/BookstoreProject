package com.softwareengineering.BookstoreDB.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder // This tells lombok to generate a builder for this class (see https://projectlombok.org/features/Builder)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private String username;
}
