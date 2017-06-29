package designpatttern.observer;

/**
 * Created by justin on 6/29/17.
 */
public class AnotherDisplay implements Observer, Display {

    private float temperature;
    private String status;
    private WeatherData weatherData;

    public AnotherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    public void update(Observable ob, Object arg) {
        if (ob instanceof WeatherData) {
            WeatherData data = (WeatherData) ob;
            this.temperature = data.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.printf("Special temperature: %f \n", temperature);
    }
}
