package controller;

import java.util.ArrayList;

import dto.CustomerDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import service.ServiceFactory;
import service.custom.CustomerService;

public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance()
            .getService(ServiceFactory.ServiceType.CUSTOMER);

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
    private TableColumn<CustomerDto, String> colAddress;

    @FXML
    private TableColumn<CustomerDto, String> colCity;

    @FXML
    private TableColumn<CustomerDto, String> colId;

    @FXML
    private TableColumn<CustomerDto, String> colName;

    @FXML
    private TableColumn<CustomerDto, Double> colSalary;

    @FXML
    private TableColumn<CustomerDto, String> colTitle;

    @FXML
    private TableView<CustomerDto> tblCustomer;

    public void initialize()throws Exception {
        System.out.println("First Method");
        getAllCustomer();
    }

    public void getAllCustomer() throws Exception{
        ArrayList<CustomerDto> all = customerService.getAll();

        ObservableList<CustomerDto> observableArrayList = FXCollections.observableArrayList();
        observableArrayList.addAll(all);
        tblCustomer.setItems(observableArrayList);
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        System.out.println("Customer Delete Button is working fine");
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) throws Exception {

        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String title = txtTitle.getText();
        Double salary = Double.parseDouble(txtSalary.getText());
        String city = txtcity.getText();
        String province = txtprovince.getText();
        String postalcode = txtPostalCode.getText();
        String dob = txtDob.getText();

        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("address : " + address);
        System.out.println("title : " + title);

        CustomerDto customerDto = new CustomerDto(id, title, name, dob, salary, address, city, province, postalcode);
        System.out.println(customerDto);
        String save = customerService.save(customerDto);
        System.out.println("Customer Save Button is working fine");
    }
}
