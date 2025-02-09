#pragma once
#include <iostream>
#include <vector>
#include "observer.h"

// 定义天气**数据**
class WeatherData : public Subject{
private:
    std::vector<Observer*> observers;
    float temperature;
    float humidity;
    float pressure;

public:
    WeatherData(){

    }
    
    // 重写基类的方法
    void registorObserver(Observer* o) override;
    void removeObserver(Observer* o) override;
    void notifyObservers() override;

    void measurementChanged(){
        notifyObservers();
    }

    void setMeasurement(float temperature, float humidity, float pressure);

};