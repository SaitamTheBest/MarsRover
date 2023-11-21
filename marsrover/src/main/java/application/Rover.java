package application;

public class Rover {
    private int x;
    private int y;
    private StateRoverDirection direction = new NorthRoverDirection(this);

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rover(){
        this(0,0);
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public StateRoverDirection getState() {
        return direction;
    }

    public void setState(StateRoverDirection direction){
        this.direction = direction;
    }
}
