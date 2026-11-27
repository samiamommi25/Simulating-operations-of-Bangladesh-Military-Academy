package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReviewCadetTrainingAttendanceAndDisciplineController
{
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> disciplineDateColumn;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> disciplineCadetIdColumn;
    @javafx.fxml.FXML
    private ComboBox<String> platoonComboBox;
    @javafx.fxml.FXML
    private TableColumn <ReviewCadetTrainingAttendanceAndDiscipline, String>platoonColumn;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> cadetNameColumn;
    @javafx.fxml.FXML
    private TableView<ReviewCadetTrainingAttendanceAndDiscipline> disciplineTable;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> disciplineCadetNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> companyComboBox;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> companyColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<ReviewCadetTrainingAttendanceAndDiscipline> attendanceTable;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> attendanceStatusColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewCadetTrainingAttendanceAndDiscipline, String>disciplineTypeColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewCadetTrainingAttendanceAndDiscipline, String>disciplineRemarksColumn;
    @javafx.fxml.FXML
    private DatePicker reportingDatePicker;
    @javafx.fxml.FXML
    private TableColumn<ReviewCadetTrainingAttendanceAndDiscipline, String> attendanceIdColumn;

    @javafx.fxml.FXML
    public void initialize() {
        cadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("cadetName"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        platoonColumn.setCellValueFactory(new PropertyValueFactory<>("platoon"));
        attendanceStatusColumn.setCellValueFactory(new PropertyValueFactory<>("attendanceStatus"));
        disciplineCadetIdColumn.setCellValueFactory(new PropertyValueFactory<>("disciplineCadetId"));
        disciplineCadetNameColumn.setCellValueFactory(new PropertyValueFactory<>("disciplineCadetName"));
        disciplineTypeColumn.setCellValueFactory(new PropertyValueFactory<>("disciplineType"));
        disciplineDateColumn.setCellValueFactory(new PropertyValueFactory<>("disciplineDate"));
        disciplineRemarksColumn.setCellValueFactory(new PropertyValueFactory<>("disciplineRemarks"));


    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewAttendance(ActionEvent actionEvent) {
    }
}