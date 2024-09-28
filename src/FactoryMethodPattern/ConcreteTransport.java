package FactoryMethodPattern;

public class ConcreteTransport {
    public static class Car implements Transport{
        @Override
        public void deliver() {
            System.out.println("Delivery by land in a car");
        }
    }

    public static class Airplane implements Transport{
        @Override
        public void deliver() {
            System.out.println("Delivery by air in a airplane");
        }
    }

    public static class Ship implements Transport{
        @Override
        public void deliver() {
            System.out.println("Delivery by water in a ship.");
        }
    }
}
