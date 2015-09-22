package com.test.dao;

import java.util.List;

import com.test.bean.Bug;

public interface BugDAO {
	public void saveBug(Bug bug);

	public List<Bug> findAllBugs();

	public void removeBug(Bug bug);

	public void updateBug(Bug bug);

	public Bug findBugById(int id);

}
