package application;

public class WestRoverDirection implements StateRoverDirection{
    private Rover rover;
    public WestRoverDirection(Rover rover){
        this.rover = rover;
    }

    @Override
    public void forward() {
        rover.setX(rover.getX()-1);
    }

    @Override
    public void backward() {
        rover.setX(rover.getX()+1);
    }

    @Override
    public void right() {
        rover.setState(new NorthRoverDirection(rover));
    }

    @Override
    public void left() {
        rover.setState(new SouthRoverDirection(rover));
    }
}
