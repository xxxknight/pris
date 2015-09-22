package com.test.action.machine;

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
import com.test.bean.Machine;
import com.test.service.MachineService;

public class MachineAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Machine machine;
	
	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	private MachineService service;

	public MachineService getService() {
		return service;
	}

	public void setService(MachineService service) {
		this.service = service;
	}

	public String listMachine1() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.getService().findAll());
		return SUCCESS;
	}

	public void listMachine() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Machine> list = this.service.findAll();
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

	public String saveMachine() throws Exception {
		this.service.save(this.machine);
		return SUCCESS;
	}

	public String updateMachine() throws Exception {
		this.service.update(this.machine);
		return SUCCESS;
	}

	public String deleteMachine() throws Exception {
		System.out.println("delete");
		this.service.delete(this.machine);
		System.out.println("delete");
		return SUCCESS;
	}
	
	public String index() throws Exception {
		return SUCCESS;
	}

}
