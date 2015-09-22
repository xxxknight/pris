package com.test.service.impl;

import java.util.List;

import com.test.bean.Arrange;
import com.test.dao.ArrangeDAO;
import com.test.service.ArrangeService;

public class ArrangeServiceImpl implements ArrangeService {
	private ArrangeDAO arrangeDao;

	public ArrangeDAO getArrangeDao() {
		return arrangeDao;
	}

	public void setArrangeDao(ArrangeDAO arrangeDao) {
		this.arrangeDao = arrangeDao;
	}

	public void save(Arrange arrange) {
		this.arrangeDao.saveArrange(arrange);
	}

	public List<Arrange> findAll() {
		return this.arrangeDao.findAllArranges();
	}

	public void delete(Arrange arrange) {
		this.arrangeDao.removeArrange(arrange);
	}

	public void update(Arrange arrange) {
		this.arrangeDao.updateArrange(arrange);
	}

	public Arrange findById(int id) {
		return this.arrangeDao.findArrangeById(id);
	}

	public Arrange findNewArrange() {
		return this.arrangeDao.findNewArrange();
	}

}
