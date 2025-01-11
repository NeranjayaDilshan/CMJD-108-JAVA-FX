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
import javafx.scene.control.cell.PropertyValueFactory;
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

    public void initialize() throws Exception {
        System.out.println("First Method");
        getAllCustomer();

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));

        tblCustomer.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            System.out.println("Table Row Click");
            System.out.println("oldSelection : "+oldSelection);
            System.out.println("=============");
            System.out.println("newSelection : "+newSelection);
            if(newSelection !=null){
                txtId.setText(newSelection.getId());
                txtTitle.setText(newSelection.getTitle());
                txtName.setText(newSelection.getName());
                txtAddress.setText(newSelection.getAddress());
                txtDob.setText(newSelection.getDob());
                txtSalary.setText(Double.toString(newSelection.getSalary()));
                txtcity.setText(newSelection.getCity());
                txtPostalCode.setText(newSelection.getPostalCode());
                txtprovince.setText(newSelection.getProvince());
            }
        });

    }

    public void getAllCustomer() throws Exception {
        ArrayList<CustomerDto> all = customerService.getAll();
        System.out.println(all);
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
