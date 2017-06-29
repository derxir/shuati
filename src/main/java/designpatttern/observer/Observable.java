package designpatttern.observer;

/**
 * Created by justin on 6/29/17.
 */
interface Observable {

    void register(Observer o);

    void cancel(Observer o);

    void notifyObservers();
}
