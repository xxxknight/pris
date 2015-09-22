package com.test.service;

import java.util.List;

import com.test.bean.Arrange;

public interface ArrangeService {
	public void save(Arrange arrange);

	public List<Arrange> findAll();
	
	public void delete(Arrange arrange);
	
	public Arrange findById(int id);
	
	public void update(Arrange arrange);
	
	public Arrange findNewArrange();

}