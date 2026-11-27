package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PhysicalRecordCadetFitnessTestResultsController
{
    @javafx.fxml.FXML
    private Label selectedCompanyLabel;
    @javafx.fxml.FXML
    private TextField sitUpField;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TextField pushUpField;
    @javafx.fxml.FXML
    private Label selectedCadetIdLabel;
    @javafx.fxml.FXML
    private TextField runningDistanceField;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> cadetIdComboBox;
    @javafx.fxml.FXML
    private Label selectedPlatoonLabel;
    @javafx.fxml.FXML
    private Label cadetNameLabel;
    @javafx.fxml.FXML
    private TextField runningTimeField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3", "Platoon 4");
        cadetIdComboBox.getItems().addAll("C-101", "C-102", "C-103", "C-104");


    }

    @javafx.fxml.FXML
    public void saveTestResults(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadCadetInformation(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearFields(ActionEvent actionEvent) {
    }
}