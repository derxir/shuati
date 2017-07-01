package designpattern.decorator;

import org.junit.Test;

import javax.swing.text.DefaultEditorKit;

/**
 * Created by justin on 7/1/17.
 * 装饰者模式由装饰者和被装饰者组成，并且都继承于同一个超类component。被装饰者含有装饰者的引用。
 *
 * 装饰者的行为包含新加的行为和delegate到被装饰者本身的行为两部分。
 *
 * 装饰者和被装饰者必须是一样的类型，也就是共同的超类。这里的继承是为了类型匹配而不是利用继承获得行为。
 * 新的行为来自于装饰者和component的组合而不是超类继承。
 *
 * 装饰者的行为是在运行时添加的，增加新的行为时不需要修改现有的代码
 */
public class DecoratorTest {

    @Test
    public void main(){


        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +" $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
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