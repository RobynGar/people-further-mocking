package com.robyn.peopleproject;

import java.util.ArrayList;
import java.util.List;

public class PersonDataAccessService implements PersonDAO {
    //initialise outside the constructor so that in can be
    // accessed everywhere in the class
    List<Person> people;

    // constructor
    public PersonDataAccessService() {
        //initialise this property by assigning it to this
        // array list
        this.people = new ArrayList<>();
    }

    @Override
    public void savePerson(Person person) {
       // this. used to specify that we mean the person property
        // in this class. To make the distinction between
        // which person we mean as person is also passed in as an argument above
        this.people.add(person);
    }

    @Override
    public void deletePerson(int id) {
        this.people.remove(getPersonById(id));
    }

    @Override
    public List<Person> getPeople() {
        return people;
    }

    @Override
    public Person getPersonById(int id) {
        for(Person p : people) {
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
}
