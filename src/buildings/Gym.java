package buildings;

public class Gym {

    private String name;


    private String address;
    private String owner;
    private double area;
    private double monthlyRent;
    private double openingTime;
    private double closingTime;
    private int numberOfRooms;

    public Gym(String name, String address, String owner, double area, double monthlyRent, double openingTime, double closingTime, int numberOfRooms) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.area = area;
        this.monthlyRent = monthlyRent;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.numberOfRooms = numberOfRooms;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setOpeningTime(double openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(double closingTime) {
        this.closingTime = closingTime;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOwner() {
        return owner;
    }

    public double getArea() {
        return area;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public double getOpeningTime() {
        return openingTime;
    }

    public double getClosingTime() {
        return closingTime;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

}
