package model.CustomerManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author manju
 */
public class CustomerProfile1 extends Profile {

    public CustomerProfile1(Person p) {
        super(p);
    }

    @Override
    public String getRole() {
        
        return "customer";
    }
    
}
