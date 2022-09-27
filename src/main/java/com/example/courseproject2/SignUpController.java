package com.example.courseproject2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.courseproject2.animations.Click;
import com.example.courseproject2.animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField logField;

    @FXML
    private TextField numberField;

    @FXML
    private TextField nameField;

    @FXML
    private Button login;

    @FXML
    private PasswordField passField1;

    @FXML
    private PasswordField passField2;

    @FXML
    private Button signUpButton;

    @FXML
    private Button signUp;

    @FXML
    void initialize() {
        login.setOnAction(event -> {
            login.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("DET2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        signUpButton.setOnAction(event -> {
            Click signIn = new Click(signUpButton);
            signIn.playAnim();
            String login = logField.getText().trim();
            String password = passField1.getText().trim();
            String checkpass = passField2.getText().trim();
            String name = nameField.getText().trim();

            if(Director1.isNumeric(numberField.getText().trim())) {
                String number = numberField.getText().trim();
                if (!name.equals("") && !login.equals("") && !password.equals("") && !checkpass.equals("")) {
                    signUpNewClient(login, password, checkpass, name, number);
                } else {
                    Shake userLoginAnim = new Shake(logField);
                    Shake userPassAnim = new Shake(passField1);
                    Shake userPassAnim2 = new Shake(passField2);
                    Shake nameAnim = new Shake(nameField);
                    userLoginAnim.playAnim();
                    userPassAnim.playAnim();
                    userPassAnim2.playAnim();
                    nameAnim.playAnim();
                }
            }else{
                Shake number = new Shake(numberField);
                number.playAnim();
            }
        });
    }
        private void signUpNewClient(String login, String password, String checkpass, String name, String number){
            DatabaseHandler dbhandler = new DatabaseHandler();

            Client client = new Client(login, password, name, number);

            if(password.equals(checkpass)){
                dbhandler.signUpClient(client);

                signUpButton.getScene().getWindow().hide();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("DET2.fxml"));

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

        }else{
                Shake userLoginAnim = new Shake(logField);
                Shake userPassAnim = new Shake(passField1);
                Shake userPassAnim2 = new Shake(passField2);
                userLoginAnim.playAnim();
                userPassAnim.playAnim();
                userPassAnim2.playAnim();
            }
    }

}
