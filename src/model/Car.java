/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author nidhitiwari
 */
public class Car {
    
    private long serialNumber;
    private long modelNumber;
    private boolean isAvailable;
    private String manufacturer;
    private LocalDate manufacturedDate;
    private int seatCapacity;
    private String usedByApp;
    private LocalDateTime lastUpdated;
    private String city;
    private LocalDate maintenanceCertExpDate;
    
    private static int count = 0;
    
    public Car() {
        count++;
        modelNumber = count;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getModelNumber() {
        return modelNumber;
    }
    
    @Override
    public String toString() {
        return String.valueOf(modelNumber);
    }

    public void setModelNumber(long modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getUsedByApp() {
        return usedByApp;
    }

    public void setUsedByApp(String usedByApp) {
        this.usedByApp = usedByApp;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getMaintenanceCertExpDate() {
        return maintenanceCertExpDate;
    }

    public void setMaintenanceCertExpDate(LocalDate maintenanceCertExpDate) {
        this.maintenanceCertExpDate = maintenanceCertExpDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }
    
}
