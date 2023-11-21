package application;

public class EastRoverDirection implements StateRoverDirection{
    private Rover rover;

    public EastRoverDirection(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void forward() {
        rover.setX(rover.getX()+1);
    }

    @Override
    public void backward() {
        rover.setX(rover.getX()-1);
    }

    @Override
    public void right() {
        rover.setState(new SouthRoverDirection(rover));
    }

    @Override
    public void left() {
        rover.setState(new NorthRoverDirection(rover));
    }
}
