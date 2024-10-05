package Assignment2.AdapterPattern;
//Client code
public class Main {
    public static void main(String[] args){
        //European device
        EuropeanDevice europeanDevice = new EuropeanDevice();
        //Adapter that allows the European device to be used with an American socket
        AmericanSocket adapter = new EuropeanToAmericanAdapter(europeanDevice);
        // Plug the European device into the American socket via the adapter
        adapter.plugInAmericanDevice();
    }
}
