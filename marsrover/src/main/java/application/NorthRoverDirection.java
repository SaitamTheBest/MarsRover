package application;

public class NorthRoverDirection implements StateRoverDirection{
    private Rover rover;

    public NorthRoverDirection(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void forward() {
        rover.setY(rover.getY()+1);
    }

    @Override
    public void backward() {
        rover.setY(rover.getY()-1);
    }

    @Override
    public void right() {
        rover.setState(new EastRoverDirection(rover));
    }

    @Override
    public void left() {
        rover.setState(new WestRoverDirection(rover));
    }
}
