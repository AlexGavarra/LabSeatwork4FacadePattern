
/*
 * TV represents the television service.
 * It implements the HomeService interface.
 */
public class TV implements HomeService {

    // Turns on the television
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    // Turns off the television
    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
