package com.test.service.impl;

import java.util.List;

import com.test.bean.Article;
import com.test.dao.ArticleDAO;
import com.test.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDAO articleDao;

	public ArticleDAO getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}

	public void save(Article article) {
		this.articleDao.saveArticle(article); 
	}

	public List<Article> findAll() {
		return this.articleDao.findAllArticles();
	}

	public void delete(Article article) {
		this.articleDao.removeArticle(article);
	}

	public void update(Article article) {
		this.articleDao.updateArticle(article);
	}

	public Article findById(int id) {
		return this.articleDao.findArticleById(id);
	}

}
