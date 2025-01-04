package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CustomerController {

    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTitle;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        System.out.println("Customer Delete Button is working fine");
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String title = txtTitle.getText();

        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("address : "+address);
        System.out.println("title : "+title); 
        
        System.out.println("Customer Save Button is working fine");
    }
}
