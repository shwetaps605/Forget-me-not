package com.example.contactslistingapp.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Document
@Data
public class ContactPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @Indexed(unique = true)
    private String email;
    private Long contactNumber;
    private Address address;
    private LocalDateTime created;

    public ContactPerson(String firstName,
                         String lastName,
                         Gender gender,
                         String email,
                         Long contactNumber,
                         Address address,
                         LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
        this.created = created;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", address=" + address +
                ", created=" + created +
                '}';
    }
}
