package Assignment1.FactoryMethodPattern;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void manageDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
