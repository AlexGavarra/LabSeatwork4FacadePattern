
/*
 * Light represents the lighting system in the house.
 * It implements HomeService, so it must provide
 * the turnOn() and turnOff() methods.
 */
public class Light implements HomeService {

    // Turns on the lights
    @Override
    public void turnOn() {
        System.out.println("Lights are turned ON.");
    }

    // Turns off the lights
    @Override
    public void turnOff() {
        System.out.println("Lights are turned OFF.");
    }
}
