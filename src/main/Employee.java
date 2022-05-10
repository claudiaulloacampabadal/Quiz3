/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import util.Utility;

/**
 *
 * @author Maria Celeste
 */
public class Employee {
    
    private String id;
    private String lastName;
    private String firstName;
    private String title;
    private Date birthday;

    public Employee(String id, String lastName, String firstName, String title, Date birthday) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthday = birthday;
    }
    
    //añadir la edad obteniendo date
    public int getAge(){
       return Utility.getAge(birthday);
    }
    
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "(ID)"+id +"/(Name)"+lastName +", "+firstName + "/(Birthday)"
        + Utility.dateFormat(birthday)+ "/(Title)"+ title +"/(Age)"+ getAge();
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
    
    
}
