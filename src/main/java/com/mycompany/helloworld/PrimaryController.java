package com.mycompany.helloworld;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private void handleShowMessageButton() {
        System.out.println("Button was pressed...");
        labelmessage.setText("Button was pressed!!!");
    }

    @FXML
    private Label labelmessage;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

    }
}
