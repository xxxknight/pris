package com.test.bean;

import java.util.Date;

/**
 * Bug entity. @author MyEclipse Persistence Tools
 */

public class Bug implements java.io.Serializable {

	// Fields

	private Integer id;
	private String bname;
	private Date edittime;
	private String description;
	private String attachment;
	private String person;

	// Constructors

	/** default constructor */
	public Bug() {
	}

	/** minimal constructor */
	public Bug(String bname) {
		this.bname = bname;
	}

	/** full constructor */
	public Bug(String bname, Date edittime, String description,
			String attachment, String person) {
		this.bname = bname;
		this.edittime = edittime;
		this.description = description;
		this.attachment = attachment;
		this.person = person;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Date getEdittime() {
		return this.edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

}