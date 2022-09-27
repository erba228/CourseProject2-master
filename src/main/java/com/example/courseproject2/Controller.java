package com.example.courseproject2;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.courseproject2.animations.Click;
import com.example.courseproject2.animations.Shake;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private TextField logField;

    @FXML
    private Button login;

    @FXML
    private PasswordField passField;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUp;

    @FXML
    private Button forgotPassword;

    @FXML
    private AnchorPane loginAnchor;

    @FXML
    private AnchorPane recoverPasswordAnchor;

    @FXML
    private TextField forgotName;

    @FXML
    private TextField forgotLogin;

    @FXML
    private TextField forgotNumber;

    @FXML
    private Button recover;

    @FXML
    private Button cancelButton;

    @FXML
    private Text textForgot;

    public static String Clogin;
    public static String Cpassword;


    @FXML
    void initialize() {
        offEverythingForgot();
        loginAnchor.setVisible(true);

        ObservableList<String> accounts = FXCollections.observableArrayList("Director", "Worker", "Client");
        choiceBox.setItems(accounts);
        choiceBox.setValue("Client");

        signUp.setOnAction(event -> {
            openNewScene("DET.fxml");
        });
        signInButton.setOnAction(event -> {
            Click signIn = new Click(signInButton);
            signIn.playAnim();
            String loginText = logField.getText().trim();
            String loginPassword = passField.getText().trim();
            Clogin = loginText;
            Cpassword = loginPassword;

            if (!loginText.equals("") && !loginPassword.equals("")) {
                if(choiceBox.getValue().equals("Director")){
                    loginDirector(loginText,loginPassword);
                }else if(choiceBox.getValue().equals("Worker")){
                    loginWorker(loginText,loginPassword);
                }else if(choiceBox.getValue().equals("Client")){
                    loginClient(loginText,loginPassword);
                }
            }else{
                Shake userLoginAnim = new Shake(logField);
                Shake userPassAnim = new Shake(passField);
                userLoginAnim.playAnim();
                userPassAnim.playAnim();
            }

        });

        forgotPassword.setBackground(null);
        forgotPassword.setOnAction(event -> {
            loginAnchor.setVisible(false);
            recoverPasswordAnchor.setVisible(true);
            textForgot.setText(null);
        });

        recover.setOnAction(event -> {
            Click r = new Click(recover);
            r.playAnim();
            recoverPassword();
        });

        cancelButton.setOnAction(event -> {
            Click c = new Click(cancelButton);
            c.playAnim();
            recoverPasswordAnchor.setVisible(false);
            loginAnchor.setVisible(true);
        });

    }

    private void recoverPassword() {
        String number = forgotNumber.getText();
        String login = forgotLogin.getText();
        String name = forgotName.getText();
        if (number.length() >= 1 && login.length() >= 1 && name.length() >= 1) {
            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client();
            ResultSet resultSet = dbHandler.getInfo();
            String password = "";
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(login) && resultSet.getString("number").equals(number) && resultSet.getString("name").equals(name)) {
                        password = resultSet.getString("password");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (!password.equals("") && password.length() >= 1) {
                textForgot.setText("Your password is " + password + "\n" + "Please do not forget it anymore");
                forgotLogin.clear();
                forgotName.clear();
                forgotNumber.clear();
            } else {
                Shake UserLogin = new Shake(forgotLogin);
                Shake UserPassword = new Shake(forgotNumber);
                Shake UserName = new Shake(forgotName);
                UserName.playAnim();
                UserLogin.playAnim();
                UserPassword.playAnim();
                textForgot.setText("One or more of the given info are wrong!" + "\n" + "Try again!");
            }
        } else {
            Shake UserLogin = new Shake(forgotLogin);
            Shake UserPassword = new Shake(forgotNumber);
            Shake UserName = new Shake(forgotName);
            UserName.playAnim();
            UserLogin.playAnim();
            UserPassword.playAnim();

        }
    }

    private void loginClient(String loginText, String loginPassword) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Client client = new Client();
        client.setLogin(loginText);
        client.setPassword(loginPassword);
        ResultSet result = dbHandler.getClient(client);

        int counter = 0;

        while(true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }


        if(counter>=1){
            openNewScene("DET1.fxml");
        }else{
            Shake userLoginAnim = new Shake(logField);
            Shake userPassAnim = new Shake(passField);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();
        }
    }

    private void loginWorker(String loginText, String loginPassword){
        DatabaseHandler dbHandler = new DatabaseHandler();
        Worker worker = new Worker();
        worker.setLogin(loginText);
        worker.setPassword(loginPassword);
        ResultSet result = dbHandler.getWorker(worker);

        int counter = 0;

        while(true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }


        if(counter>=1){
            openNewScene("worker1.fxml");
        }else{
            Shake userLoginAnim = new Shake(logField);
            Shake userPassAnim = new Shake(passField);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();
        }

    }

    private void loginDirector(String loginText, String loginPassword){
        DatabaseHandler dbHandler = new DatabaseHandler();
        Director director = new Director();
        director.setLogin(loginText);
        director.setPassword(loginPassword);
        ResultSet result = dbHandler.getDirector(director);

        int counter = 0;

        while(true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }


        if(counter>=1){
            openNewScene("director1.fxml");
        }else{
            Shake userLoginAnim = new Shake(logField);
            Shake userPassAnim = new Shake(passField);
            userLoginAnim.playAnim();
            userPassAnim.playAnim();
        }

    }

    public void openNewScene(String window){
        signUp.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();

    }

    private void offEverythingForgot(){
        recoverPasswordAnchor.setVisible(false);
    }

}
