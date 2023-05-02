package com.udemy.objectorientedprogramming

import android.os.Build
import androidx.annotation.RequiresApi
import java.sql.Time
import java.time.LocalDateTime
import java.time.LocalTime


fun main() {
    //CREATING OBJECT FROM CLASS HERE
//    var myCar = Cars()
//    myCar.name = "Punch"
//    myCar.model = 2022
//
//    println("my car name is ${myCar.name} and its model is ${myCar.model}")

    //CREATING PRIMARY CONSTRUCTOR AND INIT BLOCK
//var myNewCar = Mycars("Thar",2022)
//    println("My New car name is ${myNewCar.name} and Model is ${myNewCar.model}")

    var myScondCar = MySecodCar("Fortuner",2019)
    println("my second car name is ${myScondCar.name} and model is ${myScondCar.model} ")

}