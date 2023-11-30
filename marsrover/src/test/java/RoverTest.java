import application.Console;
import application.Rover;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    private Rover rover;
    Console console;
    @BeforeEach
    void before(){
        rover = new Rover();
        console = new Console(rover);
    }

    @Test
    void testWhenGoesToNorthOnce(){
        console.transmissionRover("f");
        assertEquals(rover.getY(),1);
        assertEquals(rover.getX(), 0);
    }

    @Test
    void turnToRightAndTestWhenGoesToEastOnce(){
        console.transmissionRover("rf");
        assertEquals(rover.getY(),0);
        assertEquals(rover.getX(), 1);
    }

    @Test
    void turnTwoTimeIntoTheRightAndTestWhenGoesToSouthOnce(){
        console.transmissionRover("rrf");
        assertEquals(rover.getY(),-1);
        assertEquals(rover.getX(), 0);
    }
    @Test
    void turnToLeftAndTestWhenGoesToWestOnce(){
        console.transmissionRover("lf");
        assertEquals(rover.getY(),0);
        assertEquals(rover.getX(), -1);
    }
}
