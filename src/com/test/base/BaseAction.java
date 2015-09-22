package com.test.base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.util.StringUtil;

/**
 * Action
 * 
 * @author Administrator
 * 
 */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String resultValue;
	protected final String SUCCESS = "success";
	protected final String REDIRECT = "redirect";
	protected final String ERROR = "error";
	protected final int PAGESIZE = 15;
	protected final String SUCCESSMSG = "保存成功!";

	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

	public HttpSession getSession() {
		return getRequest().getSession();
	}

	public String getSUCCESS() {
		return SUCCESS;
	}

	public String getREDIRECT() {
		return REDIRECT;
	}

	public String getERROR() {
		return ERROR;
	}

	public String getResultValue() {
		return resultValue;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public int getCurrentPageNum() {
		int page = 1;
		if (getRequest().getParameter("page") != null) {
			try {
				page = Integer.parseInt(getRequest().getParameter("page"));
			} catch (NumberFormatException e) {
				page = 1;
			}
		}
		return page;
	}

	public void sendMessage(String message, String url) {
		HttpServletResponse response = getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		url = getRequest().getContextPath() + "/" + url;
		if (message != null && !"".equals(message)) {
			message = StringUtil.chinaToUnicode(message);
		} else {
			message = StringUtil.chinaToUnicode(this.SUCCESSMSG);
		}
		try {
			out = response.getWriter();
			out.println("<script language=JavaScript>");
			out.println("alert(\"" + message + "\")");
			out.println("top.location.href=\"" + url + "\";");
			out.println("</script>");
			out.flush();
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

	
	public void sendMessage(String message, String url, String target) {
		HttpServletResponse response = getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		url = getRequest().getContextPath() + "/" + url;
		if (message != null && !"".equals(message)) {
			message = StringUtil.chinaToUnicode(message);
		} else {
			message = StringUtil.chinaToUnicode(this.SUCCESSMSG);
		}
		try {
			out = response.getWriter();
			out.println("<script language=JavaScript>");
			out.println("alert(\"" + message + "\")");
			out.println("top." + target + ".location.href=\"" + url + "\";");
			out.println("</script>");
			out.flush();
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

}
