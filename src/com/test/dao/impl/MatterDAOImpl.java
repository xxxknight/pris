package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Matter;
import com.test.dao.MatterDAO;

public class MatterDAOImpl extends HibernateDaoSupport implements MatterDAO {

	public void saveMatter(Matter matter) {
		this.getHibernateTemplate().save(matter);
	}

	public List<Matter> findAllMatters() {
		String hql = "from Matter matter order by matter.id desc";
		return (List<Matter>) this.getHibernateTemplate().find(hql);
	}

	public void removeMatter(Matter matter) {
		this.getHibernateTemplate().delete(matter);
	}

	public void updateMatter(Matter matter) {
		this.getHibernateTemplate().update(matter);
	}

	public Matter findMatterById(int id) {
		return this.getHibernateTemplate().get(Matter.class, id);
	}
}
