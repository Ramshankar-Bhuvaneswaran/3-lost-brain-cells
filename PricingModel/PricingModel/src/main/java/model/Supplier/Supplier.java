/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import model.Personnel.Person;

import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class Supplier {

    public SupplierProfile getSp() {
        return sp;
    }
    SupplierProfile sp;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    public Supplier(Person n){
        SupplierProfile sp1 = new SupplierProfile(n);
        this.sp=sp1;
        productcatalog = new ProductCatalog("software");
        
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
        return sp.getPerson().getPersonId();
    }
        public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    //add supplier product ..
    
    //update supplier product ...
    @Override
   public String toString(){
       return sp.getPerson().getPersonId();
       
   }
}
