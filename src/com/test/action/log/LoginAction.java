package com.test.action.log;

import com.opensymphony.xwork2.ActionContext;
import com.test.base.BaseAction;
import com.test.service.LogService;

public class LoginAction extends BaseAction {

	private String username;
	private String password;
	private LogService logService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LogService getLogService() {
		return logService;
	}

	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		boolean result = this.logService.validLogin(this.getUsername(), this
				.getPassword());
		if (result == true) {
			ctx.getSession().put("username", this.getUsername());
			ctx.getSession().put("flag", true);
			return SUCCESS;
		} else {
			this.sendMessage("请检查您的账号和密码!", "admin/login.jsp");
			return ERROR;
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
