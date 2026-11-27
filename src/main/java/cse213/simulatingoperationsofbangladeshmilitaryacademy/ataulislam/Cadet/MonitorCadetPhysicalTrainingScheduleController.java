package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorCadetPhysicalTrainingScheduleController
{
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>timeColumn;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>ptiColumn;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>scheduleIdColumn;
    @javafx.fxml.FXML
    private ComboBox <String>platoonComboBox;
    @javafx.fxml.FXML
    private DatePicker trainingDatePicker;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>confirmationColumn;
    @javafx.fxml.FXML
    private ComboBox <String>companyComboBox;
    @javafx.fxml.FXML
    private TableView <MonitorCadetPhysicalTrainingSchedule> scheduleTable;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>venueColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>durationColumn;
    @javafx.fxml.FXML
    private TableColumn <MonitorCadetPhysicalTrainingSchedule, String>activityColumn;

    @javafx.fxml.FXML
    public void initialize() {
        scheduleIdColumn.setCellValueFactory(new PropertyValueFactory<>("scheduleId"));
        activityColumn.setCellValueFactory(new PropertyValueFactory<>("activity"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        venueColumn.setCellValueFactory(new PropertyValueFactory<>(" venue"));
        ptiColumn.setCellValueFactory(new PropertyValueFactory<>("pti"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));
        confirmationColumn.setCellValueFactory(new PropertyValueFactory<>("confirmation"));


    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleConfirmSchedule(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewSchedule(ActionEvent actionEvent) {
    }
}