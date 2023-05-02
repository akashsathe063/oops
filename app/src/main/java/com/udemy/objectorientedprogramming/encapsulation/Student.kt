package com.udemy.objectorientedprogramming.encapsulation

class Student {
    private var name: String? = null
    var age: Int? = null
        private set
                get

    constructor(age:Int){
        this.age = age
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String? {
        return this.name
    }
//    fun setAge(age:Int){
//        this.age = age
//    }
//    fun getAge():Int?{
//        return this.age
//    }
}

fun main() {
    var student = Student(25)
    student.setName("Akash")
    student.age = 26

    println("my name is ${student.getName()} and age is ${student.age}")

}