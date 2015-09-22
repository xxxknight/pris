package com.test.dao.impl;

import java.util.List;

import com.test.base.BaseDAO;
import com.test.bean.Statstravel;
import com.test.dao.StatsDAO;

public class StatsDAOImpl extends BaseDAO implements StatsDAO {

	public List<Statstravel> findCount() {
		String hql = "from Statstravel st where st.flag <> 0";
		return (List<Statstravel>) this.getHibernateTemplate().find(hql);
	}
}
