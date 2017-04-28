package StrategyPattern;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
