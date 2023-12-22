package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @InjectMocks
    Person person = new Person();

    @InjectMocks
    PersonRepository repository = new PersonRepository();

    @Test
    void insert() {
        Person result = repository.insert(person);
        assertEquals(person, result);
        boolean isOk = false;
        try {
            repository.insert(null);
            isOk = false;
        } catch (NullPointerException e) {
            isOk = true;
        }
        assertTrue(isOk);
    }

    @Test
    void update() {
        boolean isOk = false;
        try {
            repository.update(null);
        } catch (NullPointerException e) {
            isOk = true;
        }
        assertTrue(isOk);
    }

    @Test
    void delete() {
        boolean isOk = false;
        try {
            repository.delete(null);
        } catch (NullPointerException e) {
            isOk = true;
        }
        assertTrue(isOk);
    }

    @Test
    void get() {

        String name = "alireza";
        Person result = repository.get(name);
        assertNull(result);
        boolean isOk = false;
        try {
            repository.get(null);
        } catch (NullPointerException e) {
            isOk = true;
        }
        assertTrue(isOk);
    }
}