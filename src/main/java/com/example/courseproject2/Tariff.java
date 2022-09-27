package com.example.courseproject2;

public class Tariff {
    private int id;
    private String name;
    private int price;
    private String internet;
    private String duration;
    private String calls;

    public Tariff(){}

    public Tariff(String name){
        this.name=name;
    }

    public Tariff(String name, int price, String internetCount, String duration, String calls){
        this.name=name;
        this.price=price;
        this.internet=internetCount;
        this.duration=duration;
        this.calls=calls;
    }

    public Tariff(int id, String name, int price, String internetCount, String duration, String calls){
        this.id = id;
        this.name=name;
        this.price=price;
        this.internet=internetCount;
        this.duration=duration;
        this.calls=calls;
    }

    public Tariff(String name, int price){
        this.name=name;
        this.price=price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCalls() {
        return calls;
    }

    public void setCalls(String calls) {
        this.calls = calls;
    }
}
