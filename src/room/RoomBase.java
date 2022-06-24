package room;

import abstractClass.BuildingAbstract;

public class RoomBase extends BuildingAbstract {

    private boolean isFree;
    private boolean purity;

    public RoomBase(String name, double square, int capacity, boolean isFree, boolean purity) {
        super(name, square, capacity);
        this.isFree = isFree;
        this.purity = purity;
    }
}
