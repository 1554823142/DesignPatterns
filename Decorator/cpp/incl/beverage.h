#pragma once
#include <string>

class Beverage{
protected:
    std::string description = "Unkown beverage";
public:
    std::string getDescription(){
        return description;
    }

    virtual double cost() = 0;
};

// 定义调料抽象类
class CondimentDecorator : public Beverage{
public:
    virtual std::string getDescription() = 0;       // 必须由子类实现
};

// 定义调料组件: concrete decorator

class Mocha : public CondimentDecorator {
private:
    Beverage* beverage;     // 记录被装饰者
public:
    Mocha(Beverage* beverage): beverage(beverage) {
        description = beverage->getDescription() + ", Mocha";
    }

    std::string getDescription(){
        return description;
    }

    double cost(){
        return beverage->cost() + 0.20;
    }
};

class Soy : public CondimentDecorator {
private:
    Beverage* beverage;     // 记录被装饰者
public:
    Soy(Beverage* beverage): beverage(beverage) { 
        description = beverage->getDescription() + ", Soy";
    }

    std::string getDescription(){
        return description;
    }

    double cost(){
        return beverage->cost() + 0.15;
    }
};

class Whip : public CondimentDecorator {
private:
    Beverage* beverage;     // 记录被装饰者
public:
    Whip(Beverage* beverage): beverage(beverage) {
        description = beverage->getDescription() + ", Whip";
     }

    std::string getDescription(){
        return description;
    }

    double cost(){
        return beverage->cost() + 0.1;
    }
};
