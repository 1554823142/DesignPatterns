#include "weather.h"
#include <algorithm>

void WeatherData::registorObserver(Observer* o)
{
    observers.push_back(o);
}

void WeatherData::removeObserver(Observer* o)
{
    auto it = std::find(observers.begin(), observers.end(), o);
    if(it != observers.end()){
        observers.erase(it);
    }
}

void WeatherData::notifyObservers()
{
    for(auto observer : observers)
        observer->update(temperature, humidity, pressure);
}

void WeatherData::setMeasurement(float temperature, float humidity, float pressure)
{
    this->temperature = temperature;
    this->humidity = humidity;
    this->pressure = pressure;
    measurementChanged();
}