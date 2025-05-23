package dao;

import dao.custom.impl.CustomerDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch(type){ 
            case CUSTOMER:
                return new CustomerDaoImpl(); 
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        ITEM, CUSTOMER, ORDER, ORDER_DETAILS
    }
}
