package com.example.courseproject2;

public class Director {
    private String login;
    private String password;

    public Director(){}
    public Director(String login, String password){
        this.login=login;
        this.password=password;
    }

    public String getLogin(){
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
}
