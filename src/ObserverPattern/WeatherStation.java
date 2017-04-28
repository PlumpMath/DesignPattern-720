package ObserverPattern;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticDispaly sd = new StatisticDispaly(weatherData);
        weatherData.setMeasurements(75.3, 82.5, 108);
        weatherData.setMeasurements(77.8, 80.3, 200);
    }
}
