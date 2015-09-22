package com.test.bean;



/**
 * Arrange entity. @author MyEclipse Persistence Tools
 */

public class Arrange  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String travel;
     private String baoxiao;
     private String meeting;
     private String fromtime;
     private String totime;
     private String quxian;


    // Constructors

    /** default constructor */
    public Arrange() {
    }

    
    /** full constructor */
    public Arrange(String travel, String baoxiao, String meeting, String fromtime, String totime, String quxian) {
        this.travel = travel;
        this.baoxiao = baoxiao;
        this.meeting = meeting;
        this.fromtime = fromtime;
        this.totime = totime;
        this.quxian = quxian;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravel() {
        return this.travel;
    }
    
    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getBaoxiao() {
        return this.baoxiao;
    }
    
    public void setBaoxiao(String baoxiao) {
        this.baoxiao = baoxiao;
    }

    public String getMeeting() {
        return this.meeting;
    }
    
    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    public String getFromtime() {
        return this.fromtime;
    }
    
    public void setFromtime(String fromtime) {
        this.fromtime = fromtime;
    }

    public String getTotime() {
        return this.totime;
    }
    
    public void setTotime(String totime) {
        this.totime = totime;
    }

    public String getQuxian() {
        return this.quxian;
    }
    
    public void setQuxian(String quxian) {
        this.quxian = quxian;
    }
   








}