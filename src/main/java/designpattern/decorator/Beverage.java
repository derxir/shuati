package designpattern.decorator;

/**
 * Created by justin on 7/1/17.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();
}
