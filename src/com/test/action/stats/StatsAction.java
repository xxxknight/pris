package com.test.action.stats;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Statstravel;
import com.test.service.StatsService;

public class StatsAction extends ActionSupport {
	private StatsService service;
	private String fromTime;
	private String toTime;

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public StatsService getService() {
		return service;
	}

	public void setService(StatsService service) {
		this.service = service;
	}

	public void statsTravel() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			Gson gson = new Gson();
			List<Statstravel> list = this.service.findCount();
			List<String> list1 = new ArrayList<String>();
			List<String> list3 = new ArrayList<String>();
			List<Integer> list2 = new ArrayList<Integer>();
			List<Integer> list4 = new ArrayList<Integer>();
			for (int i = 0; i < list.size(); i++) {
				Statstravel st = list.get(i);
				int flag = st.getFlag();
				if (flag == 1) {
					list1.add(st.getUname());
					list2.add(st.getCount());
				} else if (flag == 2) {
					list3.add(st.getUname());
					list4.add(st.getCount());
				}
			}

			Map<String, List<?>> json = new HashMap<String, List<?>>();
			json.put("people", list1);
			json.put("number", list2);
			json.put("people2", list3);
			json.put("number2", list4);
			String s = gson.toJson(json);
			out.println(s);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String travel() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
