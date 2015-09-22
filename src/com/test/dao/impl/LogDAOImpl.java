package com.test.dao.impl;

import java.util.List;

import com.test.base.BaseDAO;
import com.test.bean.Person;
import com.test.dao.LogDAO;

public class LogDAOImpl extends BaseDAO implements LogDAO {

	@SuppressWarnings("unchecked")
	public boolean validLogin(String username, String password) {
		String hql = "from Person p where p.username=? and p.password=?";
		List<Person> list = this.getHibernateTemplate().find(hql,
				new Object[] { username, password });
		if (list.size() == 1) {
			return true;
		}
		return false;
	}

}
