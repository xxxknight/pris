package com.test.service;

import java.util.List;

import com.test.bean.Machine;

public interface MachineService {
	public void save(Machine machine);

	public List<Machine> findAll();
	
	public void delete(Machine machine);
	
	public Machine findById(int id);
	
	public void update(Machine machine);

}