package com.test.service.impl;

import java.util.List;

import com.test.bean.Matter;
import com.test.dao.MatterDAO;
import com.test.service.MatterService;

public class MatterServiceImpl implements MatterService {
	private MatterDAO matterDao;

	public MatterDAO getMatterDao() {
		return matterDao;
	}

	public void setMatterDao(MatterDAO matterDao) {
		this.matterDao = matterDao;
	}

	public void save(Matter matter) {
		this.matterDao.saveMatter(matter); 
	}

	public List<Matter> findAll() {
		return this.matterDao.findAllMatters();
	}

	public void delete(Matter matter) {
		this.matterDao.removeMatter(matter);
	}

	public void update(Matter matter) {
		this.matterDao.updateMatter(matter);
	}

	public Matter findById(int id) {
		return this.matterDao.findMatterById(id);
	}

}
