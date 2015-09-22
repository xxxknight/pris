package com.test.dao;

import java.util.List;

import com.test.bean.Document;

public interface DocumentDAO {
	public void saveDocument(Document document);

	public List<Document> findAllDocuments();
	
	public void removeDocument(Document user);
	
	public void updateDocument(Document user);
	
	public Document findDocumentById(int id);

}
