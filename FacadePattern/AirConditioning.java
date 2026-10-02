
/*
 * AirConditioning represents the air conditioning service.
 * It implements the HomeService interface.
 */
public class AirConditioning implements HomeService {

    // Turns on the air conditioning
    @Override
    public void turnOn() {
        System.out.println("Air conditioning is turned ON.");
    }

    // Turns off the air conditioning
    @Override
    public void turnOff() {
        System.out.println("Air conditioning is turned OFF.");
    }
}
