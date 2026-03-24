package club.controller;

import java.io.IOException;

import club.App;
import club.model.Pelicula;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AddController {
    @FXML
    private Button addButtonBack;

    @FXML
    private Label addLabel;

    @FXML
    private TextField addTituloField;

    @FXML
    private TextField addAnioField;

    @FXML
    private TextField addDuracionField;

    @FXML
    private Button addButtonEnviar;

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("main");
    }

    @FXML
    private void saveClub() throws IOException {
        Alert informacion = new Alert(AlertType.INFORMATION);
        informacion.setTitle("Informacion");
        informacion.setHeaderText(null);

        Alert error = new Alert(AlertType.ERROR);
        error.setTitle("Error");
        error.setHeaderText(null);

        try {
            App.addClub(new Pelicula(addTituloField.getText(), Integer.parseInt(addAnioField.getText()),
                    Double.parseDouble(addDuracionField.getText())));

            addTituloField.clear();
            addAnioField.clear();
            addDuracionField.clear();

            informacion.setContentText("Tarea creada!!");
            informacion.showAndWait();

        } catch (NumberFormatException e) {
            error.setHeaderText("Uno o varios campos no tiene el formato correcto");
            error.setContentText("Titulo(numero, letras, signos) | Año(numero entero) | Duracion(numero decimal)");
            error.showAndWait();

        } catch (IllegalArgumentException | IllegalAccessError e) {
            error.setContentText(e.toString());
            error.showAndWait();
        }
    }

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been
        // completely loaded.
    }
}