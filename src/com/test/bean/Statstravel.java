package com.test.bean;

/**
 * Statstravel entity. @author MyEclipse Persistence Tools
 */

public class Statstravel implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private Integer count;
	private Integer flag;

	// Constructors

	/** default constructor */
	public Statstravel() {
	}

	/** full constructor */
	public Statstravel(String uname, Integer count, Integer flag) {
		this.uname = uname;
		this.count = count;
		this.flag = flag;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}