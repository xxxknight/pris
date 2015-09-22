package com.test.action.arrange;

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
import com.test.bean.Arrange;
import com.test.service.ArrangeService;

public class ArrangeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Arrange arrange;

	public Arrange getArrange() {
		return arrange;
	}

	public void setArrange(Arrange arrange) {
		this.arrange = arrange;
	}

	private ArrangeService service;

	public ArrangeService getService() {
		return service;
	}

	public void setService(ArrangeService service) {
		this.service = service;
	}

	public String listArrange1() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.getService().findAll());
		return SUCCESS;
	}

	public void listArrange() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Arrange> list = this.service.findAll();
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

	public String saveArrange() throws Exception {
		this.service.save(this.arrange);
		return SUCCESS;
	}

	public String updateArrange() throws Exception {
		this.service.update(this.arrange);
		return SUCCESS;
	}

	public String deleteArrange() throws Exception {
		System.out.println("delete");
		this.service.delete(this.arrange);
		System.out.println("delete");
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
