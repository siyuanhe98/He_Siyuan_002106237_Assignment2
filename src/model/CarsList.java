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
public class CarsList {
   
    private ArrayList<Cars> carsList;
    public CarsList(){
          carsList = ConfigCars.getInstance();
    }
     
    
    
    public ArrayList<Cars> getCarsList() {
        return carsList;
    }

    public void setCarsList(ArrayList<Cars> carsList) {
        this.carsList = carsList;
    }
    
    public Cars addCars(){
        Cars car = new Cars();
        carsList.add(car);
        return car;
    }
    
    public Cars searchCars(int id) {
        for (Cars car : carsList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }
    public int CarsNum(){
        return carsList.size();
    }
}
