package observer;

public class WeatherWarning implements Observer{
    private int umbralPeligro;

    public WeatherWarning() {
        this.umbralPeligro = 35;
    }

    @Override
    public void update(int temperature){
        if(temperature>umbralPeligro){
            System.out.println("Peligro, la temperatura a superado los: "+umbralPeligro+" grados");
        }
    }
}
