package com.example.courseproject2;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static com.example.courseproject2.Controller.Clogin;
import static com.example.courseproject2.Controller.Cpassword;

public class Client1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text myInfo;

    @FXML
    private Button myInfoButton;

    @FXML
    private Text logout;

    @FXML
    private Button logoutButton;

    @FXML
    private Text tariffs;

    @FXML
    private Button tariffsButton;

    @FXML
    private Text NameText;

    @FXML
    private TableView<Tariff> tariffsTable;

    @FXML
    private TableColumn<Tariff, String> tableTariffCalls;

    @FXML
    private TableColumn<Tariff, String> tableTariffDuration;

    @FXML
    private TableColumn<Tariff, String> tableTariffInternet;

    @FXML
    private TableColumn<Tariff, String> tableTariffName;

    @FXML
    private TableColumn<Tariff, Integer> tableTariffPrice;

    @FXML
    private AnchorPane tariffsAnchor;

    @FXML
    private AnchorPane myInfoAnchor;

    @FXML
    private AnchorPane logoutAnchor;

    @FXML
    private Button chooseTariffButton;

    @FXML
    private AnchorPane tariffChoose;

    @FXML
    private ChoiceBox<String> chooseTariffBox;

    @FXML
    private Label nameofTariff;

    @FXML
    private AnchorPane choosingAnchor;

    @FXML
    private AnchorPane fullInfoAnchor;

    @FXML
    private Label loginLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label numberLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private Label tariffLabel;

    @FXML
    private Label balanceLabel;

    @FXML
    private AnchorPane changeClientInfoAnchor;

    @FXML
    private Button changeClientLogin;

    @FXML
    private Button changeClientName;

    @FXML
    private Button changeClientNumber;

    @FXML
    private Button changeClientPassword;

    @FXML
    private Button topUpTheBalance;

    @FXML
    private Button changeClientInfoButton;

    @FXML
    private TextField clientNewInfo;

    @FXML
    private AnchorPane clientInfoChangeAnchor;

    @FXML
    private Label currentInfoText;

    @FXML
    private Button rateDet;

    @FXML
    private AnchorPane rateDetAnchor;

    @FXML
    private Button rateSubmit;

    @FXML
    private TextField review;

    @FXML
    private ChoiceBox<String> rate;

    @FXML
    private Label ratingofApp;

    @FXML
    private AnchorPane rateUsAnchor;

    @FXML
    private Label reviewLabel;

    @FXML
    private Button ratingButton;

    @FXML
    private Button complainButton;

    @FXML
    private AnchorPane complainAnchor;

    @FXML
    private ChoiceBox<String> reasonOfComplain;

    @FXML
    private TextField complainTextField;

    @FXML
    private Button complainSubmit;

    @FXML
    private Label reviewLabelComplain;

    @FXML
    private AnchorPane myInfoAnchor1;

    @FXML
    private AnchorPane tariffsAnchor1;

    @FXML
    private Text myInfo1;

    @FXML
    private Text tariffs1;

    @FXML
    private Button myInfoButton1;

    @FXML
    private Button tariffsButton1;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private Button cancelButtonTariff;

    @FXML
    void initialize(){
        offEverythingTariffs();
        offEverythingMyInfo();
        offEverythingRate();
        mainAnchor.setVisible(true);

        try {
            nameText();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        NameText.setVisible(true);

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

        tariffsButton1.setOnAction(event -> { //кнопка tariffs
            offEverythingMain();
            offEverythingMyInfo();
            offEverythingRate();

            Click tariffAnim = new Click(tariffsAnchor1);
            tariffAnim.playAnim();
            NameText.setVisible(false);
            try {
                getTariffs();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (!tariffsTable.visibleProperty().get() && !tariffChoose.visibleProperty().get()) {
                tariffsTable.setVisible(true);
                tariffChoose.setVisible(true);

            } else {
                offEverythingTariffs();
            }

        });

        tariffsButton.setOnAction(event -> { //кнопка tariffs
            offEverythingMain();
            offEverythingMyInfo();
            offEverythingRate();

            Click tariffAnim = new Click(tariffsAnchor);
            tariffAnim.playAnim();
            NameText.setVisible(false);
            try {
                getTariffs();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (!tariffsTable.visibleProperty().get() && !tariffChoose.visibleProperty().get()) {
                tariffsTable.setVisible(true);
                tariffChoose.setVisible(true);

            } else {
                offEverythingTariffs();
            }

        });

        chooseTariffButton.setOnAction(event -> { //кнопка choose tariff
            Click tariffButtonAnim = new Click(tariffChoose);
            tariffButtonAnim.playAnim();

            if (tariffsTable.visibleProperty().get() && !choosingAnchor.visibleProperty().get()) {
                tariffsTable.setVisible(false);
                choosingAnchor.setVisible(true);
            }else if(!choosingAnchor.visibleProperty().get()){
                choosingAnchor.setVisible(true);
            }else{
                choosingAnchor.setVisible(false);
                tariffsTable.setVisible(true);
            }

        });

        tariffs();
        chooseTariffBox.setOnAction(event -> { //Все тарифы
            DatabaseHandler dbHandler = new DatabaseHandler();
            int idishka = 0;
            int balance = 0;
            int price = 0;
            String begin = "";
            String end = "";
            ResultSet resultSet = dbHandler.getInfo();
            ResultSet resSet = dbHandler.getTariffs();
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        idishka = resultSet.getInt("idclients");
                        balance = resultSet.getInt("balance");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            String tariffsValue = chooseTariffBox.getValue();

            while (true) {
                try {
                    if (!resSet.next()) {
                        break;
                    }else if (resSet.getString("name").equals(tariffsValue)){
                        price = resSet.getInt("price");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            Client client = new Client();
            client.setLogin(Clogin);
            client.setTariff(tariffsValue);
            int ID = Integer.parseInt(String.valueOf(idishka));
            client.setId(ID);
            if(balance-price>=0) {
                client.setBalance(balance-price);
                dbHandler.changeClientBalance(client);
                dbHandler.chooseTariff(client);
            }

            DatabaseHandler dbhandler1 = new DatabaseHandler();
            ResultSet resultSet1 = dbhandler1.getInfo();

            while (true) {
                try {
                    if (!resultSet1.next()) {
                        break;
                    }else if (resultSet1.getString("login").equals(Clogin) && resultSet1.getString("password").equals(Cpassword)){
                        begin = resultSet1.getString(Const.CLIENT_BEGINNINGDATE);
                        end = resultSet1.getString(Const.CLIENT_ENDINGDATE);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            nameofTariff.setText("Your tariff is "+tariffsValue+"!\n" +
                    "Beginning date: " + begin
                    + "\nEnding date: " + end);
        });


        myInfoButton1.setOnAction(event -> { //кнопка myInfo
            offEverythingTariffs();
            offEverythingMain();
            offEverythingRate();

            Click myInfoAnim = new Click(myInfoAnchor1);
            myInfoAnim.playAnim();
            NameText.setVisible(false);

            if (!fullInfoAnchor.visibleProperty().get() && !changeClientInfoAnchor.visibleProperty().get()) {
                fullInfoAnchor.setVisible(true);
                changeClientInfoAnchor.setVisible(true);

            } else {
                offEverythingMyInfo();
            }

            getInfo();
        });

        myInfoButton.setOnAction(event -> { //кнопка myInfo
            offEverythingTariffs();
            offEverythingMain();
            offEverythingRate();

            Click myInfoAnim = new Click(myInfoAnchor);
            myInfoAnim.playAnim();
            NameText.setVisible(false);

            if (!fullInfoAnchor.visibleProperty().get() && !changeClientInfoAnchor.visibleProperty().get()) {
                fullInfoAnchor.setVisible(true);
                changeClientInfoAnchor.setVisible(true);

            } else {
                offEverythingMyInfo();
            }

            getInfo();
        });

        cancelButtonTariff.setOnAction(event -> {
            fullInfoAnchor.setVisible(true);
            changeClientInfoAnchor.setVisible(true);
            clientInfoChangeAnchor.setVisible(false);
        });

        changeClientName.setOnAction(event -> { // Change name справа
            Click changeN= new Click(changeClientName);
            changeN.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);

            clientNewInfo.setPromptText("Enter your new name");

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

            changeClientInfoAnchor.setVisible(false);
            clientInfoChangeAnchor.setVisible(true);
        });

        changeClientLogin.setOnAction(event -> { // Change login справа
            Click changeN = new Click(changeClientLogin);
            changeN.playAnim();

            clientNewInfo.setPromptText("Enter your new login");

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);

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

            changeClientInfoAnchor.setVisible(false);
            clientInfoChangeAnchor.setVisible(true);
        });

        changeClientPassword.setOnAction(event -> { // Change password справа
            Click changeN = new Click(changeClientPassword);
            changeN.playAnim();

            clientNewInfo.setPromptText("Enter your new password");

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);

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

            changeClientInfoAnchor.setVisible(false);
            clientInfoChangeAnchor.setVisible(true);
        });

        changeClientNumber.setOnAction(event -> { // Change number справа
            Click changeN = new Click(changeClientNumber);
            changeN.playAnim();

            clientNewInfo.setPromptText("Enter your new number");

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current number: " + resultSet.getString("number"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeClientInfoAnchor.setVisible(false);
            clientInfoChangeAnchor.setVisible(true);
        });

        topUpTheBalance.setOnAction(event -> { // top up balance справа
            Click changeN = new Click(topUpTheBalance);
            changeN.playAnim();

            clientNewInfo.setPromptText("Enter the amount to top up");
            changeClientInfoButton.setText("Top up");

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);

            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                        currentInfoText.setText("Your current balance: " + resultSet.getInt("balance"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            changeClientInfoAnchor.setVisible(false);
            clientInfoChangeAnchor.setVisible(true);
        });

        changeClientInfoButton.setOnAction(event -> { // Кнопка change в  Anchor
            Click changeN = new Click(changeClientInfoButton);
            changeN.playAnim();

            String newInfo = clientNewInfo.getText().trim();
            if(clientNewInfo.getPromptText().equals("Enter your new name")) {
                if (!newInfo.equals("")) {
                    changeClientInfo(newInfo);
                    clientNewInfo.clear();
                    changeClientInfoAnchor.setVisible(true);
                    clientInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(clientNewInfo);
                    nameShake.playAnim();
                }
            }else if(clientNewInfo.getPromptText().equals("Enter your new login")){
                if (!newInfo.equals("")) {
                    changeClientInfo(newInfo);
                    clientNewInfo.clear();
                    Clogin = newInfo;
                    changeClientInfoAnchor.setVisible(true);
                    clientInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(clientNewInfo);
                    nameShake.playAnim();
                }
            }else if(clientNewInfo.getPromptText().equals("Enter your new password")){
                if (!newInfo.equals("")) {
                    changeClientInfo(newInfo);
                    clientNewInfo.clear();
                    Cpassword = newInfo;
                    changeClientInfoAnchor.setVisible(true);
                    clientInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(clientNewInfo);
                    nameShake.playAnim();
                }
            }else if(clientNewInfo.getPromptText().equals("Enter your new number")){
                if (!newInfo.equals("") && Director1.isNumeric(newInfo)) {
                    changeClientInfo(newInfo);
                    clientNewInfo.clear();
                    changeClientInfoAnchor.setVisible(true);
                    clientInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(clientNewInfo);
                    nameShake.playAnim();
                }
            }else if(clientNewInfo.getPromptText().equals("Enter the amount to top up")){
                if (!newInfo.equals("") && Director1.isNumeric(newInfo)) {
                    changeClientInfo(newInfo);
                    clientNewInfo.clear();
                    changeClientInfoAnchor.setVisible(true);
                    clientInfoChangeAnchor.setVisible(false);
                } else {
                    Shake nameShake = new Shake(clientNewInfo);
                    nameShake.playAnim();
                }
            }
            getInfo();
        });

        ratings();
        rateDet.setOnAction(event -> {
            offEverythingTariffs();
            offEverythingMyInfo();
            offEverythingMain();
            ratingofApp.setVisible(false);
            reviewLabel.setVisible(false);
            reviewLabelComplain.setVisible(false);

            Click rateAnim = new Click(rateDetAnchor);
            rateAnim.playAnim();
            NameText.setVisible(false);

            if (!rateUsAnchor.visibleProperty().get() && !complainButton.visibleProperty().get()) {
                rateUsAnchor.setVisible(true);
                complainButton.setVisible(true);
            }else {
                offEverythingRate();
            }
        });


        rateSubmit.setOnAction(actionEvent -> {
            Click rateAnim = new Click(rateSubmit);
            rateAnim.playAnim();
            addRate();
            getRate();
        });

        ratingButton.setOnAction(event -> {
            Click ratingAnim = new Click(ratingButton);
            ratingAnim.playAnim();
            getRate();
            if(!ratingofApp.visibleProperty().get()) {
                ratingofApp.setVisible(true);
            }else{
                ratingofApp.setVisible(false);
            }
        });

        complainButton.setOnAction(event -> {
            Click complainAnim = new Click(complainButton);
            complainAnim.playAnim();
            if(!complainAnchor.visibleProperty().get()){
                rateUsAnchor.setVisible(false);
                complainAnchor.setVisible(true);
                complainButton.setText("Cancel");
                reviewLabelComplain.setVisible(false);
            }else{
                complainAnchor.setVisible(false);
                rateUsAnchor.setVisible(true);
                complainButton.setText("Complain");
            }
        });

        addComplain();
        complainSubmit.setOnAction(actionEvent -> {
            Click submitClick = new Click(complainSubmit);
            submitClick.playAnim();

            DatabaseHandler dbHandler = new DatabaseHandler();
            Client client = new Client(Clogin, Cpassword);
            ResultSet resultSet = dbHandler.getClient(client);
            String clientName = "";
            if(reasonOfComplain.getValue()!=null && !complainTextField.getText().equals("")) {
                while (true) {
                    try {
                        if (!resultSet.next()) {
                            break;
                        } else if (resultSet.getString("login").equals(Clogin)) {
                            clientName=resultSet.getString("name");
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                String reason = reasonOfComplain.getValue();
                String complain1 = complainTextField.getText();
                Complain complain = new Complain(reason, complain1, clientName);
                dbHandler.addComplain(complain);
                reviewLabelComplain.setVisible(true);
                complainTextField.clear();
            }else{
                Shake reasonShake = new Shake(reasonOfComplain);
                Shake complainShake = new Shake(complainTextField);
                reasonShake.playAnim();
                complainShake.playAnim();
            }
        });

    }

    private void addComplain() {
        ArrayList<String>complains = new ArrayList<>();
        complains.add("Internet problems");
        complains.add("Connection problems");
        complains.add("Periodically money is taken from my balance");
        complains.add("Changing the terms of use of services without my knowledge");
        complains.add("Other");
        reasonOfComplain.getItems().addAll(complains);
    }

    private void getRate(){
        double counter = 0.0;
        double allrate = 0;
        ArrayList<Integer>quantityRate = new ArrayList<>();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.getRating();
        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }else {
                    quantityRate.add(Integer.valueOf(resultSet.getString("rating")));
                    allrate += Integer.parseInt(resultSet.getString("rating"));
                    counter++;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            String currentRate = String.format("%.3f", allrate/counter);
            String allOfRates = String.valueOf(quantityRate.size());
            ratingofApp.setText(String.valueOf("  Rate of the service: "+ currentRate  +"\n" +"\n" + "  Overall ranking: "+allOfRates));
        }
    }

    private void addRate() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        String rating = "";
        String review1 = "";
        if(!(rate.getValue() == null) && !review.getText().equals("")){
            rating = rate.getValue();
            review1 = review.getText();
            Rate rate = new Rate(rating,review1);
            dbHandler.rating(rate);
            reviewLabel.setVisible(true);
            review.clear();
        }else{
            Shake shakeRate = new Shake(rate);
            Shake shakeReview = new Shake(review);
            shakeRate.playAnim();
            shakeReview.playAnim();
        }
    }

    private void ratings() {
        ArrayList<String> ratingList = new ArrayList<>();
        for(int i = 1;i<=10;i++){
            ratingList.add(String.valueOf(i));
        }
        rate.getItems().addAll(ratingList);
    }

    private void changeClientInfo(String newInfo) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Client client = new Client(Clogin, Cpassword);
        ResultSet resultSet = dbHandler.getClient(client);

        if (clientNewInfo.getPromptText().equals("Enter your new name")) {
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        client.setName(newInfo);
                        client.setId(resultSet.getInt("idclients"));
                        dbHandler.changeClientName(client);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(clientNewInfo.getPromptText().equals("Enter your new login")){
            client.setLogin(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("password").equals(Cpassword)) {
                        client.setId(resultSet.getInt("idclients"));
                        dbHandler.changeClientLogin(client);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(clientNewInfo.getPromptText().equals("Enter your new password")){
            client.setPassword(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        client.setId(resultSet.getInt("idclients"));
                        dbHandler.changeClientPassword(client);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(clientNewInfo.getPromptText().equals("Enter your new number")){
            client.setNumber(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        client.setId(resultSet.getInt("idclients"));
                        dbHandler.changeClientNumber(client);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else if(clientNewInfo.getPromptText().equals("Enter the amount to top up")){
            int newInfo1 = Integer.parseInt(newInfo);
            while (true) {
                try {
                    if (!resultSet.next()) {
                        break;
                    } else if (resultSet.getString("login").equals(Clogin)) {
                        client.setBalance(newInfo1+resultSet.getInt("balance"));
                        dbHandler.changeClientBalance(client);
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void getInfo(){
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet resultSet = dbHandler.getInfo();

        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }else if (resultSet.getString("login").equals(Clogin) && resultSet.getString("password").equals(Cpassword)){
                    tariffLabel.setText("Your current tariff: " + resultSet.getString("tariff")
                    + "\nBeginning date: " + resultSet.getString("beginningDate") + "\nEnding date: " +
                            resultSet.getString("endingDate"));
                    nameLabel.setText("Your name: " + resultSet.getString("name"));
                    numberLabel.setText("Your number: " + resultSet.getString("number"));
                    loginLabel.setText("Your login: " + resultSet.getString("login"));
                    passwordLabel.setText("Your password: " + resultSet.getString("password"));
                    balanceLabel.setText("Your balance: " + resultSet.getInt("balance"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private void getTariffs() throws SQLException {
        ObservableList<Tariff> tariffObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getTariffs();

        while (true) {
            try {
                if (!result.next())
                    break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            tariffObservableList.add(new Tariff(
                    result.getString("name"),
                    result.getInt("price"),
                    result.getString("internet"),
                    result.getString("duration"),
                    result.getString("calls")));
        }
        tableTariffName.setCellValueFactory(new PropertyValueFactory<Tariff, String>("name"));
        tableTariffPrice.setCellValueFactory(new PropertyValueFactory<Tariff, Integer>("price"));
        tableTariffInternet.setCellValueFactory(new PropertyValueFactory<Tariff, String>("internet"));
        tableTariffDuration.setCellValueFactory(new PropertyValueFactory<Tariff, String>("duration"));
        tableTariffCalls.setCellValueFactory(new PropertyValueFactory<Tariff, String>("calls"));

        tariffsTable.setItems(tariffObservableList);
    }

    private void tariffs() {
        DatabaseHandler databaseHAndler = new DatabaseHandler();
        ResultSet result = databaseHAndler.chooseTariff();
        ArrayList<String> tariff = new ArrayList<>();
        while (true) {
            try {
                if (!result.next())
                    break;
                else
                    tariff.add(result.getString("name"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        chooseTariffBox.getItems().addAll(tariff);
    }

    private void nameText() throws SQLException {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        Client client = new Client(Clogin, Cpassword);
        ResultSet resSet = databaseHandler.getClient(client);

        while (true) {
            try {
                if (!resSet.next()) {
                    break;
                }else if (resSet.getString("login").equals(Clogin)){
                    NameText.setText("Hello dear " + resSet.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private void offEverythingTariffs() {
        tariffsTable.setVisible(false);
        tariffChoose.setVisible(false);
        choosingAnchor.setVisible(false);
    }

    private void offEverythingMyInfo(){
        fullInfoAnchor.setVisible(false);
        changeClientInfoAnchor.setVisible(false);
        clientInfoChangeAnchor.setVisible(false);
    }

    private void offEverythingRate(){
        rateUsAnchor.setVisible(false);
        complainAnchor.setVisible(false);
        complainButton.setVisible(false);
    }

    private void offEverythingMain(){
        mainAnchor.setVisible(false);
    }
}




