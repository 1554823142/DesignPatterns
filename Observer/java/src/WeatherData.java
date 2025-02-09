import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registorObserver(Observer o){
        observers.add(o);       // 观察者注册
    }

    public void RemoveObserver(Observer o){
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);       // 更新数据(各个观察者打印信息)
        }
    }

    public void measurementsChanged(){      // 更新数据时通知观察者
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // other funcs
}
