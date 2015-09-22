package com.test.action.bug;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Bug;
import com.test.service.BugService;

public class BugAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Bug bug;
	
	public Bug getBug() {
		return bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	private BugService service;

	public BugService getService() {
		return service;
	}

	public void setService(BugService service) {
		this.service = service;
	}

	public String listBug1() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.getService().findAll());
		return SUCCESS;
	}

	public void listBug() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Bug> list = this.service.findAll();
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

	public String saveBug() throws Exception {
		this.service.save(this.bug);
		return SUCCESS;
	}

	public String updateBug() throws Exception {
		this.service.update(this.bug);
		return SUCCESS;
	}

	public String deleteBug() throws Exception {
		System.out.println("delete");
		this.service.delete(this.bug);
		System.out.println("delete");
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
