package com.robyn.peopleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeopleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleProjectApplication.class, args);
	Person colin = new Person(1, "colin", 4);
	PersonDAO personDAO = new PersonDataAccessService();
	PersonService personService = new PersonService(personDAO);
	personService.savePerson(colin);

	}

}
