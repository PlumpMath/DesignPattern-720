package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
//        weatherData.registerObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

//    @Override
//    public void update(double temp, double humidity, double pressure) {
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }
}
