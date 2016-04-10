package com.sunshine.www.demo

/**
 * 可以直接用 var 或者 val 关键字将参数声明为成员变量
 * 创建实例的时候，不必使用 new 关键字
 * 用 $ 符号和大括号包裹想要插入的变量
 * @author yang.sun
 * @date 20160404
 */
class Person(var name: String)

fun main(args: Array<String>) {
    val person = Person("Michael")
    println("Hello, ${person.name}!")
}
