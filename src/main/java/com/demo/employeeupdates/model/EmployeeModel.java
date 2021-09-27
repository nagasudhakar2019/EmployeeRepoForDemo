package com.demo.employeeupdates.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class EmployeeModel {
    private String Id;
    private String Name;
    private String City;
    private int Sal;

    //getters
    public String getId() {
        return Id;
    }

    //setters
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int Sal) {
        this.Sal = Sal;
    }

}
