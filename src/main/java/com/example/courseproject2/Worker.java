package com.example.courseproject2;

public class Worker {

    private String name;
    private String lastname;
    private String login;
    private String password;
    private int salary;
    private int Id;

    public Worker(){}

    public Worker(String login, int salary){
        this.login=login;
        this.salary=salary;
    }

    public Worker(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Worker(String name, String lastname, String login, String password, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.salary=salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getSalary() {return salary;}

    public void setSalary(int salary) {this.salary = salary;}
}
