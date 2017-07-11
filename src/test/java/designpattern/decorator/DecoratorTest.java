package designpattern.decorator;

import org.junit.Test;

import javax.swing.text.DefaultEditorKit;

/**
 * Created by justin on 7/1/17.

 */
public class DecoratorTest {

    @Test
    public void main(){

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +" $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();  //针对接口的引用和装饰
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +" $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +" $" + beverage3.cost());


    }

}