package com.test.service.impl;

import com.test.dao.LogDAO;
import com.test.service.LogService;

public class LogServiceImpl implements LogService {
	private LogDAO logDao;
	

	public LogDAO getLogDao() {
		return logDao;
	}


	public void setLogDao(LogDAO logDao) {
		this.logDao = logDao;
	}


	public boolean validLogin(String username, String password) {
		return this.logDao.validLogin(username, password);
	}

}
