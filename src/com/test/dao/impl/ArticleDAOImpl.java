package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Article;
import com.test.dao.ArticleDAO;

public class ArticleDAOImpl extends HibernateDaoSupport implements ArticleDAO {

	public void saveArticle(Article article) {
		this.getHibernateTemplate().save(article);
	}

	public List<Article> findAllArticles() {
		String hql = "from Article article order by article.id desc";
		return (List<Article>) this.getHibernateTemplate().find(hql);
	}

	public void removeArticle(Article article) {
		this.getHibernateTemplate().delete(article);
	}

	public void updateArticle(Article article) {
		this.getHibernateTemplate().saveOrUpdate(article);
	}

	public Article findArticleById(int id) {
		return this.getHibernateTemplate().get(Article.class, id);
	}
}
