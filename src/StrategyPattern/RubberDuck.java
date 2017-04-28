package StrategyPattern;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("iam A fake");
    }
}
