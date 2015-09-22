package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Document;
import com.test.dao.DocumentDAO;

public  class DocumentDAOImpl extends HibernateDaoSupport implements DocumentDAO {

	public void saveDocument(Document document) {
		this.getHibernateTemplate().save(document);
	}

	public List<Document> findAllDocuments() {
		String hql = "from Document document order by document.id desc";
		return (List<Document>) this.getHibernateTemplate().find(hql);
	}

	public void removeDocument(Document document) {
		this.getHibernateTemplate().delete(document);
	}

	public void updateDocument(Document document) {
		this.getHibernateTemplate().update(document);
	}

	public Document findDocumentById(int id) {
		return this.getHibernateTemplate().get(Document.class, id);
	}

}
