package Assignment1.AbstractFactoryPattern;

import Assignment1.AbstractFactoryPattern.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
