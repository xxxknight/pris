package com.test.dao.impl;

import java.util.List;

import com.test.base.BaseDAO;
import com.test.bean.Arrange;
import com.test.dao.ArrangeDAO;

public class ArrangeDAOImpl extends BaseDAO implements ArrangeDAO {

	public void saveArrange(Arrange arrange) {
		this.getHibernateTemplate().save(arrange);
	}

	public List<Arrange> findAllArranges() {
		String hql = "from Arrange arrange order by arrange.id desc";
		return (List<Arrange>) this.getHibernateTemplate().find(hql);
	}

	public void removeArrange(Arrange arrange) {
		this.getHibernateTemplate().delete(arrange);
	}

	public void updateArrange(Arrange arrange) {
		this.getHibernateTemplate().update(arrange);
	}

	public Arrange findArrangeById(int id) {
		return this.getHibernateTemplate().get(Arrange.class, id);
	}

	public Arrange findNewArrange() {
		List<Arrange> list = null;
		String hql = "from Arrange a where a.id = (select max(id) from Arrange)";
		list = this.getHibernateTemplate().find(hql);
		return list.get(0);
	}
}
