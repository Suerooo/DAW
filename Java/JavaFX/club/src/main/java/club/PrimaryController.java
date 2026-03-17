package club;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button primaryAddButton;
    @FXML
    private Button primaryListButton;
    @FXML
    private Button primaryExitButton;

    @FXML
    private void switchToAdd() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToList() throws IOException {
        App.setRoot("third");
    }

    @FXML
    private void exit() throws IOException {
        Platform.exit();
        System.exit(0);
    }

    
}
