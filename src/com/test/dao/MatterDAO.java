package com.test.dao;

import java.util.List;

import com.test.bean.Matter;

public interface MatterDAO {
	public void saveMatter(Matter matter);

	public List<Matter> findAllMatters();

	public void removeMatter(Matter matter);

	public void updateMatter(Matter matter);

	public Matter findMatterById(int id);

}
