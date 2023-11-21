package application;

public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover();
        Console console = new Console(rover);

        console.transmissionRover("ffrfforf");

        System.out.println("x= " + rover.getX() + "; y= " + rover.getY());
    }
}