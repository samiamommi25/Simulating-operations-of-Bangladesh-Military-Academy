package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManagePTIAndDirectingStaffAssignmentsController
{
    @javafx.fxml.FXML
    private TableColumn<ManagePTIAndDirectingStaffAssignments,String> staffIdColumn;
    @javafx.fxml.FXML
    private TextField workloadField;
    @javafx.fxml.FXML
    private TableColumn<ManagePTIAndDirectingStaffAssignments, String> responsibilityColumn;
    @javafx.fxml.FXML
    private Label staffRoleLabel;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private ComboBox <String>activityComboBox;
    @javafx.fxml.FXML
    private TableColumn <ManagePTIAndDirectingStaffAssignments, String>workloadColumn;
    @javafx.fxml.FXML
    private ComboBox<String> staffTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> responsibilityComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn <ManagePTIAndDirectingStaffAssignments, String>activityColumn;
    @javafx.fxml.FXML
    private TableColumn<ManagePTIAndDirectingStaffAssignments, String> staffTableNameColumn;
    @javafx.fxml.FXML
    private TableColumn<ManagePTIAndDirectingStaffAssignments, String> unitColumn;
    @javafx.fxml.FXML
    private Label staffNameLabel;
    @javafx.fxml.FXML
    private TableView<ManagePTIAndDirectingStaffAssignments> assignmentTable;
    @javafx.fxml.FXML
    private ComboBox <String>staffComboBox;
    @javafx.fxml.FXML
    private TableColumn<ManagePTIAndDirectingStaffAssignments, String> staffTableRoleColumn;
    @javafx.fxml.FXML
    private Label staffUnitLabel;

    @javafx.fxml.FXML
    public void initialize() {
        staffIdColumn.setCellValueFactory(new PropertyValueFactory<>("staffId"));
        staffTableNameColumn.setCellValueFactory(new PropertyValueFactory<>("staffTableName"));
        staffTableRoleColumn.setCellValueFactory(new PropertyValueFactory<>("staffTableRole"));
        unitColumn.setCellValueFactory(new PropertyValueFactory<>("staffTableRole"));
        responsibilityColumn.setCellValueFactory(new PropertyValueFactory<>("responsibility"));
        activityColumn.setCellValueFactory(new PropertyValueFactory<>("activity"));
        workloadColumn.setCellValueFactory(new PropertyValueFactory<>("workload"));





    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAssignStaff(ActionEvent actionEvent) {
    }
}