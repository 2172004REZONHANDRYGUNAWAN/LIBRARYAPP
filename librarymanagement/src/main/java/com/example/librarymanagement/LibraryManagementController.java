package com.example.librarymanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LibraryManagementController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}