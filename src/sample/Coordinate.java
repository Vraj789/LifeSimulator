package sample;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(int x, int y){
        //assigns x and y values to the x and y that come into the constructor
        this.x = x;
        this.y = y;
    }
    public void setNewCoords(int x, int y) {
        //assigns new x and y values for coordinate objects that have their coordinates changed
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
