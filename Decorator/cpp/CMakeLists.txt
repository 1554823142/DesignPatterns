cmake_minimum_required(VERSION 3.0)

project(Decorator)

include_directories(${CMAKE_SOURCE_DIR}/incl)

set(SRC ${CMAKE_SOURCE_DIR}/scr)

set(EXECUTABLE_OUTPUT_PATH ${PROJECT_SOURCE_DIR}/bin)

add_executable(main ${SRC}/main.cpp)
