package ObserverPattern;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by wx_h0001 on 2017/4/28.
 */
public class WeatherData extends Observable{

    //    private ArrayList observers;
    private double temperature;
    private double humidity;
    private double pressure;

//    public WeatherData() {
//        observers = new ArrayList();
//    }

    //    @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0){
//            observers.remove(i);
//        }
//
//    }

//    @Override
//    public void notifyObserver() {
//        for (int i = 0; i < observers.size(); i++){
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature, humidity, pressure);
//        }
//    }


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(double temp, double humidity, double pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
