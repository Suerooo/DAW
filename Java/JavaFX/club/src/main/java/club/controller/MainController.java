package club.controller;

import java.io.IOException;

import club.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label mainLabelClub;

    @FXML
    private Button mainAddButton;

    @FXML
    private Button mainRemoveButton;

    @FXML
    private Button mainListButton;

    @FXML
    private Button mainExitButton;

    @FXML
    private void switchToAdd() throws IOException {
        App.setRoot("add");
    }

    @FXML
    private void switchToList() throws IOException {
        App.setRoot("list");
    }

    @FXML
    private void switchToRemove() throws IOException {
        App.setRoot("remove");
    }

    @FXML
    private void exit() throws IOException {
        App.guardarDatos();
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been
        // completely loaded.
    }
}
