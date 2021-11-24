package com.example.contactslistingapp.repository;

import com.example.contactslistingapp.entity.ContactPerson;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactPersonRepository extends MongoRepository<ContactPerson,Long> {
}
