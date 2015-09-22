package com.test.service.impl;

import java.util.List;

import com.test.bean.Machine;
import com.test.dao.MachineDAO;
import com.test.service.MachineService;

public class MachineServiceImpl implements MachineService {
	private MachineDAO machineDao;

	public MachineDAO getMachineDao() {
		return machineDao;
	}

	public void setMachineDao(MachineDAO machineDao) {
		this.machineDao = machineDao;
	}

	public void save(Machine machine) {
		this.machineDao.saveMachine(machine); 
	}

	public List<Machine> findAll() {
		return this.machineDao.findAllMachines();
	}

	public void delete(Machine machine) {
		this.machineDao.removeMachine(machine);
	}

	public void update(Machine machine) {
		this.machineDao.updateMachine(machine);
	}

	public Machine findById(int id) {
		return this.machineDao.findMachineById(id);
	}

}
