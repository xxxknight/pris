package com.test.bean;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String createPeople;
	private String updateTime;
	private String content;
	private String type;
	private String name;
	private Integer falg;
	private String remark;
	private String yl1;
	private String updatePeople;
	private String createTime;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Article(Integer id, String title, String createPeople,
			String updateTime, String content, String type, String name,
			Integer falg, String remark, String yl1, String updatePeople,
			String createTime) {
		this.id = id;
		this.title = title;
		this.createPeople = createPeople;
		this.updateTime = updateTime;
		this.content = content;
		this.type = type;
		this.name = name;
		this.falg = falg;
		this.remark = remark;
		this.yl1 = yl1;
		this.updatePeople = updatePeople;
		this.createTime = createTime;
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

	public String getCreatePeople() {
		return this.createPeople;
	}

	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFalg() {
		return this.falg;
	}

	public void setFalg(Integer falg) {
		this.falg = falg;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getYl1() {
		return this.yl1;
	}

	public void setYl1(String yl1) {
		this.yl1 = yl1;
	}

	public String getUpdatePeople() {
		return this.updatePeople;
	}

	public void setUpdatePeople(String updatePeople) {
		this.updatePeople = updatePeople;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}