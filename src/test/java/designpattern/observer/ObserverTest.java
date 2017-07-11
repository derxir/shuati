package designpattern.observer;

import org.junit.Test;

/**
 * Created by justin on 6/29/17.
 */
public class ObserverTest {

    @Test
    public void main() throws Exception {
        WeatherData weatherData = new WeatherData();
        weatherData.register(new GeneralDisplay());
        weatherData.register(new AnotherDisplay());

        weatherData.setMeasurements(0.0f, "Windy");
        weatherData.setMeasurements(2.0f, "Sunny");
        weatherData.setMeasurements(4.0f, "Snowing");

    }

}