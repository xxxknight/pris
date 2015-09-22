package com.test.dao;

import java.util.List;

import com.test.bean.Machine;

public interface MachineDAO {
	public void saveMachine(Machine machine);

	public List<Machine> findAllMachines();

	public void removeMachine(Machine machine);

	public void updateMachine(Machine machine);

	public Machine findMachineById(int id);

}
