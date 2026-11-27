package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AssignRemedialFitnessProgramtoWeakCadetsContoller
{
    @javafx.fxml.FXML
    private TextField durationWeeksField;
    @javafx.fxml.FXML
    private TableView <AssignRemedialFitnessProgramtoWeakCadets>weakCadetsTableView;
    @javafx.fxml.FXML
    private ComboBox<String> remedialRoutineComboBox;
    @javafx.fxml.FXML
    private TextField workloadLimitField;
    @javafx.fxml.FXML
    private Label statusMessageLabel;
    @javafx.fxml.FXML
    private TextField passingThresholdField;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> frequencyComboBox;
    @javafx.fxml.FXML
    private TextArea fitnessAnalysisTextArea;
    @javafx.fxml.FXML
    private TableColumn<AssignRemedialFitnessProgramtoWeakCadets, String> cadetNameCol;
    @javafx.fxml.FXML
    private TextField selectedCadetIdField;
    @javafx.fxml.FXML
    private TableColumn <AssignRemedialFitnessProgramtoWeakCadets, String>pftScoreCol;
    @javafx.fxml.FXML
    private TableColumn<AssignRemedialFitnessProgramtoWeakCadets, String> weaknessCol;
    @javafx.fxml.FXML
    private TableColumn<AssignRemedialFitnessProgramtoWeakCadets, String> cadetIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        cadetIdCol.setCellValueFactory(new PropertyValueFactory<>("cadetId"));
        cadetNameCol.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        pftScoreCol.setCellValueFactory(new PropertyValueFactory<>(" pftScore"));


    }

    @javafx.fxml.FXML
    public void handleIdentifyLowScorers(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSelectWeakCadet(Event event) {
    }

    @javafx.fxml.FXML
    public void handleClearFields(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAssignProgram(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackOnAction(ActionEvent actionEvent) {
    }
}