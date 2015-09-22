package com.test.bean;

/**
 * Matter entity. @author MyEclipse Persistence Tools
 */

public class Matter implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String content;
	private String startTime;
	private String endTime;
	private String assignPeople;
	private Integer level;
	private String state;
	private String actualTime;

	// Constructors

	/** default constructor */
	public Matter() {
	}

	/** full constructor */
	public Matter(String title, String content, String startTime,
			String endTime, String assignPeople, Integer level, String state,
			String actualTime) {
		this.title = title;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
		this.assignPeople = assignPeople;
		this.level = level;
		this.state = state;
		this.actualTime = actualTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAssignPeople() {
		return this.assignPeople;
	}

	public void setAssignPeople(String assignPeople) {
		this.assignPeople = assignPeople;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActualTime() {
		return this.actualTime;
	}

	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}

}