package service.custom;

import java.util.ArrayList;

import dto.CustomerDto;
import service.SuperService;

public interface CustomerService extends SuperService{
 public String save(CustomerDto customerDto) throws Exception;

 public ArrayList<CustomerDto> getAll() throws Exception;

}
