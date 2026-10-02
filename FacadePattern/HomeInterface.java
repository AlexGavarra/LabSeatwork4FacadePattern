
/*
 * HomeInterface is the Facade class.
 * It provides a single interface for controlling
 * the lights, TV, and air conditioning.
 */
public class HomeInterface {

    // References to the individual home services
    private final HomeService light;
    private final HomeService tv;
    private final HomeService airConditioning;

    // Creates an object for each home service
    public HomeInterface() {
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    // Turns on all home services
    public void turnOnAll() {
        System.out.println("\nTurning ON all home services...");

        // Delegate the request to each service
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    // Turns off all home services
    public void turnOffAll() {
        System.out.println("\nTurning OFF all home services...");

        // Delegate the request to each service
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
