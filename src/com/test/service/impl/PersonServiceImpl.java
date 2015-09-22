package com.test.service.impl;

import java.util.List;

import com.test.bean.Person;
import com.test.dao.PersonDAO;
import com.test.service.PersonService;

public class PersonServiceImpl implements PersonService {
	private PersonDAO personDao;

	public PersonDAO getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDAO personDao) {
		this.personDao = personDao;
	}

	public void save(Person person) {
		this.personDao.savePerson(person);
	}

	public List<Person> findAll() {
		return this.personDao.findAllPersons();
	}

	public void delete(Person person) {
		this.personDao.removePerson(person);
	}

	public void update(Person person) {
		this.personDao.updatePerson(person);
	}

	public Person findById(int id) {
		return this.personDao.findPersonById(id);
	}

}
