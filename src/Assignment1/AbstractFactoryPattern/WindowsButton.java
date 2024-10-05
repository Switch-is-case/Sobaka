package Assignment1.AbstractFactoryPattern;

import Assignment1.AbstractFactoryPattern.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
