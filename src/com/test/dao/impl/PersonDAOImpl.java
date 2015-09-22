package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Person;
import com.test.dao.PersonDAO;

public class PersonDAOImpl extends HibernateDaoSupport implements PersonDAO {

	public void savePerson(Person person) {
		this.getHibernateTemplate().save(person);
	}

	public List<Person> findAllPersons() {
		String hql = "from Person person order by person.id desc";
		return (List<Person>) this.getHibernateTemplate().find(hql);
	}

	public void removePerson(Person person) {
		this.getHibernateTemplate().delete(person);
	}

	public void updatePerson(Person person) {
		this.getHibernateTemplate().update(person);
	}

	public Person findPersonById(int id) {
		return this.getHibernateTemplate().get(Person.class, id);
	}
}
