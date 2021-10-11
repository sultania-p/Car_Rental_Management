/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piyus
 */
public class CarFleet {
    
    private ArrayList<Car> carFleetDetails;

    public CarFleet() {
        this.carFleetDetails = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarFleetDetails() {
        return carFleetDetails;
    }

    public void setCarFleetDetails(ArrayList<Car> carFleetDetails) {
        this.carFleetDetails = carFleetDetails;
    }

    //add a new car item
    public Car addNewCar() {
        Car newvehicle = new Car();
        carFleetDetails.add(newvehicle);
        return newvehicle;
    }

    //delete the car record
    public void removeCar(Car c) {
        carFleetDetails.remove(c);
    }
    
    public Car searchAvailableCar() {
        for (Car vehicle : carFleetDetails) {
            if (vehicle.isIsAvailable()== true) {
                return vehicle;
            }
        }
        return null;
    }  

    public Car searchCar(int vehicleid) {
        for (Car vehicle : carFleetDetails) {
            if (vehicle.getModelNumber()== vehicleid) {
                return vehicle;
            }
        }
        return null;
    }
    
}
