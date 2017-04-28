import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by wx_h0001 on 2017/4/27.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck! Red Head!");
    }
}
