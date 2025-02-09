#include "condition_display.h"
#include "observer.h"
#include "weather.h"

int main()
{
    WeatherData* weatherData = new WeatherData();

    // 展示 CurrentDisplay
    ConditionDisplay* display = new ConditionDisplay(weatherData);

    // 更新一下数据
    weatherData->setMeasurement(80.0, 65.0, 30.8);
    weatherData->setMeasurement(60.0, 77.7, 66.6);
    weatherData->setMeasurement(70.9, 57.8, 44.9);

    return 0;
}