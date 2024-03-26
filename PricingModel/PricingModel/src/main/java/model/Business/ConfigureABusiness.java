/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.CustomerManagement.CustomerProfile1;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.Supplier.SupplierProfile;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    
    PersonDirectory persondirectory = business.getPersonDirectory();
    
        Person person001 = persondirectory.newPerson("John");
        Person person002 = persondirectory.newPerson("Will");
        Person person003 = persondirectory.newPerson("Steve");        
        Person person004 = persondirectory.newPerson("tom");
        Person person005 = persondirectory.newPerson("rom");
        Person person006 = persondirectory.newPerson("Sam");
        Person person007 = persondirectory.newPerson("Dan");
        Person person008 = persondirectory.newPerson("Davis");
        Person person009 = persondirectory.newPerson("Kev");
        Person person010 = persondirectory.newPerson("Amanda Taylor");
        Person person011 = persondirectory.newPerson("Robert Lee");
        Person person012 = persondirectory.newPerson("Jessica Garcia");
        Person person013 = persondirectory.newPerson("Christopher Rodriguez");
        Person person014 = persondirectory.newPerson("Ashley Lopez");
        Person person015 = persondirectory.newPerson("Matthew Perez");
        Person person016 = persondirectory.newPerson("Lauren Hernandez");
        


        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);
        
        SupplierDirectory supplierdirectory = business.getSupplierDirectory();
        SupplierProfile mobiles = supplierdirectory.newSupplier(person002);
        
        SalesPersonDirectory spd =business.getSalesPersonDirectory();
        SalesPersonProfile salesperson1 = spd.newSalesPersonProfile(person016);
        
        
      
        SupplierProfile supplier2 = supplierdirectory.newSupplier(person005);
        
        
    
        ProductCatalog pc = mobiles.getProductCatalog();
        Product  newProduct1   =pc.newProduct("iphone 15 pro max", 1000, 1100, 1300);
        Product  newProduct2   =pc.newProduct("iphone 15 pro max", 1000, 1100, 1300);
        Product newProduct3 = pc.newProduct("Google Pixel 6", 750, 850, 1000);
        Product newProduct4 = pc.newProduct("OnePlus 9 Pro", 750, 850, 1000);
        Product newProduct5 = pc.newProduct("Sony Xperia 5 III", 700, 800, 950);
        Product newProduct6 = pc.newProduct("Xiaomi Mi 11", 600, 700, 800);
        Product newProduct7 = pc.newProduct("Huawei P50 Pro", 750, 850, 950);
        Product newProduct8 = pc.newProduct("LG Velvet 2 Pro", 600, 700, 800);
        Product newProduct9 = pc.newProduct("Motorola Edge+", 650, 750, 900);
        Product newProduct10 = pc.newProduct("ASUS ROG Phone 5", 800, 900, 1000);
        Product newProduct11 = pc.newProduct("Nokia 9 PureView", 500, 600, 700);
        Product newProduct12 = pc.newProduct("BlackBerry Key3", 550, 650, 750);
        Product newProduct13 = pc.newProduct("Oppo Find X3 Pro", 750, 850, 950);
        Product newProduct14 = pc.newProduct("Vivo X70 Pro+", 700, 800, 900);
        Product newProduct15 = pc.newProduct("Realme GT Master Edition", 400, 500, 600);
        Product newProduct16 = pc.newProduct("Lenovo Legion Phone Duel 2", 900, 1000, 1100);
        
        CustomerDirectory customerdirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile0 = customerdirectory.newCustomerProfile(person003);
        
        MasterOrderList mol =  business.getMasterOrderList();
        Order order1 = mol.newOrder(customerprofile0,salesperson1);
        
        order1.newOrderItem(newProduct1,1050 ,3);
        
            
        
        

        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****"); /// order products for one of the customers and performed by a sales person
        UserAccount ua4 = uadirectory.newUserAccount(mobiles, "tesla", "****"); /// order products for one of the customers and performed by a sales person
//        UserAccount ua5 = uadirectory.newUserAccount(customerprofile0, "srini", "****");
        UserAccount ua6 = uadirectory.newUserAccount(salesperson1, "a", "*");
    
    return business;
  }
}
