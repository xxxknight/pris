package com.test.dao;

import java.util.List;

import com.test.bean.Person;

public interface PersonDAO {
	public void savePerson(Person person);

	public List<Person> findAllPersons();

	public void removePerson(Person person);

	public void updatePerson(Person person);

	public Person findPersonById(int id);

}
