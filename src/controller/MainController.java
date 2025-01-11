package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

     @FXML
    private AnchorPane root;

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        System.out.println("Customer Button clicked");
        // root.getChildren().clear();
        // Parent node = FXMLLoader.load(getClass().getResource("../view/Customer.fxml"));
        // root.getChildren().add(node);

        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Customer.fxml"))));
        stage.show();
    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        System.out.println("Item Button clicked");
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Item.fxml"))));
        stage.show();
    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) throws IOException {
        System.out.println("Orders Button clicked");
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Orders.fxml"))));
        stage.show();
    }
}
