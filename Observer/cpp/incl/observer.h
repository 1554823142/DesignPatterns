#pragma once
#include <iostream>

// 定义观察者基类
class Observer
{
public:
    virtual void update(float temperature, float humidity, float pressure) = 0;
};

// 定义主题基类 (增删改, 通知观察者)
class Subject{
public:
    virtual void registorObserver(Observer* o) = 0;
    virtual void removeObserver(Observer* o) = 0;
    virtual void notifyObservers() = 0;
};

// 定义展示基类
class DisplayElement{
public:
    virtual void display() = 0;
};


