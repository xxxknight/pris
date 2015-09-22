package com.test.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.test.bean.Document;
import com.test.dao.DocumentDAO;
import com.test.service.DocumentService;

public class DocumentServiceImpl implements DocumentService {
	private DocumentDAO documentDao;

	public DocumentDAO getDocumentDao() {
		return documentDao;
	}

	public void setDocumentDao(DocumentDAO documentDao) {
		this.documentDao = documentDao;
	}

	public void save(Document document) {
		this.documentDao.saveDocument(document);
	}

	public List<Document> findAll() {
		return this.documentDao.findAllDocuments();
	}

	public void delete(Document document) {
		this.documentDao.removeDocument(document);
	}

	public void update(Document document) {
		this.documentDao.updateDocument(document);
	}

	public Document findById(int id) {
		return this.documentDao.findDocumentById(id);
	}

	/**
	 * 下载文件
	 * 
	 * @param filePath
	 *            --文件完整路径
	 * @param response
	 *            --HttpServletResponse对象
	 */
	public String downloadFile(String fileName, String filePath,
			HttpServletResponse response) throws FileNotFoundException,
			IOException {
		fileName = new String(fileName.substring(0, fileName.length()).getBytes("GB2312"), "ISO8859_1");

		String mess = "文件下载失败";
		// 设置响应头和保存文件名
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ fileName + "\"");
		// 写出流信息
		InputStream in = new FileInputStream(filePath);// 获取文件输入流
		int len = 0;
		byte[] buffer = new byte[1024];
		OutputStream out = response.getOutputStream();
		while ((len = in.read(buffer)) > 0) {
			out.write(buffer, 0, len);// 将缓冲区的数据输出到客户端浏览器
			mess = "文件下载完毕";
		}
		return mess;
	}

	public void handleDownload(int id) {
		String root = "";
		root = ServletActionContext.getServletContext().getRealPath("/"); // 获得系统根路径
		root = root.substring(0, root.length()-1);
		Document document = this.findById(id);
		String filePath = root + document.getUpUrl();
		String fileName = document.getFileName();
		System.out.println("filePath: " + filePath);
		System.out.println("fileName: " + fileName);
		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			this.downloadFile(fileName, filePath, response);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
