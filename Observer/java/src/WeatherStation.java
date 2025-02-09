public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = 
            new CurrentConditionsDisplay(weatherData);
        // 其他的展示方法

        // 气象测量模拟
        weatherData.setMeasurements(80f, 65f, 30.8f);
        weatherData.setMeasurements(60f, 77f, 66.6f);
        weatherData.setMeasurements(70f, 57f, 44.4f);
    }
}
