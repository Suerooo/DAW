/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package club;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author 49399328C
 */
public class ThirdController {

    @FXML
    private Button ThirdButtonBack;

    @FXML
    private ListView<String> listaClubs;

    @FXML
    public void initialize() {
        listaClubs.getItems().addAll(App.getClubs());
    }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("primary");
    }

}
