package club.controller;

import java.io.IOException;

import club.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveController {
    @FXML
    private Button removeButtonBack;

    @FXML
    private Label removeLabel;

    @FXML
    private TextField removeTituloField;

    @FXML
    private Button removeButton;

    @FXML
    private void removeClub() throws IOException {
        Alert informacion = new Alert(AlertType.INFORMATION);
        informacion.setTitle("Informacion");
        informacion.setHeaderText(null);

        Alert error = new Alert(AlertType.ERROR);
        error.setTitle("Error");
        error.setHeaderText(null);

        try {
            App.removeClub(removeTituloField.getText());

            removeTituloField.clear();

            informacion.setContentText("Pelicula eliminada!!");
            informacion.showAndWait();

        } catch (NumberFormatException e) {
            error.setHeaderText("Uno o varios campos no tiene el formato correcto");
            error.setContentText("Titulo(numero, letras, signos) | Año(numero entero) | Duracion(numero decimal)");
            error.showAndWait();

        } catch (IllegalAccessError e) {
            error.setContentText(e.toString());
            error.showAndWait();
        }
    }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("main");
    }

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been
        // completely loaded.
    }
}