package service.custom.impl;

import dto.CustomerDto;
import service.custom.CustomerService;

public class CustomerServiceImpl implements CustomerService{

    @Override
    public String save(CustomerDto customerDto) throws Exception {

        System.out.println("Here at Cusotmer service IMPL  ================  ");
        System.out.println(customerDto);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
