#pragma once
#include "weather.h"
#include "observer.h"

class ConditionDisplay : public Observer, public DisplayElement
{
private:
    float temperature;
    float humidity;
    Subject* weatherData;

public:
    ConditionDisplay(Subject* weatherData) : weatherData(weatherData)
    {
        weatherData->registorObserver(this);
    }

    void update(float temperature, float humidity, float pressure);

    void display();
};