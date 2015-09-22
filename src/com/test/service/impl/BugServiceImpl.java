package com.test.service.impl;

import java.util.List;

import com.test.bean.Bug;
import com.test.dao.BugDAO;
import com.test.service.BugService;

public class BugServiceImpl implements BugService {
	private BugDAO bugDao;

	public BugDAO getBugDao() {
		return bugDao;
	}

	public void setBugDao(BugDAO bugDao) {
		this.bugDao = bugDao;
	}

	public void save(Bug bug) {
		this.bugDao.saveBug(bug); 
	}

	public List<Bug> findAll() {
		return this.bugDao.findAllBugs();
	}

	public void delete(Bug bug) {
		this.bugDao.removeBug(bug);
	}

	public void update(Bug bug) {
		this.bugDao.updateBug(bug);
	}

	public Bug findById(int id) {
		return this.bugDao.findBugById(id);
	}

}
