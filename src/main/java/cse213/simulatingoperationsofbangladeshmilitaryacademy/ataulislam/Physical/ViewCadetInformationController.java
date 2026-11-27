package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewCadetInformationController
{
    @javafx.fxml.FXML
    private TextField cadetIdField;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> rankColumn;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> nameColumn;
    @javafx.fxml.FXML
    private TableView <ViewCadetInformation>cadetTable;
    @javafx.fxml.FXML
    private TableColumn <ViewCadetInformation, String>platoonColumn;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> statusColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> companyColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<ViewCadetInformation, String> idColumn;

    @javafx.fxml.FXML
    public void initialize() {
        companyComboBox.getItems().addAll("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");
        platoonComboBox.getItems().addAll("Platoon 1", "Platoon 2", "Platoon 3", "Platoon 4");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("idColumn"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        platoonColumn.setCellValueFactory(new PropertyValueFactory<>("platoon"));
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void handleSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }
}