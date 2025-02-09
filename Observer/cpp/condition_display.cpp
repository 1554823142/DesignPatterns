#include "condition_display.h"
#include <iostream>

void ConditionDisplay::update(float temperature, float humidity, float pressure)
{
    this->temperature = temperature;
    this->humidity = humidity;
    display();
}

void ConditionDisplay::display()
{
    std::cout << "Current conditions: " << this->temperature <<
            "F degrees and " << this->humidity << "\% humidity" << std::endl;
}