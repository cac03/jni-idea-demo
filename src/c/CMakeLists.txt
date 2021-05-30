cmake_minimum_required(VERSION 3.13)

project(jnitests)

find_package(JNI MODULE REQUIRED)

message("Jni found in ${JNI_INCLUDE_DIRS}")
include_directories("${JNI_INCLUDE_DIRS}")

set(CMAKE_POSITION_INDEPENDENT_CODE ON)
set(SOURCE_FILES ru_hse_jnidemo_Native.c)

add_library(jnitests SHARED ${SOURCE_FILES})
