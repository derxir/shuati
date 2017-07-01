package designpattern.decorator;

/**
 * Created by justin on 7/1/17.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
