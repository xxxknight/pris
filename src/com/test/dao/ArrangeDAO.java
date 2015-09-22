package com.test.dao;

import java.util.List;

import com.test.bean.Arrange;

public interface ArrangeDAO {
	public void saveArrange(Arrange arrange);

	public List<Arrange> findAllArranges();

	public void removeArrange(Arrange arrange);

	public void updateArrange(Arrange arrange);

	public Arrange findArrangeById(int id);

	public Arrange findNewArrange();

}
