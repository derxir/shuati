package designpattern.decorator;

/**
 * Created by justin on 7/1/17.
 */
public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    double cost() {
        return beverage.cost() + .1;
    }
}
