package com.test.bean;



/**
 * Document entity. @author MyEclipse Persistence Tools
 */

public class Document  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String fileName;
     private String upTime;
     private String upUrl;
     private String upPeople;


    // Constructors

    /** default constructor */
    public Document() {
    }

    
    /** full constructor */
    public Document(String fileName, String upTime, String upUrl, String upPeople) {
        this.fileName = fileName;
        this.upTime = upTime;
        this.upUrl = upUrl;
        this.upPeople = upPeople;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUpTime() {
        return this.upTime;
    }
    
    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getUpUrl() {
        return this.upUrl;
    }
    
    public void setUpUrl(String upUrl) {
        this.upUrl = upUrl;
    }

    public String getUpPeople() {
        return this.upPeople;
    }
    
    public void setUpPeople(String upPeople) {
        this.upPeople = upPeople;
    }
   








}