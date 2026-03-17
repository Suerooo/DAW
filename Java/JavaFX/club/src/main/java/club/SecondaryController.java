package club;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private Button secondaryButtonBack;
    @FXML
    private TextField Nombre;
    @FXML
    private TextField Localidad;
    @FXML
    private Button secondaryButtonEnviar;

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void saveClub() throws IOException {
        App.addClub(new Clubs(Nombre.getText(), Localidad.getText()));
        System.out.println(App.getClubs());
        Nombre.clear();
        Localidad.clear();
    }
}