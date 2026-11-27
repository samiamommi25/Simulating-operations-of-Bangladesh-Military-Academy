package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class GenerateOverallCadetPerformanceReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TextArea reportTextArea;
    @javafx.fxml.FXML
    private ComboBox <String>platoonComboBox;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox <String>companyComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha Company", "Bravo Company", "Charlie Company", "Delta Company");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3");
        reportTextArea.setEditable(false);
        reportTextArea.setPromptText("Select report category, company, platoon and date range to generate report...");
        statusLabel.setText("Ready to generate report.");
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }
}