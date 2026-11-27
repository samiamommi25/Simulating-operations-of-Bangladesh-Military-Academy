package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ApproveRemedialFitnessProgramController
{
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> scheduleActivityColumn;
    @javafx.fxml.FXML
    private Label scheduleStatusLabel;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> scheduleVenueColumn;
    @javafx.fxml.FXML
    private TableView<ApproveRemedialFitnessProgram> cadetTable;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> fitnessStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> cadetNameColumn;
    @javafx.fxml.FXML
    private Label workloadStatusLabel;
    @javafx.fxml.FXML
    private TableView<ApproveRemedialFitnessProgram> scheduleTable;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> fitnessIssueColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> fitnessScoreColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> exerciseWorkloadColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField submittedByField;
    @javafx.fxml.FXML
    private TextField proposalDateField;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> cadetIdColumn;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> exerciseFrequencyColumn;
    @javafx.fxml.FXML
    private Label proposalDescriptionLabel;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> exerciseDurationColumn;
    @javafx.fxml.FXML
    private ComboBox<String> proposalComboBox;
    @javafx.fxml.FXML
    private TableColumn<ApproveRemedialFitnessProgram, String> exerciseNameColumn;
    @javafx.fxml.FXML
    private TableColumn <ApproveRemedialFitnessProgram, String>scheduleTimeColumn;
    @javafx.fxml.FXML
    private TableView<ApproveRemedialFitnessProgram> exerciseTable;
    @javafx.fxml.FXML
    private TableColumn <ApproveRemedialFitnessProgram, String>scheduleDayColumn;

    @javafx.fxml.FXML
    public void initialize() {
        cadetIdColumn.setCellValueFactory(new PropertyValueFactory<>("cadetId"));
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        fitnessScoreColumn.setCellValueFactory(new PropertyValueFactory<>("fitnessScore"));
        exerciseNameColumn.setCellValueFactory(new PropertyValueFactory<>("exerciseName"));








    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReviewProposal(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReject(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApprove(ActionEvent actionEvent) {
    }
}