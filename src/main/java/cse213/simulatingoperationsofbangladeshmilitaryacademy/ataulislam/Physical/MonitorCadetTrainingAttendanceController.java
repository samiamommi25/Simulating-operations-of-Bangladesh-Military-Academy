package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorCadetTrainingAttendanceController
{
    @javafx.fxml.FXML
    private Label presentLabel;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetTrainingAttendance, String>platoonColumn;
    @javafx.fxml.FXML
    private ComboBox<String> trainingTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<MonitorCadetTrainingAttendance, String> cadetNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetTrainingAttendance, String>companyColumn;
    @javafx.fxml.FXML
    private Label totalCadetsLabel;
    @javafx.fxml.FXML
    private Label absentLabel;
    @javafx.fxml.FXML
    private TableView<MonitorCadetTrainingAttendance> attendanceTable;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetTrainingAttendance, String>serialColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetTrainingAttendance, String>cadetIdColumn;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetTrainingAttendance, String>statusColumn;
    @javafx.fxml.FXML
    private DatePicker trainingDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha Company", "Bravo Company", "Charlie Company", "Delta Company");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3");
        trainingTypeComboBox.getItems().addAll(
                "Morning PT & 3.2 km Run",
                "Obstacle Course Training",
                "Swimming & Water Confidence",
                "Unarmed Combat & Conditioning"

        );
        serialColumn.setCellValueFactory(new PropertyValueFactory<>("serial"));
        cadetIdColumn.setCellValueFactory(new PropertyValueFactory<>("cadetId "));
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        platoonColumn.setCellValueFactory(new PropertyValueFactory<>("platoon"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>(" status"));


    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkAllAbsent(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveAttendance(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkAllPresent(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCompanyChange(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLoadCadets(ActionEvent actionEvent) {
    }
}