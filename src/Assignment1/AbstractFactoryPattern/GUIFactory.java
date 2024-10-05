package Assignment1.AbstractFactoryPattern;

import Assignment1.AbstractFactoryPattern.Button;
import Assignment1.AbstractFactoryPattern.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();

}
