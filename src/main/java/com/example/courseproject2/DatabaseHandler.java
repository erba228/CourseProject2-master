package com.example.courseproject2;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                +dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser,dbPass);

        return dbConnection;
    }

    public ResultSet getRating() {
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + Const.RATING_TABLE;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resultSet = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resultSet;
    }

    public void addComplain(Complain complain) {
        String insert = "INSERT INTO " + Const.COMPLAIN_TABLE + "(" + Const.COMPLAIN_COMPLAIN + "," + Const.COMPLAIN_REASON
                + "," + Const.COMPLAIN_CLIENTNAME + ")" + "VALUES(?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, complain.getComplaint());
            prSt.setString(2, complain.getReason());
            prSt.setString(3, complain.getClientName());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void rating(Rate rate) {
        String insert = "INSERT INTO " + Const.RATING_TABLE + "(" + Const.RATING_RATE + "," + Const.RATING_REVIEW + ")" +
                "VALUES(?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, rate.getRating());
            prSt.setString(2, rate.getReview());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet chooseTariff() {
        ResultSet reset = null;
        String select = "SELECT * FROM " + Const.TARIFFS_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            reset = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return reset;
    }

    public void signUpClientWithTariff(Client client){
        SimpleDateFormat dFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);
        Date dateBegin = new Date();
        Date dateEnd = new Date(((dateBegin.getTime()/60000)+43200)*60000);
        String insert = "INSERT INTO " + Const.CLIENT_TABLE + "("+
                Const.CLIENT_LOGIN + "," + Const.CLIENT_PASSWORD+","+ Const.CLIENT_NAME + ","
                + Const.CLIENT_NUMBER + "," + Const.CLIENT_TARIFF + ","
                +Const.CLIENT_BEGINNINGDATE + "," + Const.CLIENT_ENDINGDATE + "," + Const.CLIENT_BALANCE+")" +
                "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, client.getLogin());
            prSt.setString(2,client.getPassword());
            prSt.setString(3,client.getName());
            prSt.setString(4, client.getNumber());
            prSt.setString(5, client.getTariff());
            prSt.setString(6, dFormat.format(dateBegin));
            prSt.setString(7, dFormat.format(dateEnd));
            prSt.setInt(8, 0);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void signUpClient(Client client){
        SimpleDateFormat dFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);
        Date dateBegin = new Date();
        Date dateEnd = new Date(((dateBegin.getTime()/60000)+43200)*60000);
        String insert = "INSERT INTO " + Const.CLIENT_TABLE + "("+
                Const.CLIENT_LOGIN + "," + Const.CLIENT_PASSWORD+","+ Const.CLIENT_NAME + ","
                + Const.CLIENT_NUMBER + "," + Const.CLIENT_TARIFF + ","
                +Const.CLIENT_BEGINNINGDATE + "," + Const.CLIENT_ENDINGDATE + "," + Const.CLIENT_BALANCE+")" +
                "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, client.getLogin());
            prSt.setString(2,client.getPassword());
            prSt.setString(3,client.getName());
            prSt.setString(4, client.getNumber());
            prSt.setString(5, "Free");
            prSt.setString(6, dFormat.format(dateBegin));
            prSt.setString(7, dFormat.format(dateEnd));
            prSt.setInt(8, 0);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setVacationStatus(Vacation vacation){
        String update = "UPDATE " + Const.VACATION_TABLE + " SET " + Const.VACATION_STATUS + "=?"+
                " WHERE " + Const.VACATION_ID + "=?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(update);
            prSt.setString(1, vacation.getStatus());
            prSt.setInt(2, vacation.getId());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void chooseTariff(Client client) {
        SimpleDateFormat dFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);
        Date dateBegin = new Date();
        Date dateEnd = new Date(((dateBegin.getTime()/60000)+43200)*60000);
        String update = "UPDATE " + Const.CLIENT_TABLE + " SET " + Const.CLIENT_TARIFF + "=?" + ","
                + Const.CLIENT_BEGINNINGDATE + "=?" + "," + Const.CLIENT_ENDINGDATE + "=?"
                + " WHERE " + Const.CLIENT_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, client.getTariff());
            preparedStatement.setString(2, dFormat.format(dateBegin));
            preparedStatement.setString(3, dFormat.format(dateEnd));
            preparedStatement.setInt(4, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addVacRequest(Vacation vacation){
        String insert = "INSERT INTO " + Const.VACATION_TABLE + "("
        + Const.VACATION_WORKERNAME +","+ Const.VACATION_WORKERLASTNAME +","
        + Const.VACATION_BEGINDATE +","+ Const.VACATION_ENDDATE +","+Const.VACATION_STATUS
        + ")" + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, vacation.getName());
            prSt.setString(2, vacation.getLastname());
            prSt.setString(3, vacation.getBeginDate());
            prSt.setString(4, vacation.getEndDate());
            prSt.setString(5, "on review");

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addTariff(Tariff tariff){
        String insert = "INSERT INTO "+Const.TARIFFS_TABLE + "("+
                Const.TARIFFS_NAME+","+Const.TARIFFS_PRICE+","+Const.TARIFFS_INTERNET+
                ","+Const.TARIFFS_DURATION+","+Const.TARIFFS_CALLS+")"+"VALUES(?,?,?,?,?)";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, tariff.getName());
            prSt.setInt(2, tariff.getPrice());
            prSt.setString(3, tariff.getInternet());
            prSt.setString(4, tariff.getDuration());
            prSt.setString(5, tariff.getCalls());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void signUpWorker(Worker worker){
        String insert = "INSERT INTO " + Const.WORKER_TABLE + "("+
                Const.WORKERS_NAME + "," + Const.WORKERS_LASTNAME + "," +
                Const.WORKERS_LOGIN + "," + Const.WORKERS_PASSWORD+"," + Const.WORKERS_SALARY+")" +
                "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, worker.getName());
            prSt.setString(2, worker.getLastname());
            prSt.setString(3, worker.getLogin());
            prSt.setString(4,worker.getPassword());
            prSt.setInt(5,worker.getSalary());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientInfo(Client client){
        String change = "UPDATE " + Const.CLIENT_TABLE + " SET " +
                Const.CLIENT_LOGIN + "=?" + "," + Const.CLIENT_NAME + "=?" +
                "," + Const.CLIENT_NUMBER +  "=?" + " WHERE " + Const.CLIENT_ID + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setString(1, client.getLogin());
            prSt.setString(2, client.getName());
            prSt.setString(3, client.getNumber());
            prSt.setInt(4, client.getId());

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void  changeTariffCall(Tariff tariff){
        String change = "UPDATE " + Const.TARIFFS_TABLE + " SET " +
                Const.TARIFFS_CALLS + "=?" + " WHERE " + Const.TARIFFS_NAME + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setString(1, tariff.getCalls());
            prSt.setString(2, tariff.getName());

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void  changeTariffDuration(Tariff tariff){
        String change = "UPDATE " + Const.TARIFFS_TABLE + " SET " +
                Const.TARIFFS_DURATION + "=?" + " WHERE " + Const.TARIFFS_NAME + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setString(1, tariff.getDuration());
            prSt.setString(2, tariff.getName());

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeTariffInternet(Tariff tariff){
        String change = "UPDATE " + Const.TARIFFS_TABLE + " SET " +
                Const.TARIFFS_INTERNET + "=?" + " WHERE " + Const.TARIFFS_NAME + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setString(1, tariff.getInternet());
            prSt.setString(2, tariff.getName());

            prSt.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeTariffPrice(Tariff tariff){
        String change = "UPDATE " + Const.TARIFFS_TABLE + " SET " +
                Const.TARIFFS_PRICE + "=?" + " WHERE " + Const.TARIFFS_NAME + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setInt(1, tariff.getPrice());
            prSt.setString(2, tariff.getName());

            prSt.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeTariffName(Tariff tariff, String newName){
        String change = "UPDATE "+Const.TARIFFS_TABLE + " SET " +
                Const.TARIFFS_NAME + "=?" + " WHERE " + Const.TARIFFS_ID + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setString(1, newName);
            prSt.setInt(2, tariff.getId());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeWorkerSalary(Worker worker){
        String change = "UPDATE " + Const.WORKER_TABLE + " SET " +
                Const.WORKERS_SALARY + "=?"+" WHERE " + Const.WORKERS_LOGIN + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setInt(1, worker.getSalary());
            prSt.setString(2, worker.getLogin());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientNumber(Client client){
        String update = "UPDATE " + Const.CLIENT_TABLE + " SET " + Const.CLIENT_NUMBER + "=?" + " WHERE " + Const.CLIENT_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, client.getNumber());
            preparedStatement.setInt(2, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeWorkerLastname(Worker worker) {
        String update = "UPDATE " + Const.WORKER_TABLE + " SET " + Const.WORKERS_LASTNAME + "=?" + " WHERE " + Const.WORKERS_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, worker.getLastname());
            preparedStatement.setInt(2, worker.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeWorkerPassword(Worker worker) {
        String update = "UPDATE " + Const.WORKER_TABLE + " SET " + Const.WORKERS_PASSWORD + "=?" + " WHERE " + Const.WORKERS_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, worker.getPassword());
            preparedStatement.setInt(2, worker.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientPassword(Client client) {
        String update = "UPDATE " + Const.CLIENT_TABLE + " SET " + Const.CLIENT_PASSWORD + "=?" + " WHERE " + Const.CLIENT_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, client.getPassword());
            preparedStatement.setInt(2, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeWorkerLogin(Worker worker) {
        String update = "UPDATE " + Const.WORKER_TABLE + " SET " + Const.WORKERS_LOGIN + "=?" + " WHERE " + Const.WORKERS_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, worker.getLogin());
            preparedStatement.setInt(2, worker.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientLogin(Client client) {
        String update = "UPDATE " + Const.CLIENT_TABLE + " SET " + Const.CLIENT_LOGIN + "=?" + " WHERE " + Const.CLIENT_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, client.getLogin());
            preparedStatement.setInt(2, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeWorkerName(Worker worker){
        String update = "UPDATE " + Const.WORKER_TABLE + " SET " + Const.WORKERS_NAME + "=?" + " WHERE " + Const.WORKERS_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, worker.getName());
            preparedStatement.setInt(2, worker.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientName(Client client) {
        String update = "UPDATE " + Const.CLIENT_TABLE + " SET " + Const.CLIENT_NAME + "=?" + " WHERE " + Const.CLIENT_ID + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(update);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setInt(2, client.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void changeClientBalance(Client client){
        String change = "UPDATE " + Const.CLIENT_TABLE + " SET " +
                Const.CLIENT_BALANCE +"=?"+" WHERE " + Const.CLIENT_LOGIN + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(change);
            prSt.setInt(1, client.getBalance());
            prSt.setString(2, client.getLogin());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void delTariff(Tariff tariff){
        String delete = "DELETE FROM "+ Const.TARIFFS_TABLE+
                " WHERE "+Const.TARIFFS_NAME + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(delete);
            prSt.setString(1, tariff.getName());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void delWorker(Worker worker){
        String delete = "DELETE FROM " + Const.WORKER_TABLE +
                " WHERE " + Const.WORKERS_LOGIN + "=? AND " +
                Const.WORKERS_PASSWORD + "=?";

        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(delete);
            prSt.setString(1, worker.getLogin());
            prSt.setString(2, worker.getPassword());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void delClient(Client client){
        String delete = "DELETE FROM " + Const.CLIENT_TABLE +
                " WHERE " + Const.CLIENT_LOGIN + "=? AND " +
                Const.CLIENT_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(delete);
            prSt.setString(1, client.getLogin());
            prSt.setString(2, client.getPassword());

            prSt.executeUpdate();
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public ResultSet getInfoWorker() {
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + Const.WORKER_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);

            resultSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resultSet;
    }

    public ResultSet getInfo() {
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + Const.CLIENT_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resultSet = prSt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resultSet;
    }

    public ResultSet getClient(Client client){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.CLIENT_TABLE + " WHERE " +
                Const.CLIENT_LOGIN + "=? AND " + Const.CLIENT_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, client.getLogin());
            prSt.setString(2,client.getPassword());

            resSet =  prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getWorker(Worker worker){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.WORKER_TABLE + " WHERE " +
                Const.WORKERS_LOGIN + "=? AND " + Const.WORKERS_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, worker.getLogin());
            prSt.setString(2,worker.getPassword());

            resSet =  prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getDirector(Director director){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.DIRECTOR_TABLE + " WHERE " +
                Const.DIRECTORS_LOGIN + "=? AND " + Const.DIRECTORS_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, director.getLogin());
            prSt.setString(2,director.getPassword());

            resSet =  prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getComplains(){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.COMPLAIN_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getVacations(){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.VACATION_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getTariffs(){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.TARIFFS_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getClients() {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.CLIENT_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getWorkers() {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.WORKER_TABLE;
        System.out.println(select);

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }

}
