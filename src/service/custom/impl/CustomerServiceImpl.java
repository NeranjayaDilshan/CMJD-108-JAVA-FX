package service.custom.impl;

import java.util.ArrayList;

import dao.DaoFactory;
import dao.custom.CustomerDao;
import dto.CustomerDto;
import entity.CustomerEntity;
import service.custom.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String save(CustomerDto customerDto) throws Exception {

        System.out.println("Here at Cusotmer service IMPL  ================  ");
        System.out.println(customerDto);
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getId(),
                customerDto.getTitle(), customerDto.getName(), customerDto.getDob(), customerDto.getSalary(),
                customerDto.getAddress(), customerDto.getCity(),
                customerDto.getProvince(), customerDto.getPostalCode());
        return customerDao.save(customerEntity) ? "Success" : "Fail";
    }

    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        for (CustomerEntity customerEntity : customerEntitys) {
            CustomerDto dto = new CustomerDto(customerEntity.getId(),
                    customerEntity.getTitle(), customerEntity.getName(),
                    customerEntity.getDob(), 
                    customerEntity.getSalary(), customerEntity.getAddress(), customerEntity.getCity(),
                    customerEntity.getProvince(), customerEntity.getPostalCode());
            customerDtos.add(dto);
        }
        return customerDtos;
    }

}
