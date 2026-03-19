/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package club.controller;

import java.io.IOException;

import club.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author 49399328C
 */
public class ListController {
    @FXML
    private Button listButtonBack;

    @FXML
    private Label listLabel;

    @FXML
    private Label listaClubs;

    @FXML
    public void initialize() {
        listaClubs.setText(App.getClubs());
    }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("main");
    }

}
