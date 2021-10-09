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

    public Car addNewCar() {
        Car newcar = new Car();
        carFleetDetails.add(newcar);
        return newcar;
    }

    public void removeCar(Car c) {
        carFleetDetails.remove(c);
    }
    

    public Car searchCar(int id) {
        for (Car car : carFleetDetails) {
            if (car.getModelNumber() == id) {
                return car;
            }
        }
        return null;
    }
    
    public Car searchAvailableCar() {
        for (Car car : carFleetDetails) {
            if (car.isIsAvailable() == true) {
                return car;
            }
        }
        return null;
    }
}
