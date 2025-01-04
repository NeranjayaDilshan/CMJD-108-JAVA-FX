package service.custom;

import dto.CustomerDto;
import service.SuperService;

public interface CustomerService extends SuperService{
 public String save(CustomerDto customerDto) throws Exception;

}
