package com.test.dao;

import java.util.List;

import com.test.bean.Article;

public interface ArticleDAO {
	public void saveArticle(Article article);

	public List<Article> findAllArticles();

	public void removeArticle(Article article);

	public void updateArticle(Article article);

	public Article findArticleById(int id);

}
