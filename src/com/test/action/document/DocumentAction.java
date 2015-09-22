package com.test.action.document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Bug;
import com.test.bean.Document;
import com.test.service.DocumentService;
import com.test.util.DateUtil;

public class DocumentAction extends ActionSupport {
	private DocumentService service;

	private String uname;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void setSavePath(String value) {
		this.savePath = value;
	}

	private String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public File getUpload() {
		return (this.upload);
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadContentType() {
		return (this.uploadContentType);
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadFileName() {
		return (this.uploadFileName);
	}

	public DocumentService getService() {
		return service;
	}

	public void setService(DocumentService service) {
		this.service = service;
	}

	public void listDocument() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Document> list = this.service.findAll();
			Map<Object, Object> info = new HashMap<Object, Object>();
			info.put("data", list);
			String json = gson.toJson(info);
			out.println(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String upload() {
		String newFileName = newFileName();
		try {
			FileOutputStream fos = new FileOutputStream(getSavePath() + "\\"
					+ newFileName);
			FileInputStream fis = new FileInputStream(getUpload());
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
			createDocument(newFileName);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public void createDocument(String newFileName) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		this.document.setUpTime(df.format(new Date()));
		
		this.document.setFileName(newFileName);
		this.document.setUpUrl(this.savePath + "/" + newFileName);
		this.document.setUpPeople(this.getUname());
		this.service.save(this.document);
	}
	
	public String newFileName(){
		
		String randomStr = DateUtil.generateDateString(4); // 产生日期形式的随机数，确保上传文件不重名
		String newFileName = randomStr + this.getUploadFileName();
		return newFileName;
	}
}