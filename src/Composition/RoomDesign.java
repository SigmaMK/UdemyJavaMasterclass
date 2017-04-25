package Composition;

public class RoomDesign {
    private int walls;
    private int floor;
    private int ceiling;

    public RoomDesign(int walls, int floor, int ceiling) {
        this.walls = walls;
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public int getWalls() {
        return walls;
    }

    public int getFloor() {
        return floor;
    }

    public int getCeiling() {
        return ceiling;
    }
}
