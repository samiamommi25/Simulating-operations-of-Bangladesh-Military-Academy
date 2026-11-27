package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class SpecialPhysicalTrainingController
{
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn<SpecialPhysicalTraining, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField durationTextField;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TableView <SpecialPhysicalTraining>scheduleTableView;
    @javafx.fxml.FXML
    private DatePicker trainingDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn <SpecialPhysicalTraining, LocalDate>companyCol;
    @javafx.fxml.FXML
    private ComboBox<String> exerciseTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn <SpecialPhysicalTraining, LocalDate>durationCol;
    @javafx.fxml.FXML
    private TableColumn<SpecialPhysicalTraining, LocalDate> exerciseCol;
    @javafx.fxml.FXML
    private TableColumn<SpecialPhysicalTraining, LocalDate> platoonCol;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3", "Platoon 4");
        exerciseTypeComboBox.getItems().addAll("Endurance Run", "Obstacle Course", "Strength Training", "Swimming");
        companyCol.setCellValueFactory(new PropertyValueFactory<>("company"));
        platoonCol.setCellValueFactory(new PropertyValueFactory<>("platoon"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("trainingDate"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
    }

    @javafx.fxml.FXML
    public void onActionUpdateRoutine(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSelectPlatoon(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onActionBackToDashboard(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSelectCompany(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSelectTrainingDate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSelectExerciseType(ActionEvent actionEvent) {
    }
}