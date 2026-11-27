package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class GeneratePhysicalFitnessPerformanceReportController
{
    @javafx.fxml.FXML
    private Label passRateLabel;
    @javafx.fxml.FXML
    private TableView<GeneratePhysicalFitnessPerformanceReport> performanceTable;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<GeneratePhysicalFitnessPerformanceReport, String> performanceColumn;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn<GeneratePhysicalFitnessPerformanceReport, String> platoonColumn;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<GeneratePhysicalFitnessPerformanceReport, String> cadetNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn <GeneratePhysicalFitnessPerformanceReport, String>companyColumn;
    @javafx.fxml.FXML
    private Label totalCadetsLabel;
    @javafx.fxml.FXML
    private TableColumn<GeneratePhysicalFitnessPerformanceReport, String> serialColumn;
    @javafx.fxml.FXML
    private TableColumn <GeneratePhysicalFitnessPerformanceReport, String>fitnessScoreColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label averageScoreLabel;
    @javafx.fxml.FXML
    private TableColumn<GeneratePhysicalFitnessPerformanceReport, String> cadetIdColumn;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private Label highestScoreLabel;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha Company", "Bravo Company", "Charlie Company", "Delta Company");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3");
        cadetIdColumn.setCellValueFactory(new PropertyValueFactory<>("cadetId"));
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>(" cadetName"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        platoonColumn.setCellValueFactory(new PropertyValueFactory<>("platoon"));
        performanceColumn.setCellValueFactory(new PropertyValueFactory<>("  performance"));
    }


    @javafx.fxml.FXML
    public void handleExportReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCompanyChange(ActionEvent actionEvent) {
    }
}