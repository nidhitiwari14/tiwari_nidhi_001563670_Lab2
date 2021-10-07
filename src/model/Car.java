/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nidhitiwari
 */
public class Car {
    
    private int serialNumber;
    private int modelNumber;
    private boolean isAvailable;
    private String manufacturer;
    private String manufacturedDate;
    private int seatCapacity;
    private String usedByApp;
    private String lastUpdated;
    private String city;
    private String maintenanceCertExpDate;
    
    private static int count = 0;
    
    public Car() {
        count++;
        modelNumber = count;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }
    
    @Override
    public String toString() {
        return String.valueOf(modelNumber);
    }

    public void setModelNumber(int modelNumber) {
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

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(String manufacturedDate) {
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

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaintenanceCertExpDate() {
        return maintenanceCertExpDate;
    }

    public void setMaintenanceCertExpDate(String maintenanceCertExpDate) {
        this.maintenanceCertExpDate = maintenanceCertExpDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }
    
}
