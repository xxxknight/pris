package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Bug;
import com.test.dao.BugDAO;

public class BugDAOImpl extends HibernateDaoSupport implements BugDAO {

	public void saveBug(Bug bug) {
		this.getHibernateTemplate().save(bug);
	}

	public List<Bug> findAllBugs() {
		String hql = "from Bug bug order by bug.id desc";
		return (List<Bug>) this.getHibernateTemplate().find(hql);
	}

	public void removeBug(Bug bug) {
		this.getHibernateTemplate().delete(bug);
	}

	public void updateBug(Bug bug) {
		this.getHibernateTemplate().update(bug);
	}

	public Bug findBugById(int id) {
		return this.getHibernateTemplate().get(Bug.class, id);
	}
}
