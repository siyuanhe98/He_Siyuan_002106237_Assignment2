/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Cars {
    private boolean avail;
    private String brand;
    private String year;
    private int seats;
    private int id;
    private String name;
    private String city;

    public Cars() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cars(boolean avail, String brand, String year, int seats, int id, String name, String city) {
        this.avail = avail;
        this.brand = brand;
        this.year = year;
        this.seats = seats;
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
