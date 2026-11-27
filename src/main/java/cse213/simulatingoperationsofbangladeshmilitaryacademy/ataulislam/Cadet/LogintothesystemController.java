package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Cadet;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogintothesystemController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private CheckBox showPasswordCheckBox;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        passwordTextField.setVisible(false);
        passwordTextField.setManaged(false);
        passwordField.setVisible(true);
        passwordField.setManaged(true);
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {

        usernameField.clear();
        passwordField.clear();
        passwordTextField.clear();
        showPasswordCheckBox.setSelected(false);
        messageLabel.setText("Fields cleared.");
    }

    @javafx.fxml.FXML
    public void handleShowPassword(ActionEvent actionEvent) {
        if (showPasswordCheckBox.isSelected()) {
            passwordTextField.setVisible(true);
            passwordTextField.setManaged(true);
            passwordField.setVisible(false);
            passwordField.setManaged(false);
        } else {
            passwordField.setVisible(true);
            passwordField.setManaged(true);
            passwordTextField.setVisible(false);
            passwordTextField.setManaged(false);
        }
    }

    @javafx.fxml.FXML
    public void handleLogin(ActionEvent actionEvent) {
    }
}