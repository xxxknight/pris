package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Machine;
import com.test.dao.MachineDAO;

public class MachineDAOImpl extends HibernateDaoSupport implements MachineDAO {

	public void saveMachine(Machine machine) {
		this.getHibernateTemplate().save(machine);
	}

	public List<Machine> findAllMachines() {
		String hql = "from Machine machine order by machine.id desc";
		return (List<Machine>) this.getHibernateTemplate().find(hql);
	}

	public void removeMachine(Machine machine) {
		this.getHibernateTemplate().delete(machine);
	}

	public void updateMachine(Machine machine) {
		this.getHibernateTemplate().update(machine);
	}

	public Machine findMachineById(int id) {
		return this.getHibernateTemplate().get(Machine.class, id);
	}
}
