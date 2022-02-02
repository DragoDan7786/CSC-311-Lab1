package com.mycompany.helloworld;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textFieldMessage;

    @FXML
    private void handleShowMessageButton() {
        System.out.println("Button was pressed...");
        String message = textFieldMessage.getText();
        //gets text from text field
        labelmessage.setText(message);
    }

    @FXML
    private Label labelmessage;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

    }
}
