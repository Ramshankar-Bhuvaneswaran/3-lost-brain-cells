
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;

    public Person(String id) {

        this.id = id;
    }

    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        return getPersonId().equals(id);
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}
