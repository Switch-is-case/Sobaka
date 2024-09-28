package FactoryMethodPattern;

public class ConcreteFactories {
    public static class LandTransportFactory extends TransportFactory{
        @Override
        public Transport createTransport() {
            return new ConcreteTransport.Car();
        }
    }

    public static class WaterTransportFactory extends TransportFactory{
        @Override
        public Transport createTransport() {
            return new ConcreteTransport.Ship();
        }
    }

    public static class AirTransportFactory extends TransportFactory{
        @Override
        public Transport createTransport() {
            return new ConcreteTransport.Airplane();
        }
    }
}
