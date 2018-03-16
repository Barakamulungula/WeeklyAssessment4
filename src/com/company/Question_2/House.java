package com.company.Question_2;

public class House {
    private double price;
    private int numberOfBedrooms;
    private String fullAddress;

    public House(double price, int numberOfBedrooms, String fullAddress) {
        this.price = price;
        this.numberOfBedrooms = numberOfBedrooms;
        this.fullAddress = fullAddress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
