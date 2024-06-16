import observer.TemperatureDisplay;
import observer.WeatherStation;
import observer.WeatherWarning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(weatherWarning);

        weatherStation.setTemperature(30);

        weatherStation.setTemperature(40);
    }
}