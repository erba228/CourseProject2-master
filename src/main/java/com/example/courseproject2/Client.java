package com.example.courseproject2;

public class Client {
    private String name;
    private String login;
    private String password;
    private String number;
    private String tariff;
    private int balance;
    private int id;

    public Client(){}

    public Client(String login, int balance){
        this.login=login;
        this.balance=balance;
    }

    public Client(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Client(String login, String password, int balance) {
        this.login = login;
        this.password = password;
        this.balance = balance;
    }

    public Client(String login, String password, String name, String number){
        this.name=name;
        this.login = login;
        this.password = password;
        this.number=number;
    }

    public Client(String login, String name, String number, String tariff, int balance){
        this.name=name;
        this.login = login;
        this.number=number;
        this.tariff=tariff;
        this.balance=balance;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance(){ return balance; }

    public void setBalance(int balance){ this.balance = balance; }

}
