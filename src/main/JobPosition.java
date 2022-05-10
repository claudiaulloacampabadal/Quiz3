/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Maria Celeste
 */
public class JobPosition {
    private int id;//EL id debe ser autogeenrado
    private String description;
    private double hourlyWage;
    private static int autoId;//para que se autogenere el id

    public JobPosition() {
    }
    

    public JobPosition(String description, double hourlyWage) {
        this.id = ++autoId;//lo va incrementar, va a empezar en 1
        this.description = description;
        this.hourlyWage = hourlyWage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        JobPosition.autoId = autoId;
    }
    
    public double getSalary(double n){
        return n*hourlyWage;
        
    }

    @Override
    public String toString() {
        return "(ID)"+id+"/(Job Position)"+description +" /(Hourly Wage)"+ hourlyWage;
    }
    
    
    
    
    
    
    
}
