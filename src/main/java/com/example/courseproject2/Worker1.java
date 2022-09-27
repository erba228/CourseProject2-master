package com.example.courseproject2;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import com.example.courseproject2.animations.Click;
import com.example.courseproject2.animations.Shake;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static com.example.courseproject2.Controller.Clogin;
import static com.example.courseproject2.Controller.Cpassword;

public class Worker1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text NameText;

    @FXML
    private Text logout;

    @FXML
    private AnchorPane logoutAnchor;

    @FXML
    private Button logoutButton;

    @FXML
    private Text myInfo;

    @FXML
    private AnchorPane myInfoAnchor;

    @FXML
    private Button myInfoButton;

    @FXML
    private Button tariffs;

    @FXML
    private AnchorPane tariffsAnchor;

    @FXML
    private Text clients;

    @FXML
    private AnchorPane clientsAnchor;

    @FXML
    private Button clientsButton;

    @FXML
    private AnchorPane changeWorkerInfoAnchor;

    @FXML
    private Button changeWorkerLastname;

    @FXML
    private Button changeWorkerLogin;

    @FXML
    private Button changeWorkerName;

    @FXML
    private Button changeWorkerPassword;

    @FXML
    private AnchorPane fullInfoAnchor;

    @FXML
    private Label lastnameLabel;

    @FXML
    private Label loginLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private Label salaryLabel;

    @FXML
    private AnchorPane workerInfoChangeAnchor;

    @FXML
    private Button changeWorkerInfoButton;

    @FXML
    private TextField workerNewInfo;

    @FXML
    private Label currentInfoText;

    @FXML
    private Button cancelButton;

    @FXML
    private AnchorPane April_AnchorPane;

    @FXML
    private AnchorPane August_AnchorPane;

    @FXML
    private AnchorPane July_AnchorPane;

    @FXML
    private AnchorPane June_AnchorPane;

    @FXML
    private AnchorPane May_AnchorPane;

    @FXML
    private AnchorPane September_AnchorPane;

    @FXML
    private AnchorPane monthsAnchor;

    @FXML
    private AnchorPane scheduleAnchor;

    @FXML
    private Button scheduleButton;

    @FXML
    private Text schedule;

    @FXML
    private Button next;

    @FXML
    private Button next_may;

    @FXML
    private Button prev_may;

    @FXML
    private Button next_june;

    @FXML
    private Button prev_june;

    @FXML
    private Button next_july;

    @FXML
    private Button prev_july;

    @FXML
    private Button next_august;

    @FXML
    private Button prev_august;

    @FXML
    private Button prev_september;

    @FXML
    private  Button request_button;

    @FXML
    private TextField date_begin;

    @FXML
    private TextField date_end;

    @FXML
    private AnchorPane vacation_anchor;

    @FXML
    private Text requestText;

    @FXML
    private Button myrequestsButton;

    @FXML
    private Button request_button1;

    @FXML
    private TableView<Vacation> requestTable;

    @FXML
    private TableColumn<Vacation, String> tableBegin;

    @FXML
    private TableColumn<Vacation, String> tableEnd;

    @FXML
    private TableColumn<Vacation, String> tableStatus;

    @FXML
    private ChoiceBox<String> searchBox;

    @FXML
    private TextField searchText;

    @FXML
    private TableView<Client> clientsTable;

    @FXML
    private TableColumn<Client, Integer> tableBalance;

    @FXML
    private TableColumn<Client, String> tableLogin;

    @FXML
    private TableColumn<Client, String> tableName;

    @FXML
    private TableColumn<Client, String> tableNumber;

    @FXML
    private TableColumn<Client, String> tableTariff;

    @FXML
    private AnchorPane ClientSearchAnchor;

    @FXML
    private AnchorPane clientAdding;

    @FXML
    private AnchorPane infoChanging;

    @FXML
    private Button clientAdd;

    @FXML
    private Button infoChange;

    @FXML
    private AnchorPane clientRegister;

    @FXML
    private TextField newClientLog;

    @FXML
    private TextField newClientNumber;

    @FXML
    private TextField newClientName;

    @FXML
    private PasswordField newClientPass;

    @FXML
    private PasswordField newClientPass2;

    @FXML
    private Button cancelRegister;

    @FXML
    private Button addButton;

    @FXML
    private Text addedText;

    @FXML
    private AnchorPane clientChange;

    @FXML
    private AnchorPane clientChange1;

    @FXML
    private TextField changeClientName;

    @FXML
    private TextField changeClientName1;

    @FXML
    private TextField changeClientNumber;

    @FXML
    private TextField changeClientLog;

    @FXML
    private Button nextButton;

    @FXML
    private Button cancelChange;

    @FXML
    private Button cancelChange1;

    @FXML
    private Text changedText;

    @FXML
    private Button changeButton;

    @FXML
    private AnchorPane Free_AnchorPane;

    @FXML
    private AnchorPane Regular2_AnchorPane;

    @FXML
    private AnchorPane Regular_AnchorPane;

    @FXML
    private AnchorPane Super2_AnchorPane;

    @FXML
    private AnchorPane Super_AnchorPane;

    @FXML
    private AnchorPane fullTariffsAnchor;

    @FXML
    private AnchorPane Just_AnchorPane;

    @FXML
    private Button just_add;

    @FXML
    private Button next_free;

    @FXML
    private Button next_just;

    @FXML
    private Button next_regular;

    @FXML
    private Button next_regular2;

    @FXML
    private Button next_super;

    @FXML
    private Button next_super2;

    @FXML
    private Button regular2_add;

    @FXML
    private Button regular_add;

    @FXML
    private Button super2_add;

    @FXML
    private Button super_add;

    @FXML
    private Button free_add;

    @FXML
    private Button addButton1;

    protected String tariff;

    protected int id;

    @FXML
    void initialize() {
        addButton1.setVisible(false);
        fullInfoAnchor.setVisible(true);
        changeWorkerInfoAnchor.setVisible(true);
        offEverythingSchedule();
        offEverythingClients();
        offEverythingTariffs();
        getInfo();
        clientRegister.setVisible(false);

        searchBox.getItems().addAll("Login", "Name", "Number", "Tariff");
        searchBox.setValue("Name");
        searchText.setPromptText("Search for a client");

        logoutButton.setOnAction(event -> { // Кнопка сверху logout
            Click logoutAnim = new Click(logoutAnchor);
            logoutAnim.playAnim();
            logoutButton.getScene().getWindow().hide();

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

        myInfoButton.setOnAction(event -> {
            Click myInfoAnim = new Click(myInfoAnchor);
            myInfoAnim.playAnim();
            offEverythingSchedule();
            offEverythingClients();
            offEverythingTariffs();
            clientRegister.setVisible(false);

            if (!fullInfoAnchor.visibleProperty().get() && !changeWorkerInfoAnchor.visibleProperty().get()) {
                fullInfoAnchor.setVisible(true);
                changeWorkerInfoAnchor.setVisible(true);

            } else {
                offEverythingMyInfo();
            }

            getInfo();
        });

        cancelButton.setOnAction(event -> {
            fullInfoAnchor.setVisible(true);
            changeWorkerInfoAnchor.setVisible(true);
            workerInfoChangeAnchor.setVisible(false);
        });

        changeWorkerName.setOnAction(event -> { // Change name справа
            Click changeN= new Click(changeWorkerName);
            changeN.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Worker worker = new Worker(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getWorker(worker);

            workerNewInfo.setPromptText("Enter your new name");

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current name: " + resultSet.getString("name"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeWorkerInfoAnchor.setVisible(false);
            workerInfoChangeAnchor.setVisible(true);
        });

        changeWorkerLastname.setOnAction(event -> {
            Click changeN= new Click(changeWorkerLastname);
            changeN.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Worker worker = new Worker(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getWorker(worker);

            workerNewInfo.setPromptText("Enter your new lastname");

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current lastname: " + resultSet.getString("lastname"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeWorkerInfoAnchor.setVisible(false);
            workerInfoChangeAnchor.setVisible(true);
        });

        changeWorkerLogin.setOnAction(event -> {
            Click changeN= new Click(changeWorkerLogin);
            changeN.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Worker worker = new Worker(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getWorker(worker);

            workerNewInfo.setPromptText("Enter your new login");

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current login: " + resultSet.getString("login"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeWorkerInfoAnchor.setVisible(false);
            workerInfoChangeAnchor.setVisible(true);
        });

        changeWorkerPassword.setOnAction(event -> {
            Click changeN= new Click(changeWorkerPassword);
            changeN.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Worker worker = new Worker(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getWorker(worker);

            workerNewInfo.setPromptText("Enter your new password");

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current password: " + resultSet.getString("password"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeWorkerInfoAnchor.setVisible(false);
            workerInfoChangeAnchor.setVisible(true);
        });

        changeWorkerInfoButton.setOnAction(event -> { // Кнопка change в  Anchor
            Click changeN = new Click(changeWorkerInfoButton);
            changeN.playAnim();

            String newInfo = workerNewInfo.getText().trim();
            if(workerNewInfo.getPromptText().equals("Enter your new name")) {
                if (!newInfo.equals("")) {
                    changeWorkerInfo(newInfo);
                    workerNewInfo.clear();
                    changeWorkerInfoAnchor.setVisible(true);
                    workerInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(workerNewInfo);
                    nameShake.playAnim();
                }
            }else if(workerNewInfo.getPromptText().equals("Enter your new login")){
                if (!newInfo.equals("")) {
                    changeWorkerInfo(newInfo);
                    workerNewInfo.clear();
                    Clogin = newInfo;
                    changeWorkerInfoAnchor.setVisible(true);
                    workerInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(workerNewInfo);
                    nameShake.playAnim();
                }
            }else if(workerNewInfo.getPromptText().equals("Enter your new password")){
                if (!newInfo.equals("")) {
                    changeWorkerInfo(newInfo);
                    workerNewInfo.clear();
                    Cpassword = newInfo;
                    changeWorkerInfoAnchor.setVisible(true);
                    workerInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(workerNewInfo);
                    nameShake.playAnim();
                }
            }else if(workerNewInfo.getPromptText().equals("Enter your new lastname")){
                if (!newInfo.equals("")) {
                    changeWorkerInfo(newInfo);
                    workerNewInfo.clear();
                    changeWorkerInfoAnchor.setVisible(true);
                    workerInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(workerNewInfo);
                    nameShake.playAnim();
                }
            }
            getInfo();
        });

        scheduleButton.setOnAction(event -> {
            offEverythingMyInfo();
            offEverythingClients();
            offEverythingTariffs();
            clientRegister.setVisible(false);

            requestText.setText("Vacation request");

            Click s = new Click(scheduleAnchor);
            s.playAnim();

            if (!monthsAnchor.visibleProperty().get() && !vacation_anchor.visibleProperty().get()) {
                monthsAnchor.setVisible(true);
                vacation_anchor.setVisible(true);
                April_AnchorPane.setVisible(true);

            } else {
                offEverythingSchedule();
            }

        });

        request_button.setOnAction(event -> {
            Click request = new Click(request_button);
            request.playAnim();

            if(!date_begin.getText().equals("") && !date_end.getText().equals("")){
                DatabaseHandler dbHandler = new DatabaseHandler();
                Vacation vacation = new Vacation();
                ResultSet resultSet = dbHandler.getInfoWorker();

                while (true) {
                    try {
                        if (!resultSet.next()) {
                            break;
                        }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                            vacation.setName(resultSet.getString("name"));
                            vacation.setLastname(resultSet.getString("lastname"));
                            vacation.setId(resultSet.getInt("idworkers"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                vacation.setBeginDate(date_begin.getText());
                vacation.setEndDate(date_end.getText());
                dbHandler.addVacRequest(vacation);
                date_end.clear();
                date_begin.clear();
                requestText.setText("Request was sent!");

            }else{
                Shake date1 = new Shake(date_begin);
                Shake date2 = new Shake(date_end);
                date2.playAnim();
                date1.playAnim();
            }
        });

        myrequestsButton.setOnAction(event -> {
            Click m = new Click(myrequestsButton);
            m.playAnim();

            request_button1.setVisible(true);
            vacation_anchor.setVisible(false);
            try {
                getRequests();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            requestTable.setVisible(true);
        });

        request_button1.setOnAction(event -> {
            Click m = new Click(request_button1);
            m.playAnim();
            requestTable.setVisible(false);
            vacation_anchor.setVisible(true);
            request_button1.setVisible(false);
        });

        next.setOnAction(event -> {
            April_AnchorPane.setVisible(false);
            May_AnchorPane.setVisible(true);
        });

        next_may.setOnAction(event -> {
            May_AnchorPane.setVisible(false);
            June_AnchorPane.setVisible(true);
        });

        prev_may.setOnAction(event -> {
            May_AnchorPane.setVisible(false);
            April_AnchorPane.setVisible(true);
        });

        next_june.setOnAction(event -> {
            June_AnchorPane.setVisible(false);
            July_AnchorPane.setVisible(true);
        });

        prev_june.setOnAction(event -> {
            June_AnchorPane.setVisible(false);
            May_AnchorPane.setVisible(true);
        });

        next_july.setOnAction(event -> {
            July_AnchorPane.setVisible(false);
            August_AnchorPane.setVisible(true);
        });

        prev_july.setOnAction(event -> {
            July_AnchorPane.setVisible(false);
            June_AnchorPane.setVisible(true);
        });

        next_august.setOnAction(event -> {
            August_AnchorPane.setVisible(false);
            September_AnchorPane.setVisible(true);
        });

        prev_august.setOnAction(event -> {
            August_AnchorPane.setVisible(false);
            July_AnchorPane.setVisible(true);
        });

        prev_september.setOnAction(event -> {
            September_AnchorPane.setVisible(false);
            August_AnchorPane.setVisible(true);
        });

        clientsButton.setOnAction(event -> {
            Click client = new Click(clientsAnchor);
            client.playAnim();
            offEverythingMyInfo();
            offEverythingSchedule();
            offEverythingTariffs();
            clientRegister.setVisible(false);

            if(!ClientSearchAnchor.visibleProperty().get() && !clientAdding.visibleProperty().get()
            && !infoChanging.visibleProperty().get()){
                ClientSearchAnchor.setVisible(true);
                clientAdding.setVisible(true);
                infoChanging.setVisible(true);
            }else{
                offEverythingClients();
            }

            try {
                getClients();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            getSearch();
        });

        clientAdd.setOnAction(event -> {
            Click cl = new Click(clientAdding);
            cl.playAnim();

            clientAdding.setVisible(false);
            infoChanging.setVisible(false);
            clientRegister.setVisible(true);
            addedText.setVisible(false);
        });

        cancelRegister.setOnAction(event -> {
            clientRegister.setVisible(false);
            clientAdding.setVisible(true);
            infoChanging.setVisible(true);

        });

        addButton.setOnAction(event -> {
            Click add = new Click(clientAdd);
            add.playAnim();
            addButton.setVisible(true);
            cancelRegister.setVisible(true);

            String login = newClientLog.getText().trim();
            String password = newClientPass.getText().trim();
            String checkpass = newClientPass2.getText().trim();
            String name = newClientName.getText().trim();
            String number = newClientNumber.getText().trim();

            if(Director1.isNumeric(number)) {
                if (!name.equals("") && !login.equals("") && !password.equals("") && !checkpass.equals("")) {
                    try {
                        signUpNewClient(login, password, checkpass, name, number);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    Shake clientLoginAnim = new Shake(newClientLog);
                    Shake clientPassAnim = new Shake(newClientPass);
                    Shake clientPassAnim2 = new Shake(newClientPass2);
                    Shake clientAnim = new Shake(newClientName);
                    clientLoginAnim.playAnim();
                    clientPassAnim.playAnim();
                    clientPassAnim2.playAnim();
                    clientAnim.playAnim();
                }
            }else{
                Shake clientNumber = new Shake(newClientNumber);
                clientNumber.playAnim();
            }
        });

        infoChange.setOnAction(event -> {
            infoChanging.setVisible(false);
            clientAdding.setVisible(false);
            clientChange1.setVisible(true);
            changedText.setVisible(false);
        });

        nextButton.setOnAction(event -> {
            Click next = new Click(nextButton);
            next.playAnim();
            String name = changeClientName1.getText().trim();
            String login = "";
            String number = "";

            if(!name.equals("")){
                DatabaseHandler dbHandler = new DatabaseHandler();
                ResultSet resultSet = dbHandler.getClients();

                while (true) {
                    try {
                        if (!resultSet.next()) {
                            break;
                        } else if (name.equals(resultSet.getString("name"))) {
                            name = resultSet.getString("name");
                            login = resultSet.getString(Const.CLIENT_LOGIN);
                            number = resultSet.getString(Const.CLIENT_NUMBER);
                            id = resultSet.getInt(Const.CLIENT_ID);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                Shake n = new Shake(changeClientName1);
                n.playAnim();
            }
            if(!login.equals("")){
                clientChange1.setVisible(false);
                clientChange.setVisible(true);
                changeClientNumber.setText(number);
                changeClientName.setText(name);
                changeClientLog.setText(login);
                changedText.setVisible(false);
                changeClientName1.clear();
            }else{
                Shake shakeName = new Shake(changeClientName1);
                shakeName.playAnim();
            }
        });

        cancelChange1.setOnAction(event -> {
            clientChange1.setVisible(false);
            infoChanging.setVisible(true);
            clientAdding.setVisible(true);
        });

        cancelChange.setOnAction(event -> {
            clientChange.setVisible(false);
            infoChanging.setVisible(true);
            clientAdding.setVisible(true);
        });

        changeButton.setOnAction(event -> {
            Click change = new Click(changeButton);
            change.playAnim();

            String name = changeClientName.getText().trim();
            String login = changeClientLog.getText().trim();
            String number = changeClientNumber.getText().trim();

            if(Director1.isNumeric(number)){
                if(!name.equals("") && !login.equals("")){
                    try {
                        changeClientInfo(name, login, number);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake shake = new Shake(changeClientName);
                    Shake shake1 = new Shake(changeClientLog);
                    shake.playAnim();
                    shake1.playAnim();
                }
            }else{
                Shake shake = new Shake(changeClientNumber);
                shake.playAnim();
            }

        });

        tariffs.setOnAction(event -> {
            Click tariff = new Click(tariffsAnchor);
            tariff.playAnim();
            offEverythingClients();
            offEverythingSchedule();
            offEverythingMyInfo();
            clientRegister.setVisible(false);

            if(!fullTariffsAnchor.visibleProperty().get()) {
                fullTariffsAnchor.setVisible(true);
                Super_AnchorPane.setVisible(true);
            }else{
                offEverythingTariffs();
            }
        });

        next_super.setOnAction(event -> {
            Super_AnchorPane.setVisible(false);
            Regular_AnchorPane.setVisible(true);
        });
        next_regular.setOnAction(event -> {
            Regular_AnchorPane.setVisible(false);
            Super2_AnchorPane.setVisible(true);
        });
        next_super2.setOnAction(event -> {
            Super2_AnchorPane.setVisible(false);
            Regular2_AnchorPane.setVisible(true);
        });
        next_regular2.setOnAction(event -> {
            Regular2_AnchorPane.setVisible(false);
            Just_AnchorPane.setVisible(true);
        });
        next_just.setOnAction(event -> {
            Just_AnchorPane.setVisible(false);
            Free_AnchorPane.setVisible(true);
        });
        next_free.setOnAction(event -> {
            Free_AnchorPane.setVisible(false);
            Super_AnchorPane.setVisible(true);
        });

        super_add.setOnAction(event -> {
            Super_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Super";
            addedText.setVisible(false);
        });

        regular_add.setOnAction(event -> {
            Regular_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Regular";
            addedText.setVisible(false);
        });

        super2_add.setOnAction(event -> {
            Super2_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Super+";
            addedText.setVisible(false);
        });

        just_add.setOnAction(event -> {
            Just_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Just Call";
            addedText.setVisible(false);
        });

        regular2_add.setOnAction(event -> {
            Regular2_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Regular+";
            addedText.setVisible(false);
        });

        free_add.setOnAction(event -> {
            Free_AnchorPane.setVisible(false);
            addButton.setVisible(false);
            cancelRegister.setVisible(false);
            clientRegister.setVisible(true);
            addButton1.setVisible(true);
            tariff = "Free";
            addedText.setVisible(false);
        });

        addButton1.setOnAction(event -> {
            Click ad = new Click(addButton1);
            ad.playAnim();

            String login = newClientLog.getText().trim();
            String password = newClientPass.getText().trim();
            String checkpass = newClientPass2.getText().trim();
            String name = newClientName.getText().trim();
            String number = newClientNumber.getText().trim();

            if(Director1.isNumeric(number)) {
                if (!name.equals("") && !login.equals("") && !password.equals("") && !checkpass.equals("")) {
                    try {
                        signUpClient(login, password, checkpass, name, number, tariff);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    Shake clientLoginAnim = new Shake(newClientLog);
                    Shake clientPassAnim = new Shake(newClientPass);
                    Shake clientPassAnim2 = new Shake(newClientPass2);
                    Shake clientAnim = new Shake(newClientName);
                    clientLoginAnim.playAnim();
                    clientPassAnim.playAnim();
                    clientPassAnim2.playAnim();
                    clientAnim.playAnim();
                }
            }else{
                Shake clientNumber = new Shake(newClientNumber);
                clientNumber.playAnim();
            }
        });



    }

    private void signUpClient(String login, String password, String checkpass, String name, String number, String tariff) throws SQLException {
        DatabaseHandler dbhandler = new DatabaseHandler();
        Client client = new Client(login, password);
        client.setNumber(number);
        client.setName(name);
        client.setTariff(tariff);

        if (password.equals(checkpass)) {
            dbhandler.signUpClientWithTariff(client);
            addedText.setVisible(true);
            newClientLog.clear();
            newClientPass.clear();
            newClientPass2.clear();
            newClientName.clear();
            newClientNumber.clear();
        } else {
            Shake clientPassAnim = new Shake(newClientPass);
            Shake clientPassAnim2 = new Shake(newClientPass2);
            clientPassAnim.playAnim();
            clientPassAnim2.playAnim();
        }

        getClients();
    }

    private void changeClientInfo(String name, String login, String number) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Client client = new Client();
        client.setName(name);
        client.setLogin(login);
        client.setNumber(number);
        client.setId(id);

        dbHandler.changeClientInfo(client);
        getClients();
        changeClientName.clear();
        changeClientNumber.clear();
        changeClientLog.clear();
        changedText.setVisible(true);
    }

    private void signUpNewClient(String login, String password, String checkpass, String name, String number) throws SQLException {
        DatabaseHandler dbhandler = new DatabaseHandler();
        Client client = new Client(login, password);
        client.setNumber(number);
        client.setName(name);

        if (password.equals(checkpass)) {
            dbhandler.signUpClient(client);
            addedText.setVisible(true);
            newClientLog.clear();
            newClientPass.clear();
            newClientPass2.clear();
            newClientName.clear();
            newClientNumber.clear();
        } else {
            Shake clientPassAnim = new Shake(newClientPass);
            Shake clientPassAnim2 = new Shake(newClientPass2);
            clientPassAnim.playAnim();
            clientPassAnim2.playAnim();
        }

        getClients();
    }

    private void getSearch(){

        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.getClients();
        ObservableList<Client> observableList = FXCollections.observableArrayList();

        while (true) {
            try {
                if (!resultSet.next())
                    break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                observableList.add(new Client(resultSet.getString(Const.CLIENT_LOGIN),
                        resultSet.getString(Const.CLIENT_NAME),
                        resultSet.getString(Const.CLIENT_NUMBER),
                        resultSet.getString(Const.CLIENT_TARIFF),
                        resultSet.getInt(Const.CLIENT_BALANCE)));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        FilteredList<Client> fList = new FilteredList<>(observableList, p -> true);
        clientsTable.setItems(fList);

        searchText.textProperty().addListener((observable, oldvalue, newvalue) ->{
            switch (searchBox.getValue()){
                case "Login":
                    fList.setPredicate(p -> p.getLogin().toLowerCase().contains(newvalue.toLowerCase().trim()));
                    break;
                case "Name":
                    fList.setPredicate(p -> p.getName().toLowerCase().contains(newvalue.toLowerCase().trim()));
                    break;
                case "Number":
                    fList.setPredicate(p -> p.getNumber().toLowerCase().contains(newvalue.toLowerCase().trim()));
                    break;
                case "Tariff":
                    fList.setPredicate(p -> p.getTariff().toLowerCase().contains(newvalue.toLowerCase().trim()));
                    break;
            }
        } );

        searchBox.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldVal, newVal) ->{
            if(newVal!=null){
                searchText.setText("");
            }
        } ));
    }

    private void getClients() throws SQLException {
        ObservableList<Client> clientObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.getClients();

        while (true) {
            try {
                if (!resultSet.next())
                    break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Client client = new Client();
            client.setLogin(resultSet.getString("login"));
            client.setName(resultSet.getString(Const.CLIENT_NAME));
            client.setNumber(resultSet.getString(Const.CLIENT_NUMBER));
            client.setTariff(resultSet.getString(Const.CLIENT_TARIFF));
            client.setBalance(resultSet.getInt(Const.CLIENT_BALANCE));
            clientObservableList.add(client);
        }

        tableLogin.setCellValueFactory(new PropertyValueFactory<Client, String>("login"));
        tableName.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
        tableNumber.setCellValueFactory(new PropertyValueFactory<Client, String>("number"));
        tableTariff.setCellValueFactory(new PropertyValueFactory<Client, String>("tariff"));
        tableBalance.setCellValueFactory(new PropertyValueFactory<Client, Integer>("balance"));

        clientsTable.setItems(clientObservableList);
    }

    private void getRequests() throws SQLException {
        ObservableList<Vacation> tariffObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getVacations();
        ResultSet resultSet = dbHandler.getInfoWorker();
        String name = "";

        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                    name = resultSet.getString("name");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            try {
                if (!result.next()){
                    break;
                }else if(result.getString(Const.VACATION_WORKERNAME).equals(name)){
                    tariffObservableList.add(new Vacation(
                            result.getString(Const.VACATION_BEGINDATE),
                            result.getString(Const.VACATION_ENDDATE),
                            result.getString(Const.VACATION_STATUS)));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        tableBegin.setCellValueFactory(new PropertyValueFactory<Vacation, String>(Const.VACATION_BEGINDATE));
        tableEnd.setCellValueFactory(new PropertyValueFactory<Vacation, String>(Const.VACATION_ENDDATE));
        tableStatus.setCellValueFactory(new PropertyValueFactory<Vacation, String>(Const.VACATION_STATUS));

        requestTable.setItems(tariffObservableList);
    }

    private void changeWorkerInfo(String newInfo){
        DatabaseHandler dbHandler = new DatabaseHandler();
        Worker worker = new Worker(Clogin, Cpassword);
        ResultSet resultSet = dbHandler.getWorker(worker);

        if (workerNewInfo.getPromptText().equals("Enter your new name")) {
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        worker.setName(newInfo);
                        worker.setId(resultSet.getInt("idworkers"));
                        dbHandler.changeWorkerName(worker);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(workerNewInfo.getPromptText().equals("Enter your new login")){
            worker.setLogin(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("password").equals(Cpassword)) {
                        worker.setId(resultSet.getInt("idworkers"));
                        dbHandler.changeWorkerLogin(worker);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(workerNewInfo.getPromptText().equals("Enter your new password")){
            worker.setPassword(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        worker.setId(resultSet.getInt("idworkers"));
                        dbHandler.changeWorkerPassword(worker);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(workerNewInfo.getPromptText().equals("Enter your new lastname")){
            worker.setLastname(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        worker.setId(resultSet.getInt("idworkers"));
                        dbHandler.changeWorkerLastname(worker);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void getInfo(){
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.getInfoWorker();

        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                    lastnameLabel.setText("Your lastname: " + resultSet.getString("lastname"));
                    nameLabel.setText("Your name: " + resultSet.getString("name"));
                    salaryLabel.setText("Your salary: " + resultSet.getString("salary"));
                    loginLabel.setText("Your login: " + resultSet.getString("login"));
                    passwordLabel.setText("Your password: " + resultSet.getString("password"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void offEverythingMyInfo(){
        fullInfoAnchor.setVisible(false);
        changeWorkerInfoAnchor.setVisible(false);
        workerInfoChangeAnchor.setVisible(false);
    }

    private void offEverythingSchedule(){
        monthsAnchor.setVisible(false);
        vacation_anchor.setVisible(false);
        requestTable.setVisible(false);
        request_button1.setVisible(false);
    }

    private void offEverythingClients(){
        ClientSearchAnchor.setVisible(false);
        clientAdding.setVisible(false);
        infoChanging.setVisible(false);
        clientRegister.setVisible(false);
        clientChange.setVisible(false);
        clientChange1.setVisible(false);
    }

    private void offEverythingTariffs(){
        fullTariffsAnchor.setVisible(false);
    }

}