package observer;

import java.util.Observable;

public class TemperatureDisplay implements Observer{
    public void update(int temperature) {
        System.out.println("La temperatura actual en grados es: "+temperature);
    }
}
