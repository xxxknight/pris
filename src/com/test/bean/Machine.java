package com.test.bean;

/**
 * Machine entity. @author MyEclipse Persistence Tools
 */

public class Machine implements java.io.Serializable {

	// Fields

	private Integer id;
	private String location;
	private String name;
	private String type;
	private String ip;
	private String usage;
	private String account;
	private String password;
	private String remark;
	private String manager;

	// Constructors

	/** default constructor */
	public Machine() {
	}

	/** full constructor */
	public Machine(String location, String name, String type, String ip,
			String usage, String account, String password, String remark,
			String manager) {
		this.location = location;
		this.name = name;
		this.type = type;
		this.ip = ip;
		this.usage = usage;
		this.account = account;
		this.password = password;
		this.remark = remark;
		this.manager = manager;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}