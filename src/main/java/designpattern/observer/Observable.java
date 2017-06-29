package designpattern.observer;

/**
 * Created by justin on 6/29/17.
 */
interface Observable {

    void register(Observer o);

    void unregister(Observer o);

    void notifyObservers();
}
