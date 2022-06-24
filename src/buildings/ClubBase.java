package buildings;

import abstractClass.BuildingAbstract;

public class ClubBase extends BuildingAbstract {
    private double rent;
    private double openingTime;
    private double closingTime;
    private int numberOfRooms;

    public ClubBase(String name, double square, int capacity, double rent, double openingTime, double closingTime, int numberOfRooms) {
        super(name, square, capacity);
        this.rent = rent;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.numberOfRooms = numberOfRooms;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(double openingTime) {
        this.openingTime = openingTime;
    }

    public double getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(double closingTime) {
        this.closingTime = closingTime;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}

