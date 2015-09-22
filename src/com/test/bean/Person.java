package com.test.bean;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String username;
	private String password;
	private String name;
	private String sex;
	private String year;
	private Integer type;
	private String yl1;
	private String qq;
	private String phone;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(Integer uid, String username, String password, String year,
			Integer type) {
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.year = year;
		this.type = type;
	}

	/** full constructor */
	public Person(Integer uid, String username, String password, String name,
			String sex, String year, Integer type, String yl1, String qq,
			String phone) {
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.year = year;
		this.type = type;
		this.yl1 = yl1;
		this.qq = qq;
		this.phone = phone;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getYl1() {
		return this.yl1;
	}

	public void setYl1(String yl1) {
		this.yl1 = yl1;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}