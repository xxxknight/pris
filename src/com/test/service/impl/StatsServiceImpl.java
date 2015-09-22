package com.test.service.impl;

import java.util.List;

import com.test.bean.Statstravel;
import com.test.dao.StatsDAO;
import com.test.service.StatsService;

public class StatsServiceImpl implements StatsService {
	private StatsDAO statsDao;

	public StatsDAO getStatsDao() {
		return statsDao;
	}

	public void setStatsDao(StatsDAO statsDao) {
		this.statsDao = statsDao;
	}

	public List<Statstravel> findCount() {
		return statsDao.findCount();
	}
}
