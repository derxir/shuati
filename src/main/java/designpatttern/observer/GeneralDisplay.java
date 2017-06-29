package designpatttern.observer;

/**
 * Created by justin on 6/29/17.
 */
public class GeneralDisplay implements Observer, Display {

    private float temperature;
    private String status;
    private WeatherData weatherData;

    public GeneralDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.register(this);
    }

    public void update(Observable ob, Object arg) {
        if (ob instanceof WeatherData) {
            WeatherData data = (WeatherData) ob;
            setStatus(data.getStatus());
            setTemperature(data.getTemperature());
            display();
        }
    }

    public void display() {
        System.out.printf("General Display: Temperature: %f, Status: %s \n", temperature, status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTemperature() {

        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
