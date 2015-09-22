package com.test.service;

import java.util.List;

import com.test.bean.Matter;

public interface MatterService {
	public void save(Matter matter);

	public List<Matter> findAll();

	public void delete(Matter matter);

	public Matter findById(int id);

	public void update(Matter matter);

}