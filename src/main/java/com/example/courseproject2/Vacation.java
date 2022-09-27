package com.example.courseproject2;

public class Vacation {
    private int id;
    private String name;
    private String lastname;
    private String beginDate;
    private String endDate;
    private String status;

    public Vacation(){}
    public Vacation(String beginDate, String endDate, String status){
        this.beginDate=beginDate;
        this.endDate=endDate;
        this.status=status;
    }
    public Vacation(String name, String lastname, String beginDate, String endDate, String status){
        this.name=name;
        this.lastname=lastname;
        this.beginDate=beginDate;
        this.endDate=endDate;
        this.status=status;
    }

    public Vacation(int idvacation, String name, String lastname, String beginDate, String endDate, String status) {
        this.id=idvacation;
        this.name=name;
        this.lastname=lastname;
        this.beginDate=beginDate;
        this.endDate=endDate;
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
