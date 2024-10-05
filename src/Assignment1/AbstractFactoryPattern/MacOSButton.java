package Assignment1.AbstractFactoryPattern;

import Assignment1.AbstractFactoryPattern.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
