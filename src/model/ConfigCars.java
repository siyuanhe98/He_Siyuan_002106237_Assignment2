/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ConfigCars {
    private static ArrayList<Cars> configCars = new ArrayList<>();
    
    public static ArrayList<Cars> getInstance(){
        configCars.add(new Cars(false, "Honda", "2005", 5, 1001, "Civic","Boston"));
        configCars.add(new Cars(false, "Honda", "2008", 5, 1002, "Accord","Malden"));
        configCars.add(new Cars(false, "Honda", "2019", 5, 1003, "Civic","Boston"));
        configCars.add(new Cars(true, "Honda", "2005", 5, 1004, "Accord","Malden"));
        configCars.add(new Cars(true, "Audi", "2019", 5, 1005, "A8L","Boston"));
        configCars.add(new Cars(true, "Audi", "2008", 5, 1006, "A7","Boston"));
        configCars.add(new Cars(false, "Audi", "2019", 5, 1007, "A8L","Quincy"));
        configCars.add(new Cars(true, "Audi", "2008", 5, 1008, "A7","Boston"));
        configCars.add(new Cars(false, "BWM", "2008", 5, 1009, "730i","Malden"));
        configCars.add(new Cars(false, "BWM", "2008", 5, 1010, "730i","Boston"));
        configCars.add(new Cars(true, "BWM", "2008", 5, 1011, "730i","Malden"));
        configCars.add(new Cars(false, "BWM", "2019",7, 1012, "X5","Boston"));
        configCars.add(new Cars(true, "BWM", "2005", 7, 1013, "X5","Malden"));
        configCars.add(new Cars(false, "BWM", "2005", 7, 1014, "X5","Quincy"));
        configCars.add(new Cars(false, "BWM", "2019", 7, 1015, "X5","Malden"));
        configCars.add(new Cars(true, "Honda", "2008", 7, 1016, "CRV","Quincy"));
        configCars.add(new Cars(false, "Honda", "2021", 5, 1017, "Accord","Malden"));
        configCars.add(new Cars(false, "Audi", "2005", 2, 1018, "TT","Quincy"));
        configCars.add(new Cars(true, "Jeep", "2020", 7, 1019, "Wrangler","Malden"));
        configCars.add(new Cars(false, "Bugatti", "2021", 2, 1020, "Veyron","Quincy"));
        return configCars;
    }  
}
