package FactoryMethodPattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportFactory factory = null;

        // User selects the type of delivery
        System.out.println("Select delivery method (land, water, air): ");
        String deliveryType = scanner.nextLine();

        // Instantiate the appropriate factory based on user input
        switch (deliveryType.toLowerCase()) {
            case "land":
                factory = new ConcreteFactories.LandTransportFactory();
                break;
            case "water":
                factory = new ConcreteFactories.WaterTransportFactory();
                break;
            case "air":
                factory = new ConcreteFactories.AirTransportFactory();
                break;
            default:
                System.out.println("Invalid delivery type.");
                break;
        }

        // Perform delivery using the selected factory
        if (factory != null) {
            factory.manageDelivery();
        }

        scanner.close();
    }
}

