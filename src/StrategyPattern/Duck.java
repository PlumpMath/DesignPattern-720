package StrategyPattern;

/**
 * Created by wx_h0001 on 2017/4/27.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Duck Swim!");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;

    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public abstract void display();


    public static void main(String[] args){
        Duck duck = new RubberDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}

