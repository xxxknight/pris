package com.test.service;

import java.util.List;

import com.test.bean.Article;

public interface ArticleService {
	public void save(Article article);

	public List<Article> findAll();
	
	public void delete(Article article);
	
	public Article findById(int id);
	
	public void update(Article article);

}