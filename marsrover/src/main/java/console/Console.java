package console;

import application.Rover;

public class Console {
    private Rover rover;

    public Console(Rover rover) {
        this.rover = rover;
    }

    public void transmissionRover(String text){
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == 'f') {
                rover.getState().forward();
            }
            else if (text.charAt(i) == 'b') {
                rover.getState().backward();
            }
            else if (text.charAt(i) == 'r') {
                rover.getState().right();
            }
            else if (text.charAt(i) == 'l') {
                rover.getState().left();
            }
        }
    }
}
