package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class MainController {

     @FXML
    private AnchorPane root;

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        System.out.println("Customer Button clicked");
        root.getChildren().clear();
        Parent node = FXMLLoader.load(getClass().getResource("../view/Customer.fxml"));
        root.getChildren().add(node);
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
