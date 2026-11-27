package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class SchedulePhysicalFitnessTestPFTController
{
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private TableColumn<SchedulePhysicalFitnessTestPFTController,String> cadetIdColumn;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableView<SchedulePhysicalFitnessTestPFTController> cadetTable;
    @javafx.fxml.FXML
    private TableColumn<SchedulePhysicalFitnessTestPFTController,String>  platoonColumn;
    @javafx.fxml.FXML
    private TableColumn<SchedulePhysicalFitnessTestPFTController,String>  cadetNameColumn;
    @javafx.fxml.FXML
    private DatePicker pftDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn<SchedulePhysicalFitnessTestPFTController,String>  companyColumn;
    @javafx.fxml.FXML
    private TextArea instructionsArea;
    @javafx.fxml.FXML
    private TableColumn<SchedulePhysicalFitnessTestPFTController,String>  selectColumn;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3", "Platoon 4");
        cadetIdColumn.setCellValueFactory(new PropertyValueFactory<>(" cadetId"));
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("companyColumn"));
        platoonColumn.setCellValueFactory(new PropertyValueFactory<>(" platoon"));



    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSchedule(ActionEvent actionEvent) {
    }
}