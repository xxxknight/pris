package com.test.service;

import java.util.List;

import com.test.bean.Person;

public interface PersonService {
	public void save(Person person);

	public List<Person> findAll();

	public void delete(Person person);

	public Person findById(int id);

	public void update(Person person);

}