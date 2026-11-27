package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewCadetInformationController
{
    @javafx.fxml.FXML
    private TextField cadetIdField;
    @javafx.fxml.FXML
    private Label profileNameLabel;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> recordNameColumn;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> academicColumn;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> fitnessColumn;
    @javafx.fxml.FXML
    private TableColumn <ViewCadetInformation, String>recordIdColumn;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> attendanceColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn <ViewCadetInformation, String>recordPlatoonColumn;
    @javafx.fxml.FXML
    private TableColumn <ViewCadetInformation, String>serialColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn <ViewCadetInformation, String>recordCompanyColumn;
    @javafx.fxml.FXML
    private Label profileIdLabel;
    @javafx.fxml.FXML
    private Label profileContactLabel;
    @javafx.fxml.FXML
    private Label profileAgeLabel;
    @javafx.fxml.FXML
    private Label profilePlatoonLabel;
    @javafx.fxml.FXML
    private Label profileCompanyLabel;
    @javafx.fxml.FXML
    private TableView <ViewCadetInformation>cadetRecordsTable;

    @javafx.fxml.FXML
    public void initialize() {
        serialColumn.setCellValueFactory(new PropertyValueFactory<>("serial"));
        recordIdColumn.setCellValueFactory(new PropertyValueFactory<>("recordIdColumn"));
        recordNameColumn.setCellValueFactory(new PropertyValueFactory<>("recordNameColumn"));
        recordCompanyColumn.setCellValueFactory(new PropertyValueFactory<>("recordCompanyColumn"));
        recordPlatoonColumn.setCellValueFactory(new PropertyValueFactory<>("recordPlatoonColumn"));
        fitnessColumn.setCellValueFactory(new PropertyValueFactory<>("fitnessColumn"));
        academicColumn.setCellValueFactory(new PropertyValueFactory<>("academicColumn"));
        attendanceColumn.setCellValueFactory(new PropertyValueFactory<>("attendanceColumn"));



    }

    @javafx.fxml.FXML
    public void handleSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCompanyChange(ActionEvent actionEvent) {
    }
}