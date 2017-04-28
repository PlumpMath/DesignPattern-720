/**
 * Created by wx_h0001 on 2017/4/27.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck! Green Head!");
    }

}
