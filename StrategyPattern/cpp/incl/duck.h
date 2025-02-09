#pragma once
#include "behavior.h"
#include <iostream>

class Duck{
    public:
        // 声明行为接口的变量
        FlyBehavior* flybehavior;
        QuackBehavior* quackbehavior;
    
        Duck() {}
    
        void performFly(){
            flybehavior->fly();
        }

        void performQuack(){
            quackbehavior->quack();
        }

        void swim(){
            std::cout << "all ducks can swim!" << std::endl;
        }

        // 添加两个可以动态更改行为的方法
        void setFlyBehavior(FlyBehavior* fb){
            flybehavior = fb;
        }

        void setQuackBehavior(QuackBehavior* qb){
            quackbehavior = qb;
        }
};

// 定义一只实体鸭子
class MallardDuck : public Duck{
    public:
        MallardDuck() {
            // 将鸭子的行为委托给具体的行为对象
            flybehavior = new FlyWithWings();
            quackbehavior = new Quack();
        }
};

class ModelDuck : public Duck{
public:
    ModelDuck(){
        flybehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }

    void display(){
        std::cout << "I'm a model duck" << std::endl;
    }
};