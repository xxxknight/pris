package com.test.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.test.bean.Document;

public interface DocumentService {
	public void save(Document document);

	public List<Document> findAll();

	public void delete(Document document);

	public Document findById(int id);

	public void update(Document document);

	public String downloadFile(String fileName, String filePath,
			HttpServletResponse response) throws FileNotFoundException,
			IOException;

	public void handleDownload(int id);
}