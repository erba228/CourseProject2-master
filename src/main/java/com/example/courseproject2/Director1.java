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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static com.example.courseproject2.Controller.Clogin;
import static com.example.courseproject2.Controller.Cpassword;

public class Director1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane salaryChanging;

    @FXML
    private Button workerSalaryChange;

    @FXML
    private Button workerDelete;

    @FXML
    private AnchorPane workerDeleting;

    @FXML
    private Button workerAdd;

    @FXML
    private AnchorPane workerAdding;

    @FXML
    private AnchorPane clientRegister;

    @FXML
    private TextField newClientLog;

    @FXML
    private PasswordField newClientPass;

    @FXML
    private PasswordField newClientPass2;

    @FXML
    private Button addButton;

    @FXML
    private AnchorPane balanceChanging;

    @FXML
    private Button clientAdd;

    @FXML
    private AnchorPane clientAdding;

    @FXML
    private Button clientBalanceChange;

    @FXML
    private Button clientDelete;

    @FXML
    private AnchorPane clientDeleting;

    @FXML
    private AnchorPane clientDeleteAnchor;

    @FXML
    private TextField deleteClientLog;

    @FXML
    private PasswordField deleteClientPass;

    @FXML
    private Button clientsButton;

    @FXML
    private Text logout;

    @FXML
    private Button logoutButton;

    @FXML
    private TableView<Worker> workersTable;

    @FXML
    private TableColumn<Worker, String> tableLastname;

    @FXML
    private TableColumn<Worker, String> tableName;

    @FXML
    private TableColumn<Worker, String> tableLogin1;

    @FXML
    private TableColumn<Worker, String> tablePassword1;

    @FXML
    private TableColumn<Worker, Integer> tableSalary;

    @FXML
    private TableView<Client> clientsTable;

    @FXML
    private TableColumn<Client, String> tableLogin;

    @FXML
    private TableColumn<Client, String> tablePassword;

    @FXML
    private TableColumn<Client, Integer> tableBalance;

    @FXML
    private Button workersButton;

    @FXML
    private Text addedText;

    @FXML
    private Button addButtonWorker;

    @FXML
    private TextField newWorkerLog;

    @FXML
    private PasswordField newWorkerPass;

    @FXML
    private PasswordField newWorkerPass2;

    @FXML
    private TextField newWorkerSalary;

    @FXML
    private AnchorPane workerRegister;

    @FXML
    private TextField newWorkerName;

    @FXML
    private TextField newWorkerLastname;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField balanceClientLog;

    @FXML
    private TextField balanceNew;

    @FXML
    private AnchorPane changeBalanceAnchor;

    @FXML
    private Button changeBalanceButton;

    @FXML
    private TextField deleteWorkerPass;

    @FXML
    private TextField deleteWorkerLog;

    @FXML
    private AnchorPane workerDeleteAnchor;

    @FXML
    private Button workerDeleteButton;

    @FXML
    private TextField salaryNew;

    @FXML
    private TextField salaryWorkerLog;

    @FXML
    private Button changeSalaryButton;

    @FXML
    private AnchorPane salaryChangeAnchor;

    @FXML
    private Button tariffsButton;

    @FXML
    private TableColumn<Tariff, String> tableTariffCalls;

    @FXML
    private TableColumn<Tariff, String> tableTariffDuration;

    @FXML
    private TableColumn<Tariff, String> tableTariffInternet;

    @FXML
    private TableColumn<Tariff, Integer> tableTariffId;

    @FXML
    private TableColumn<Tariff, String> tableTariffName;

    @FXML
    private TableColumn<Tariff, Integer> tableTariffPrice;

    @FXML
    private TableView<Tariff> tariffsTable;

    @FXML
    private Button tariffAddButton;

    @FXML
    private AnchorPane tariffAdding;

    @FXML
    private Button tariffChangeButton;

    @FXML
    private AnchorPane tariffChanging;

    @FXML
    private Button tariffDeleteButton;

    @FXML
    private AnchorPane tariffDeleting;

    @FXML
    private TextField newTariffCalls;

    @FXML
    private TextField newTariffDuration;

    @FXML
    private TextField newTariffInternet;

    @FXML
    private TextField newTariffName;

    @FXML
    private TextField newTariffPrice;

    @FXML
    private AnchorPane tariffAdder;

    @FXML
    private Button addTariff;

    @FXML
    private AnchorPane tariffDeleteAnchor;

    @FXML
    private TextField tariffDeleteName;

    @FXML
    private Button deleteTariffBut;

    @FXML
    private Button changeTariffCalls;

    @FXML
    private Button changeTariffDuration;

    @FXML
    private Button changeTariffInternetVol;

    @FXML
    private Button changeTariffName;

    @FXML
    private Button changeTariffPrice;

    @FXML
    private AnchorPane tariffChangeAnchor;

    @FXML
    private Button changeTariffNameButton;

    @FXML
    private TextField tariffNewName;

    @FXML
    private TextField tariffChangeNameId;

    @FXML
    private AnchorPane tariffChangeNameAnchor;


    @FXML
    private AnchorPane tariffChangePriceAnchor;

    @FXML
    private TextField tariffChangePriceName;

    @FXML
    private TextField tariffNewPrice;

    @FXML
    private Button changeTariffPriceButton;

    @FXML
    private AnchorPane tariffChangeInternetAnchor;

    @FXML
    private TextField tariffChangeInternetName;

    @FXML
    private TextField tariffNewInternet;

    @FXML
    private Button changeTariffInternetButton;

    @FXML
    private AnchorPane tariffChangeDurationAnchor;

    @FXML
    private TextField tariffChangeDurationName;

    @FXML
    private TextField tariffNewDuration;

    @FXML
    private Button changeTariffDurationButton;

    @FXML
    private AnchorPane tariffChangeCallAnchor;

    @FXML
    private TextField tariffChangeCallName;

    @FXML
    private TextField tariffNewCall;

    @FXML
    private Button changeTariffCallButton;

    @FXML
    private AnchorPane tariffsAnchor;

    @FXML
    private AnchorPane clientsAnchor;

    @FXML
    private AnchorPane workersAnchor;

    @FXML
    private AnchorPane logoutAnchor;

    @FXML
    private TextField newClientNumber;

    @FXML
    private TextField newClientName;

    @FXML
    private Button complainVacButton;

    @FXML
    private AnchorPane complainVacation;

    @FXML
    private TableColumn<Vacation, String> tableBeginDate;

    @FXML
    private TableColumn<Vacation, String> tableEndDate;

    @FXML
    private TableColumn<Vacation, String> tableStatus;

    @FXML
    private TableColumn<Vacation, String> tableWorkerLname;

    @FXML
    private TableColumn<Vacation, String> tableWorkerName;

    @FXML
    private TableView<Vacation> vacTable;

    @FXML
    private TableView<Complain> complainTable;

    @FXML
    private TableColumn<Complain, String> tableComplainName;

    @FXML
    private TableColumn<Complain, String> tableComplainComplain;

    @FXML
    private TableColumn<Complain, String> tableComplainReason;

    @FXML
    private TableColumn<Vacation, Integer> tableVacId;

    @FXML
    private TextField idField;

    @FXML
    private ChoiceBox<String> idBox;


    @FXML
    void initialize() {
        offEverythingWorker(); // Выключать все окна worker'a
        offEverythingClient(); // Выключать все окна client'a
        offEverythingTariffs();
        offEverythingComplainVacation();


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


        clientsButton.setOnAction(event -> { // Сверху кнопка Clients
            offEverythingWorker();
            offEverythingTariffs();
            offEverythingComplainVacation();
            Click clientsAnim = new Click(clientsAnchor);
            clientsAnim.playAnim();
            try {
                getClients();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (!clientsTable.visibleProperty().get() && !clientAdding.visibleProperty().get()
                    && !clientDeleting.visibleProperty().get() && !balanceChanging.visibleProperty().get()
                    && !addedText.visibleProperty().get()) {
                clientsTable.setVisible(true);
                clientAdding.setVisible(true);
                clientDeleting.setVisible(true);
                balanceChanging.setVisible(true);

            } else {
                offEverythingClient();
            }
        });

        clientAdd.setOnAction(event -> { // Кнопка Add client слева
            Click cAdd = new Click(clientAdding);
            cAdd.playAnim();

            clientDeleteAnchor.setVisible(false);
            changeBalanceAnchor.setVisible(false);
            addedText.setVisible(false);

            if (clientsTable.visibleProperty().get() && !clientRegister.visibleProperty().get()) {
                clientsTable.setVisible(false);
                clientDeleteAnchor.setVisible(false);
                clientRegister.setVisible(true);
            }else if(!clientRegister.visibleProperty().get()){
                clientRegister.setVisible(true);
            }else{
                clientRegister.setVisible(false);
                clientsTable.setVisible(true);
            }
        });

        addButton.setOnAction(event -> { // Добавление нового клиента
            Click add = new Click(clientAdd);
            add.playAnim();

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

        clientDelete.setOnAction(event -> { // Слева кнопка Client Delete
            Click delC = new Click(clientDeleting);
            delC.playAnim();

            addedText.setVisible(false);
            clientRegister.setVisible(false);
            changeBalanceAnchor.setVisible(false);

            if (clientsTable.visibleProperty().get() && !clientDeleteAnchor.visibleProperty().get()) {
                clientsTable.setVisible(false);
                clientDeleteAnchor.setVisible(true);
            }else if(!clientDeleteAnchor.visibleProperty().get()){
                    clientDeleteAnchor.setVisible(true);
            }else {
                clientsTable.setVisible(true);
                clientDeleteAnchor.setVisible(false);
            }

        });

        deleteButton.setOnAction(event -> { // Удаление клиента
            Click delB = new Click(deleteButton);
            delB.playAnim();

            String login = deleteClientLog.getText().trim();
            String password = deleteClientPass.getText().trim();

            if (!login.equals("") && !password.equals("")) {
                try {
                    deleteClient(login, password);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake clientLoginAnim = new Shake(deleteClientLog);
                Shake clientPassAnim = new Shake(deleteClientPass);
                clientLoginAnim.playAnim();
                clientPassAnim.playAnim();
            }

        });

        clientBalanceChange.setOnAction(event -> {
            Click balance = new Click(balanceChanging);
            balance.playAnim();

            addedText.setVisible(false);
            clientRegister.setVisible(false);
            clientDeleteAnchor.setVisible(false);

            if(clientsTable.visibleProperty().get() && !changeBalanceAnchor.visibleProperty().get()){
                clientsTable.setVisible(false);
                changeBalanceAnchor.setVisible(true);
            }else if(!changeBalanceAnchor.visibleProperty().get()){
                changeBalanceAnchor.setVisible(true);
            }else{
                clientsTable.setVisible(true);
                changeBalanceAnchor.setVisible(false);
            }

        });

        changeBalanceButton.setOnAction(event -> {
            Click changeB = new Click(changeBalanceButton);
            changeB.playAnim();

            String login = balanceClientLog.getText().trim();

            if(isNumeric(balanceNew.getText().trim())){
                int balance = Integer.parseInt(balanceNew.getText().trim());

                if (!login.equals("")) {
                    try {
                        changeBalance(login, balance);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake clientLoginAnim = new Shake(deleteClientLog);
                    Shake clientPassAnim = new Shake(deleteClientPass);
                    clientLoginAnim.playAnim();
                    clientPassAnim.playAnim();
                }
            }else{
                Shake salaryTextShake = new Shake(balanceNew);
                salaryTextShake.playAnim();
            }
        });



        workersButton.setOnAction(event -> { // Сверху кнопка Workers
            offEverythingClient();
            offEverythingTariffs();
            offEverythingComplainVacation();
            Click workerAnim = new Click(workersAnchor);
            workerAnim.playAnim();

            try {
                getWorkers();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (!workersTable.visibleProperty().get() && !workerAdding.visibleProperty().get()
                && !workerDeleting.visibleProperty().get() && !salaryChanging.visibleProperty().get()) {
                workersTable.setVisible(true);
                workerAdding.setVisible(true);
                workerDeleting.setVisible(true);
                salaryChanging.setVisible(true);

            } else {
                offEverythingWorker();
            }
        });

        workerAdd.setOnAction(event -> { // Кнопка Add worker слева
            Click wAdd = new Click(workerAdding);
            wAdd.playAnim();

            addedText.setVisible(false);
            workerDeleteAnchor.setVisible(false);
            salaryChangeAnchor.setVisible(false);

            if (workersTable.visibleProperty().get() && !workerRegister.visibleProperty().get()) {
                workersTable.setVisible(false);
                workerDeleteAnchor.setVisible(false);
                salaryChangeAnchor.setVisible(false);
                workerRegister.setVisible(true);
            }else if(!workerRegister.visibleProperty().get()){
                workerRegister.setVisible(true);
            }else{
                workerRegister.setVisible(false);
                workersTable.setVisible(true);
            }
        });

        addButtonWorker.setOnAction(event -> { // Добавление нового работника
            Click addB = new Click(addButtonWorker);
            addB.playAnim();

            String name = newWorkerName.getText().trim();
            String lastname = newWorkerLastname.getText().trim();
            String login = newWorkerLog.getText().trim();
            String password = newWorkerPass.getText().trim();
            String checkpass = newWorkerPass2.getText().trim();

            if(isNumeric(newWorkerSalary.getText().trim())){
                int salary = Integer.parseInt(newWorkerSalary.getText().trim());

                if (!name.equals("") && !lastname.equals("") && !login.equals("") && !password.equals("") && !checkpass.equals("")) {
                    try {
                        signUpNewWorker(name, lastname, login, password, checkpass, salary);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake workerLoginAnim = new Shake(newWorkerLog);
                    Shake workerPassAnim = new Shake(newWorkerPass);
                    Shake workerPassAnim2 = new Shake(newWorkerPass2);
                    Shake workerName = new Shake(newWorkerName);
                    Shake workerLastname = new Shake(newWorkerLastname);
                    workerLoginAnim.playAnim();
                    workerPassAnim.playAnim();
                    workerPassAnim2.playAnim();
                    workerName.playAnim();
                    workerLastname.playAnim();
                }

            }else{
                Shake salaryTextShake = new Shake(newWorkerSalary);
                salaryTextShake.playAnim();
            }

        });

        workerDelete.setOnAction(event -> { // Слева кнопка Worker Delete
            Click delW = new Click(workerDeleting);
            delW.playAnim();

            addedText.setVisible(false);
            workerRegister.setVisible(false);
            salaryChangeAnchor.setVisible(false);


            if (workersTable.visibleProperty().get() && !workerDeleteAnchor.visibleProperty().get()) {
                workersTable.setVisible(false);
                workerDeleteAnchor.setVisible(true);
            }else if(!workerDeleteAnchor.visibleProperty().get()){
                workerDeleteAnchor.setVisible(true);
            }else {
                workersTable.setVisible(true);
                workerDeleteAnchor.setVisible(false);
            }

        });

        workerDeleteButton.setOnAction(event -> { // Удаление работника
            Click delB = new Click(workerDeleteButton);
            delB.playAnim();

            String login = deleteWorkerLog.getText().trim();
            String password = deleteWorkerPass.getText().trim();

            if (!login.equals("") && !password.equals("")) {
                try {
                    deleteWorker(login, password);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake workerLoginAnim = new Shake(deleteWorkerLog);
                Shake workerPassAnim = new Shake(deleteWorkerPass);
                workerLoginAnim.playAnim();
                workerPassAnim.playAnim();
            }

        });

        workerSalaryChange.setOnAction(event -> {
            Click salary = new Click(salaryChanging);
            salary.playAnim();

            addedText.setVisible(false);
            workerRegister.setVisible(false);
            workerDeleteAnchor.setVisible(false);

            if(workersTable.visibleProperty().get() && !salaryChangeAnchor.visibleProperty().get()){
                workersTable.setVisible(false);
                salaryChangeAnchor.setVisible(true);
            }else if(!salaryChangeAnchor.visibleProperty().get()){
                salaryChangeAnchor.setVisible(true);
            }else{
                workersTable.setVisible(true);
                salaryChangeAnchor.setVisible(false);
            }


        });

        changeSalaryButton.setOnAction(event -> { //Изменение ЗП слева кнопка
            Click changeS = new Click(changeSalaryButton);
            changeS.playAnim();

            String login = salaryWorkerLog.getText().trim();

            if(isNumeric(salaryNew.getText().trim())){
                int balance = Integer.parseInt(salaryNew.getText().trim());

                if (!login.equals("")) {
                    try {
                        changeSalary(login, balance);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake clientLoginAnim = new Shake(deleteClientLog);
                    Shake clientPassAnim = new Shake(deleteClientPass);
                    clientLoginAnim.playAnim();
                    clientPassAnim.playAnim();
                }


            }else{
                Shake salaryTextShake = new Shake(newWorkerSalary);
                salaryTextShake.playAnim();
            }
        });


        tariffsButton.setOnAction(event -> { // Кнопка tariffs
            offEverythingWorker();
            offEverythingClient();
            offEverythingComplainVacation();
            Click tariffAnim = new Click(tariffsAnchor);
            tariffAnim.playAnim();

            try{
                getTariffs();
            }catch (SQLException e){
                e.printStackTrace();
            }

            if(!tariffsTable.visibleProperty().get() && !tariffAdding.visibleProperty().get()
            && !tariffChanging.visibleProperty().get()){
                tariffsTable.setVisible(true);
                tariffChanging.setVisible(true);
                tariffDeleting.setVisible(true);
                tariffAdding.setVisible(true);
            }else{
                offEverythingTariffs();
            }


        });

        tariffAddButton.setOnAction(event -> { //Кнопка ADD TARIFF слева
            Click addB = new Click(tariffAdding);
            addB.playAnim();

            addedText.setVisible(false);
            tariffDeleteAnchor.setVisible(false);
            tariffChangeAnchor.setVisible(false);
            offTariffChangeMenu();

            if (tariffsTable.visibleProperty().get() && !tariffAdder.visibleProperty().get()) {
                tariffsTable.setVisible(false);
                tariffDeleteAnchor.setVisible(false);
//                salaryChangeAnchor.setVisible(false);
                tariffAdder.setVisible(true);
            }else if(!tariffAdder.visibleProperty().get()){
                tariffAdder.setVisible(true);
            }else{
                tariffAdder.setVisible(false);
                tariffsTable.setVisible(true);
            }
        });

        addTariff.setOnAction(event -> {
            Click addT = new Click(addTariff);
            addT.playAnim();

            String name = newTariffName.getText().trim();
            String internet = newTariffInternet.getText().trim();
            String duration = newTariffDuration.getText().trim();
            String calls = newTariffCalls.getText().trim();
            if(isNumeric(newTariffPrice.getText().trim())){
                int price = Integer.parseInt(newTariffPrice.getText().trim());

                if(!name.equals("") && !internet.equals("") && !duration.equals("") &&
                !calls.equals("")){
                    try{
                        addTariff(name, price, internet, duration, calls);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake newTariffN = new Shake(newTariffName);
                    Shake newTariffP = new Shake(newTariffPrice);
                    Shake newTariffI = new Shake(newTariffInternet);
                    Shake newTariffD = new Shake(newTariffDuration);
                    Shake newTariffC = new Shake(newTariffCalls);
                    newTariffN.playAnim();
                    newTariffP.playAnim();
                    newTariffI.playAnim();
                    newTariffD.playAnim();
                    newTariffC.playAnim();
                }

            }else{
                Shake newTariffP = new Shake(newTariffPrice);
                newTariffP.playAnim();
            }

        });

        tariffDeleteButton.setOnAction(event -> {
            Click tariffD = new Click(tariffDeleting);
            tariffD.playAnim();

            addedText.setVisible(false);
            tariffAdder.setVisible(false);
            tariffChangeAnchor.setVisible(false);
            offTariffChangeMenu();

           if(tariffsTable.visibleProperty().get() && !tariffDeleteAnchor.visibleProperty().get()){
               tariffsTable.setVisible(false);
               tariffDeleteAnchor.setVisible(true);
           }else if(!tariffDeleteAnchor.visibleProperty().get()){
               tariffDeleteAnchor.setVisible(true);
           }else{
               tariffsTable.setVisible(true);
               tariffDeleteAnchor.setVisible(false);
           }
        });

        deleteTariffBut.setOnAction(event -> {
            Click delT = new Click(deleteTariffBut);
            delT.playAnim();

            String name = tariffDeleteName.getText().trim();
            if(!name.equals("")) {
                try {
                    deleteTariff(name);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake tariffName = new Shake(tariffDeleteName);
                tariffName.playAnim();
            }

        });

        tariffChangeButton.setOnAction(event -> {
            Click tariffC = new Click(tariffChanging);
            tariffC.playAnim();

            addedText.setVisible(false);
            tariffAdder.setVisible(false);
            tariffDeleteAnchor.setVisible(false);
            offTariffChangeMenu();

            if(tariffsTable.visibleProperty().get() && !tariffChangeAnchor.visibleProperty().get()){
                tariffsTable.setVisible(false);
                tariffChangeAnchor.setVisible(true);
            }else if(!tariffChangeAnchor.visibleProperty().get()){
                tariffChangeAnchor.setVisible(true);
            }else{
                tariffsTable.setVisible(true);
                tariffChangeAnchor.setVisible(false);
            }

        });

        changeTariffName.setOnAction(event -> { // Change name внутри Tariff change
            Click changeT = new Click(changeTariffName);
            changeT.playAnim();

            tariffChangeAnchor.setVisible(false);
            tariffChangeNameAnchor.setVisible(true);
        });

        changeTariffNameButton.setOnAction(event -> {
            Click changeT = new Click(changeTariffNameButton);
            changeT.playAnim();

            String newName = tariffNewName.getText().trim();
            if(isNumeric(tariffChangeNameId.getText().trim())) {
                int id = Integer.parseInt(tariffChangeNameId.getText().trim());
                if (!newName.equals("")) {
                    try {
                        changeTariffName(id, newName);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    Shake nameShake = new Shake(tariffChangeNameId);
                    Shake newNameShake = new Shake(tariffNewName);
                    nameShake.playAnim();
                    newNameShake.playAnim();

                }
            }else{
                Shake nameShake = new Shake(tariffChangeNameId);
                Shake newNameShake = new Shake(tariffNewName);
                nameShake.playAnim();
                newNameShake.playAnim();
            }
        });

        changeTariffPrice.setOnAction(event -> {
            Click changeP = new Click(changeTariffPrice);
            changeP.playAnim();

            tariffChangeAnchor.setVisible(false);
            tariffChangePriceAnchor.setVisible(true);
        });

        changeTariffPriceButton.setOnAction(event -> {
            Click changeP = new Click(changeTariffPriceButton);
            changeP.playAnim();

            String name = tariffChangePriceName.getText().trim();

            if(isNumeric(tariffNewPrice.getText().trim())){
                int price = Integer.parseInt(tariffNewPrice.getText().trim());
                if(!name.equals("")){
                    try{
                        changeTariffPrice(name, price);

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }else{
                    Shake nameShake = new Shake(tariffChangePriceName);
                    Shake newPriceShake = new Shake(tariffNewPrice);
                    nameShake.playAnim();
                    newPriceShake.playAnim();
                }
            }else{
                Shake nameShake = new Shake(tariffChangePriceName);
                Shake newPriceShake = new Shake(tariffNewPrice);
                nameShake.playAnim();
                newPriceShake.playAnim();
            }
        });

        changeTariffInternetVol.setOnAction(event -> {
            Click changeP = new Click(changeTariffInternetVol);
            changeP.playAnim();

            tariffChangeAnchor.setVisible(false);
            tariffChangeInternetAnchor.setVisible(true);
        });

        changeTariffInternetButton.setOnAction(event -> {
            Click changeP = new Click(changeTariffInternetButton);
            changeP.playAnim();

            String name = tariffChangeInternetName.getText().trim();
            String internet = tariffNewInternet.getText().trim();

            if(!name.equals("") && !internet.equals("")){
                try{
                    changeTariffInternet(name, internet);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake nameShake = new Shake(tariffChangeInternetName);
                Shake newPriceShake = new Shake(tariffNewInternet);
                nameShake.playAnim();
                newPriceShake.playAnim();
            }

        });

        changeTariffDuration.setOnAction(event -> {
            Click changeP = new Click(changeTariffDuration);
            changeP.playAnim();

            tariffChangeAnchor.setVisible(false);
            tariffChangeDurationAnchor.setVisible(true);
        });

        changeTariffDurationButton.setOnAction(event -> {
            Click changeP = new Click(changeTariffDurationButton);
            changeP.playAnim();

            String name = tariffChangeDurationName.getText().trim();
            String duration = tariffNewDuration.getText().trim();

            if(!name.equals("") && !duration.equals("")){
                try{
                    changeTariffDuration(name, duration);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake nameShake = new Shake(tariffChangeDurationName);
                Shake newPriceShake = new Shake(tariffNewDuration);
                nameShake.playAnim();
                newPriceShake.playAnim();
            }

        });

        changeTariffCalls.setOnAction(event -> {
            Click changeP = new Click(changeTariffCalls);
            changeP.playAnim();

            tariffChangeAnchor.setVisible(false);
            tariffChangeCallAnchor.setVisible(true);
        });

        changeTariffCallButton.setOnAction(event -> {
            Click changeP = new Click(changeTariffCallButton);
            changeP.playAnim();

            String name = tariffChangeCallName.getText().trim();
            String call = tariffNewCall.getText().trim();

            if(!name.equals("") && !call.equals("")){
                try{
                    changeTariffCall(name, call);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else{
                Shake nameShake = new Shake(tariffChangeCallName);
                Shake newPriceShake = new Shake(tariffNewCall);
                nameShake.playAnim();
                newPriceShake.playAnim();
            }

        });

        complainVacButton.setOnAction(event -> {
            offEverythingClient();
            offTariffChangeMenu();
            offEverythingTariffs();
            offEverythingWorker();

            Click com = new Click(complainVacation);
            com.playAnim();
            idBox.setVisible(true);
            idField.setVisible(true);
            idField.clear();
            idBox.setValue("on review");

            if(!complainTable.visibleProperty().get() && !vacTable.visibleProperty().get()) {
                complainTable.setVisible(true);
                vacTable.setVisible(true);
            }else{
                offEverythingComplainVacation();
            }
            try {
                getVacations();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                getComplains();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        idBox.getItems().addAll("allowed", "disallowed");
        idBox.setValue("on review");
        idBox.setOnAction(event -> {
            DatabaseHandler dbHandler = new DatabaseHandler();
            ResultSet resultSet = dbHandler.getVacations();

            int idvac = 0;
            if (isNumeric(idField.getText().trim())) {
                idvac = Integer.parseInt(idField.getText().trim());
                while (true) {
                    try {
                        if (!resultSet.next()) {
                            break;
                        } else if (resultSet.getInt(Const.VACATION_ID) == idvac) {
                            idvac = resultSet.getInt(Const.VACATION_ID);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            Vacation vacation = new Vacation();
            vacation.setId(idvac);
            vacation.setStatus(idBox.getValue());
            dbHandler.setVacationStatus(vacation);
            try {
                getVacations();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        });

    }

    private void getVacations() throws SQLException {
        ObservableList<Vacation> vacationObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getVacations();

        while (true) {
            try {
                if (!result.next())
                    break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            vacationObservableList.add(new Vacation(result.getInt("idvacation"),
                    result.getString("workerName"),
                    result.getString("workerLastname"),
                    result.getString("beginDate"),
                    result.getString("endDate"),
                    result.getString("status")));

            tableVacId.setCellValueFactory(new PropertyValueFactory<>("id"));
            tableWorkerName.setCellValueFactory(new PropertyValueFactory<>("name"));
            tableWorkerLname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
            tableBeginDate.setCellValueFactory(new PropertyValueFactory<>("beginDate"));
            tableEndDate.setCellValueFactory(new PropertyValueFactory<>("endDate"));
            tableStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

            vacTable.setItems(vacationObservableList);
        }
    }

    private void getComplains() throws SQLException {
        ObservableList<Complain> complainObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getComplains();

        while(true){
            try{
                if(!result.next())
                    break;
            }catch (SQLException e){
                e.printStackTrace();
            }
            complainObservableList.add(new Complain(result.getString(Const.COMPLAIN_REASON),
                    result.getString(Const.COMPLAIN_COMPLAIN),
                    result.getString(Const.COMPLAIN_CLIENTNAME)));
        }
        tableComplainName.setCellValueFactory(new PropertyValueFactory<Complain, String>("clientName"));
        tableComplainComplain.setCellValueFactory(new PropertyValueFactory<Complain, String>("complaint"));
        tableComplainReason.setCellValueFactory(new PropertyValueFactory<Complain, String>("reason"));

        complainTable.setItems(complainObservableList);
    }

    private void getTariffs() throws SQLException {
        ObservableList<Tariff> tariffObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getTariffs();

        while(true){
            try{
                if(!result.next())
                    break;
            }catch (SQLException e){
                e.printStackTrace();
            }
            tariffObservableList.add(new Tariff(result.getInt("idtariffs"),
                    result.getString("name"),
                    result.getInt("price"),
                    result.getString("internet"),
                    result.getString("duration"),
                    result.getString("calls")));
        }
        tableTariffId.setCellValueFactory(new PropertyValueFactory<Tariff, Integer>("id"));
        tableTariffName.setCellValueFactory(new PropertyValueFactory<Tariff, String>("name"));
        tableTariffPrice.setCellValueFactory(new PropertyValueFactory<Tariff, Integer>("price"));
        tableTariffInternet.setCellValueFactory(new PropertyValueFactory<Tariff, String>("internet"));
        tableTariffDuration.setCellValueFactory(new PropertyValueFactory<Tariff, String>("duration"));
        tableTariffCalls.setCellValueFactory(new PropertyValueFactory<Tariff, String>("calls"));

        tariffsTable.setItems(tariffObservableList);
    }

    private void getClients() throws SQLException {
        ObservableList<Client> clientsObservableList = FXCollections.observableArrayList();
        DatabaseHandler databaseHandler = new DatabaseHandler();
        ResultSet result = databaseHandler.getClients();

        while (true) {
            try {
                if (!result.next())
                    break;

            } catch (SQLException e) {
                e.printStackTrace();
            }
            clientsObservableList.add(new Client(result.getString("login"),
                    result.getString("password"),
                    result.getInt("balance")));

        }

        tableLogin.setCellValueFactory(new PropertyValueFactory<Client, String>("login"));
        tablePassword.setCellValueFactory(new PropertyValueFactory<Client, String>("password"));
        tableBalance.setCellValueFactory(new PropertyValueFactory<Client, Integer>("balance"));

        clientsTable.setItems(clientsObservableList);

    }

    private void getWorkers() throws SQLException {
        ObservableList<Worker> workerObservableList = FXCollections.observableArrayList();
        DatabaseHandler dbHandler = new DatabaseHandler();
        ResultSet result = dbHandler.getWorkers();

        while (true) {
            try {
                if (!result.next()) {
                    break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            workerObservableList.add(new Worker(result.getString("name"),
                    result.getString("lastname"),
                    result.getString("login"),
                    result.getString("password"),
                    result.getInt("salary")));
        }

        tableName.setCellValueFactory(new PropertyValueFactory<Worker, String>("name"));
        tableLastname.setCellValueFactory(new PropertyValueFactory<Worker, String>("lastname"));
        tableLogin1.setCellValueFactory(new PropertyValueFactory<Worker, String>("login"));
        tablePassword1.setCellValueFactory(new PropertyValueFactory<Worker, String>("password"));
        tableSalary.setCellValueFactory(new PropertyValueFactory<Worker, Integer>("salary"));

        workersTable.setItems(workerObservableList);

    }

    private void changeTariffCall(String name, String call) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff();
        tariff.setName(name);
        tariff.setCalls(call);

        dbHandler.changeTariffCall(tariff);
        getTariffs();
        tariffChangeCallAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        tariffChangeCallName.clear();
        tariffNewCall.clear();
    }

    private void changeTariffDuration(String name, String duration) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff();
        tariff.setName(name);
        tariff.setDuration(duration);

        dbHandler.changeTariffDuration(tariff);
        getTariffs();
        tariffChangeDurationAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        tariffChangeDurationName.clear();
        tariffNewDuration.clear();
    }

    private void changeTariffInternet(String name, String newInternet) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff();
        tariff.setName(name);
        tariff.setInternet(newInternet);

        dbHandler.changeTariffInternet(tariff);
        getTariffs();
        tariffChangeInternetAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        tariffChangeInternetName.clear();
        tariffNewInternet.clear();
    }

    private void changeTariffPrice(String name, int newPrice) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff();
        tariff.setName(name);
        tariff.setPrice(newPrice);

        dbHandler.changeTariffPrice(tariff);
        getTariffs();
        tariffChangePriceAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        tariffChangePriceName.clear();
        tariffNewPrice.clear();
    }

    private void changeTariffName(int id, String newName) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff();
        tariff.setId(id);

        dbHandler.changeTariffName(tariff, newName);
        getTariffs();
        tariffChangeNameAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        tariffChangeNameId.clear();
        tariffNewName.clear();
    }

    private void changeSalary(String login, int salary) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Worker worker = new Worker(login, salary);

        dbHandler.changeWorkerSalary(worker);
        getWorkers();
        salaryChangeAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        salaryWorkerLog.clear();
        salaryNew.clear();
    }

    private void changeBalance(String login, int balance) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();

        Client client = new Client(login, balance);

        dbHandler.changeClientBalance(client);
        getClients();
        changeBalanceAnchor.setVisible(false);
        addedText.setText("Successfully changed!");
        addedText.setVisible(true);
        balanceClientLog.clear();
        balanceNew.clear();
    }

    private void deleteTariff(String name) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff(name);

        dbHandler.delTariff(tariff);
        getTariffs();
        tariffDeleteAnchor.setVisible(false);
        addedText.setText("Successfully deleted!");
        addedText.setVisible(true);
        tariffDeleteName.clear();


    }

    private void deleteWorker(String login, String password) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Worker worker = new Worker(login, password);

        dbHandler.delWorker(worker);
        getWorkers();
        workerDeleteAnchor.setVisible(false);
        addedText.setText("Successfully deleted!");
        addedText.setVisible(true);
        deleteWorkerLog.clear();
        deleteWorkerPass.clear();


    }

    private void deleteClient(String login, String password) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();

        Client client = new Client(login, password);

        dbHandler.delClient(client);
        getClients();
        clientDeleteAnchor.setVisible(false);
        addedText.setText("Successfully deleted!");
        addedText.setVisible(true);
        deleteClientLog.clear();
        deleteClientPass.clear();

    }

    private void addTariff(String name, int price, String internet, String duration, String calls) throws SQLException {
        DatabaseHandler dbHandler = new DatabaseHandler();
        Tariff tariff = new Tariff(name, price, internet, duration, calls);

        dbHandler.addTariff(tariff);
        getTariffs();
        tariffAdder.setVisible(false);
        addedText.setVisible(true);
        newTariffName.clear();
        newTariffPrice.clear();
        newTariffInternet.clear();
        newTariffDuration.clear();
        newTariffCalls.clear();
    }

    private void signUpNewClient(String login, String password, String checkpass, String name, String number) throws SQLException {
        DatabaseHandler dbhandler = new DatabaseHandler();
        Client client = new Client(login, password);
        client.setNumber(number);
        client.setName(name);

        if (password.equals(checkpass)) {
            dbhandler.signUpClient(client);
            clientRegister.setVisible(false);
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

    private void signUpNewWorker(String name, String lastname, String login, String password, String checkpass, int salary) throws SQLException {
        DatabaseHandler dbhandler = new DatabaseHandler();

        Worker worker = new Worker(name, lastname, login, password, salary);

        if (password.equals(checkpass)) {
            dbhandler.signUpWorker(worker);
            workerRegister.setVisible(false);
            addedText.setVisible(true);
            newWorkerLog.clear();
            newWorkerPass.clear();
            newWorkerPass2.clear();
            newWorkerSalary.clear();
            newWorkerName.clear();
            newWorkerLastname.clear();
        } else {
            Shake workerPassAnim = new Shake(newWorkerPass);
            Shake workerPassAnim2 = new Shake(newWorkerPass2);
            workerPassAnim.playAnim();
            workerPassAnim2.playAnim();
        }

        getWorkers();

    }

    public static boolean isNumeric(String string) { // Проверка число ли
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

    private void offEverythingClient(){
        clientsTable.setVisible(false);
        clientAdding.setVisible(false);
        clientDeleting.setVisible(false);
        balanceChanging.setVisible(false);
        clientRegister.setVisible(false);
        addedText.setVisible(false);
        clientDeleteAnchor.setVisible(false);
        changeBalanceAnchor.setVisible(false);

    }
    private void offEverythingWorker(){
        workersTable.setVisible(false);
        workerDeleting.setVisible(false);
        workerAdding.setVisible(false);
        salaryChanging.setVisible(false);
        workerRegister.setVisible(false);
        addedText.setVisible(false);
        workerDeleteAnchor.setVisible(false);
        salaryChangeAnchor.setVisible(false);
    }
    private void offEverythingTariffs(){
        tariffsTable.setVisible(false);
        tariffAdder.setVisible(false);
        tariffAdding.setVisible(false);
        addedText.setVisible(false);
        tariffDeleting.setVisible(false);
        tariffChanging.setVisible(false);
        tariffDeleteAnchor.setVisible(false);
        tariffChangeAnchor.setVisible(false);
        tariffChangeNameAnchor.setVisible(false);
        tariffChangePriceAnchor.setVisible(false);
        tariffChangeInternetAnchor.setVisible(false);
        tariffChangeDurationAnchor.setVisible(false);
        tariffChangeCallAnchor.setVisible(false);
    }
    private void offTariffChangeMenu(){
        tariffChangeNameAnchor.setVisible(false);
        tariffChangePriceAnchor.setVisible(false);
        tariffChangeInternetAnchor.setVisible(false);
        tariffChangeDurationAnchor.setVisible(false);
        tariffChangeCallAnchor.setVisible(false);
    }

    private void offEverythingComplainVacation(){
        complainTable.setVisible(false);
        vacTable.setVisible(false);
        idBox.setVisible(false);
        idField.setVisible(false);
    }
}
