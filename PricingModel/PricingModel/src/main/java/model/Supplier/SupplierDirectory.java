/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<SupplierProfile> suppliers;
    public SupplierDirectory(){
        suppliers = new ArrayList();
    }

    public ArrayList<SupplierProfile> getSuppliers() {
        return suppliers;
    }
//    public Supplier newSupplier(String n){
//        Supplier supplier = new Supplier(n);
//        suppliers.add(supplier);
//        return supplier;
//
//    }
    public SupplierProfile findSupplier(String id){
        
        for (SupplierProfile supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    public ArrayList<SupplierProfile> getSuplierList(){
        return suppliers;
    }
    public void removeSupplier(SupplierProfile s) {
        suppliers.remove(s);
    }

    public SupplierProfile newSupplier(Person person002) {
    
        SupplierProfile s = new SupplierProfile(person002);
        suppliers.add(s);
        return s;

    }

    
}