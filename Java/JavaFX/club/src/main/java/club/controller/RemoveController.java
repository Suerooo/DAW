package club.controller;

import java.io.IOException;

import club.App;
import club.model.Pelicula;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemoveController {
    @FXML
    private Button removeButtonBack;

    @FXML
    private Label removeLabel;

    @FXML
    private Label removeErrorLabel;

    @FXML
    private TextField removeTituloField;

    @FXML
    private Button removeButton;

    @FXML
    private void removeClub() throws IOException {
        try {
            removeErrorLabel.setText("");

            App.removeClub(new Pelicula(removeTituloField.getText(), 1990, 20));

            removeErrorLabel.setText("Pelicula eliminada");

            removeTituloField.clear();

        } catch (NumberFormatException e) {
            removeErrorLabel.setText(
                    "Uno o varios campos no tiene el formato correcto \n Titulo(numero, letras, signos) | Año(numero entero) | Duracion(numero decimal)");

        } catch (IllegalAccessError e) {
            removeErrorLabel.setText(e.toString());
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