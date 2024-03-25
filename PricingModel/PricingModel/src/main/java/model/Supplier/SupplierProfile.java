/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Supplier;

import java.util.ArrayList;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author manju
 */
public class SupplierProfile extends Profile {
    ProductCatalog productcatalog;
    ProductsReport productsreport;

    public Person getP1() {
        return p1;
    }
    Person p1;

    public SupplierProfile(Person p) {
        super(p);
        p1=p;
        productcatalog = new ProductCatalog();
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return p1.getPersonId();
    }
        public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    
    

    @Override
    public String getRole() {
    
        return "Supplier";
    }
    
}
