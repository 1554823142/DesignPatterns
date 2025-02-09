#include "duck.h"
#include "behavior.h"

int main()
{
    Duck* mallard = new MallardDuck(); 
    mallard->performFly();
    mallard->performQuack();

    Duck* model = new ModelDuck();
    model->performFly();
    std::cout << "after equiped with rocket" << std::endl;
    model->setFlyBehavior(new FlyRocketPowered());
    model->performFly();
    return 0;
}