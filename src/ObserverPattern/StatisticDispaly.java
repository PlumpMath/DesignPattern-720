package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class StatisticDispaly implements Observer, DisplayElement{

    private WeatherData weatherData;

    public StatisticDispaly(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
//        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistic Display");
    }

    @Override
    public void update(Observable o, Object arg) {
        display();
    }
    //    @Override
//    public void update(double temp, double humidity, double pressure) {
//        display();
//    }
}
