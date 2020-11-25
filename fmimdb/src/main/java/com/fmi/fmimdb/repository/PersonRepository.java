package com.fmi.fmimdb.repository;

import com.fmi.fmimdb.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
        System.out.println("Added person " + person.toString());
    }

    public void removePerson(Person person) {
        personList.remove(person);
        System.out.println("Removed person " + person.toString());
    }

    public void updatePerson(Person originalPerson, Person updatedPerson) {
        personList.set(personList.indexOf(originalPerson), updatedPerson);
        System.out.println("Updated person " + originalPerson.toString() + " to " + updatedPerson.toString());
    }

}
