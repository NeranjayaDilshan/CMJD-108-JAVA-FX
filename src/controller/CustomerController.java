package controller;

import dto.CustomerDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CustomerController {

    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtDob;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtcity;

    @FXML
    private TextField txtprovince;

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
        Double salary = Double.parseDouble(txtSalary.getText()) ;
        String city = txtcity.getText();
        String province = txtprovince.getText();
        String postalcode = txtPostalCode.getText();
        String dob = txtDob.getText();

        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("title : " + title);

        CustomerDto customerDto = new CustomerDto(id,title,name,dob,salary,address,city,province,postalcode);
        System.out.println(customerDto);

        System.out.println("Customer Save Button is working fine");
    }
}
