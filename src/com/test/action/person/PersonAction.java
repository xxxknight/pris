package com.test.action.person;

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
import com.test.bean.Person;
import com.test.service.PersonService;

public class PersonAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private PersonService service;

	public PersonService getService() {
		return service;
	}

	public void setService(PersonService service) {
		this.service = service;
	}

	public String listPerson1() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.getService().findAll());
		return SUCCESS;
	}

	public void listPerson() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Person> list = this.service.findAll();
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

	public String savePerson() throws Exception {
		this.service.save(this.person);
		return SUCCESS;
	}

	public String updatePerson() throws Exception {
		this.service.update(this.person);
		return SUCCESS;
	}

	public String deletePerson() throws Exception {
		System.out.println("delete");
		this.service.delete(this.person);
		System.out.println("delete");
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
