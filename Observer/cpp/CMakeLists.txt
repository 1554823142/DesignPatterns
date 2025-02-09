cmake_minimum_required(VERSION 3.0)

project(Observer)

include_directories(${PROJECT_SOURCE_DIR}/incl)

set(EXECUTABLE_OUTPUT_PATH ${PROJECT_SOURCE_DIR}/bin)

add_executable(main main.cpp weather.cpp condition_display.cpp)
