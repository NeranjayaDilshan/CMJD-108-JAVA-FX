package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void btnCustomerOnAction(ActionEvent event) {
        System.out.println("Customer Button clicked");
    }

    @FXML
    void btnItemOnAction(ActionEvent event) {
        System.out.println("Item Button clicked");
    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) {
        System.out.println("Orders Button clicked");
    }
}
