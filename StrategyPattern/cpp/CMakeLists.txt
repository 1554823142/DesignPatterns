cmake_minimum_required(VERSION 3.0)

project(Strategy_Pattern)

set(EXECUTABLE_OUTPUT_PATH ${PROJECT_SOURCE_DIR}/bin)

include_directories(${PROJECT_SOURCE_DIR}/incl)

add_executable(main main.cpp)