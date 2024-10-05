package Assignment1.FactoryMethodPattern;

public class ConcreteFactories {
    // for land-based transport
    public static class LandTransportFactory extends TransportFactory{
        @Override
        //for return a car object
        public Transport createTransport() {
            return new ConcreteTransport.Car();
        }
    }

    //for water-based transport
    public static class WaterTransportFactory extends TransportFactory{
        @Override
        // for return a ship object
        public Transport createTransport() {
            return new ConcreteTransport.Ship();
        }
    }

    //for air-based transport
    public static class AirTransportFactory extends TransportFactory{
        @Override
        //for return airplane object
        public Transport createTransport() {
            return new ConcreteTransport.Airplane();
        }
    }
}
