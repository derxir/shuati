package designpattern.observer;

import java.util.ArrayList;

/**
 * Created by justin on 6/29/17.
 */
public class WeatherData implements Observable {

    private ArrayList<Observer> observers;
    private float temperature;
    private String status;
    private boolean changed;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    private void setChanged() {
        changed = true;
    }

    private void clearchanged(){
        changed = false;
    }

    public void register(Observer o) {
        if (!observers.contains(o)) observers.add(o);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        if (changed) {
            for (Observer o : observers) {
                o.update(this, null); // this is pull
            }
        }
        changed = false;
    }

    public void setMeasurements(float temperature, String status) {
        this.status = status;
        this.temperature = temperature;
        setChanged();
        notifyObservers();
    }


    public String getStatus() {
        return status;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
