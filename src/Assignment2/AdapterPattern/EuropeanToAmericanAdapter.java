package Assignment2.AdapterPattern;
// Adapter Class - Adapts EuropeanDevice to work with AmericanSocket
public class EuropeanToAmericanAdapter implements AmericanSocket{
    private EuropeanDevice europeanDevice;

    public EuropeanToAmericanAdapter(EuropeanDevice europeanDevice) {
        this.europeanDevice = europeanDevice;
    }

    @Override
    public void plugInAmericanDevice() {
        // Adapts the European plug to fit in the American socket
        europeanDevice.pluginEuropeanDevice();
        System.out.println("Adapted the European device to fit in an American socket.");
    }
}
