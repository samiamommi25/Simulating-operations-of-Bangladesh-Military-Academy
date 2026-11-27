package cse213.simulatingoperationsofbangladeshmilitaryacademy.ataulislam.Physical;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginthesystemController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        usernameField.setPromptText("Enter your username");
        passwordField.setPromptText("Enter your password");

    }

    @javafx.fxml.FXML
    public void handleLogin(ActionEvent actionEvent) {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();




    }
}