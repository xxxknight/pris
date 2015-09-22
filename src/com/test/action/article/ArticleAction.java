package com.test.action.article;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Article;
import com.test.service.ArticleService;

public class ArticleAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Article article;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	private ArticleService service;

	public ArticleService getService() {
		return service;
	}

	public void setService(ArticleService service) {
		this.service = service;
	}

	public String meetingArticle() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("meeting", this.getService().findById(this.getId()));
		return SUCCESS;
	}

	public String saveArticle() throws Exception {
		System.out.println("123455");
		this.service.save(this.article);
		return SUCCESS;
	}

	public String updateArticle() throws Exception {
		this.service.update(this.article);
		return SUCCESS;
	}

	public String deleteArticle() throws Exception {
		System.out.println("delete");
		this.service.delete(this.article);
		System.out.println("delete");
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
