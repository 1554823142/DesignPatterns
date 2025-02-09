#pragma once 
#include "duck.h"
#include <iostream>

//====================飞行行为======================//
// 飞行必须实现的接口
class FlyBehavior{
public:
    virtual void fly() = 0;         //定义抽象接口
};

// 不能飞行的行为
class FlyNoWay : public FlyBehavior{
public:
    void fly() override {
        std::cout << "I can't fly!!" << std::endl;
    }
};

class FlyWithWings : public FlyBehavior{
public:
    void fly() override{
        std::cout << "I'm flying with wings!" << std::endl;
    }
};

class FlyRocketPowered : public FlyBehavior{
public:
    void fly() override{
        std::cout << "I can fly with a rocket!" << std::endl;
    }
};

//====================叫行为======================//

class QuackBehavior{
public:
    virtual void quack() = 0;
};

class Quack : public QuackBehavior{
public:
    void quack() override{
        std::cout << "Quack!!" << std::endl;
    }
};

class Squeeck : public QuackBehavior{
public:
    void quack() override{
        std::cout << "Squeeck!!" << std::endl;
    }
};

class MuteQuack : public QuackBehavior{
public:
    void quack() override{
        std::cout << "<<Silent>>" << std::endl;
    }
};
