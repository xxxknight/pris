package com.test.action.matter;

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
import com.test.bean.Matter;
import com.test.service.MatterService;

public class MatterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Matter matter;
	
	public Matter getMatter() {
		return matter;
	}

	public void setMatter(Matter matter) {
		this.matter = matter;
	}

	private MatterService service;

	public MatterService getService() {
		return service;
	}

	public void setService(MatterService service) {
		this.service = service;
	}

	public String listMatter1() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.getService().findAll());
		return SUCCESS;
	}

	public void listMatter() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Matter> list = this.service.findAll();
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

	public String saveMatter() throws Exception {
		this.service.save(this.matter);
		return SUCCESS;
	}

	public String updateMatter() throws Exception {
		this.service.update(this.matter);
		return SUCCESS;
	}

	public String deleteMatter() throws Exception {
		System.out.println("delete");
		this.service.delete(this.matter);
		System.out.println("delete");
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
