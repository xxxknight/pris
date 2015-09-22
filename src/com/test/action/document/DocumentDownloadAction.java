package com.test.action.document;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;
import com.test.service.DocumentService;

public class DocumentDownloadAction extends ActionSupport {
	private int documentId;
	private DocumentService documentService;

	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	// 下载文件
	public String download() throws IOException {
		int id = this.getDocumentId();
		System.out.println(id);
		this.documentService.handleDownload(id);
		return null;
	}

}
