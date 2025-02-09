public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // 建立布告板
    private float temperature;
    private float humidity;
    private Subject weatherData;        // 保存对Subject的引用方便日后取消订阅

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registorObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature +
            "F degrees and " + humidity + "% humidity");
    }

}
