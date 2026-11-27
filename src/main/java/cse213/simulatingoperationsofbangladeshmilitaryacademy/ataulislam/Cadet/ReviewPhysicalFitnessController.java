package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReviewPhysicalFitnessController
{
    @javafx.fxml.FXML
    private Label passRateLabel;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private ComboBox <String>platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> platoonColumn;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> scoreColumn;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> cadetNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private Label approvalLabel;
    @javafx.fxml.FXML
    private TableColumn <ReviewPhysicalFitness, String>companyColumn;
    @javafx.fxml.FXML
    private TableView<ReviewPhysicalFitness> pftTable;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> serialColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label averageScoreLabel;
    @javafx.fxml.FXML
    private TableColumn <ReviewPhysicalFitness, String>cadetIdColumn;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> statusColumn;
    @javafx.fxml.FXML
    private ComboBox <String>reportTypeComboBox;
    @javafx.fxml.FXML
    private Label highestScoreLabel;
    @javafx.fxml.FXML
    private TableColumn<ReviewPhysicalFitness, String> dateColumn;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Monthly PFT Report", "Term-End Evaluation", "Remedial Fitness Assessment");
        companyComboBox.getItems().addAll("Alpha Company", "Bravo Company", "Charlie Company", "Delta Company");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3");
        serialColumn.setCellValueFactory(new PropertyValueFactory<>("serial"));
        cadetIdColumn.setCellValueFactory(new PropertyValueFactory<>("cadetId"));
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("cadet"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));


    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewResults(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApprove(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCompanyChange(ActionEvent actionEvent) {
    }
}