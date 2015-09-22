package com.test.service;

import java.util.List;

import com.test.bean.Bug;

public interface BugService {
	public void save(Bug bug);

	public List<Bug> findAll();
	
	public void delete(Bug bug);
	
	public Bug findById(int id);
	
	public void update(Bug bug);

}