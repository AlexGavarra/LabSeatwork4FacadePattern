
/*
 * HomeApp is the main client class.
 * It uses HomeInterface to control all home services
 * without directly interacting with each service class.
 */
public class HomeApp {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create the facade object
        HomeInterface home = new HomeInterface();

        // Display the system title
        System.out.println("=== Intelligent Home System ===");

        // Turn on the lights, TV, and air conditioning
        home.turnOnAll();

        // Turn off the lights, TV, and air conditioning
        home.turnOffAll();
    }
}
