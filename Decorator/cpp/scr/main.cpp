#include "beverage.h"
#include "coffee.h"
#include <iostream>

void Print(Beverage* beverage)
{
    std::cout << beverage->getDescription() << " $" << beverage->cost() <<std::endl;
}

int main()
{
    // 先创建一个不加任何调料的饮料Espresso
    Beverage* beverage = new Espresso();
    Print(beverage);

    // 加两份Mocha 和一份 Whip的DarkRoast
    Beverage* beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    Print(beverage2);

    // 调料为一份Soy Mocha和Whip的HouseBlend
    Beverage* beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    Print(beverage3);

    return 0;
}