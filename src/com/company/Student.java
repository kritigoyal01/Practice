package com.company;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Student {
    private String fname;
//
//    private String lname;

    private int std;

//    private String parentName;
//
//    private int rollNo;
//
//    private Long sNo;

    private Date dob;

    private String house;

    public Student(String fname, int std, Date dob, String house, Double creditScore) {
        this.fname = fname;
        this.std = std;
        this.dob = dob;
        this.house = house;
        this.creditScore = creditScore;
    }

    private Double creditScore;



    public String getFname() {
        return fname;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

//    public String getParentName() {
//        return parentName;
//    }
//
//    public void setParentName(String parentName) {
//        this.parentName = parentName;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public Long getsNo() {
//        return sNo;
//    }
//
//    public void setsNo(Long sNo) {
//        this.sNo = sNo;
//    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Double creditScore) {
        this.creditScore = creditScore;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


}
