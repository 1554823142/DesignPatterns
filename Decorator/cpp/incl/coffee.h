#include "beverage.h"

// 定义coffee
class DarkRoast : public Beverage{
public:
    DarkRoast(){
        description = "Dark Roast Coffee";
    }

    double cost(){
        return 0.99;
    }
};

class Espresso : public Beverage {
public:
    Espresso(){
        description = "Espresso";
    }

    double cost(){   // 实现基类定义的抽象方法
        return 1.99;
    }
};

class HouseBlend : public Beverage {
public:
    HouseBlend(){
        description = "House Blend Coffee";
    }

    double cost(){   // 实现基类定义的抽象方法
        return 0.89;
    }
};