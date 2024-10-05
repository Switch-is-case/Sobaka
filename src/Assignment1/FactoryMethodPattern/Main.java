package Assignment1.FactoryMethodPattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportFactory factory = null;

        System.out.println("Select delivery method (land, water, air): ");
        String deliveryType = scanner.nextLine();

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

        if (factory != null) {
            factory.manageDelivery();
        }

        scanner.close();
    }
}

