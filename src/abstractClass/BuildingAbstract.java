package abstractClass;

public abstract class BuildingAbstract {
    private String name;
    private double square;
    private int capacity;

    public BuildingAbstract(String name, double square, int capacity) {
        this.name = name;
        this.square = square;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
