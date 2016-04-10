package com.sunshine.www.demo

/**
 * 声明函数的关键字是 fun，fun 后面跟的是函数的名称，然后括号包裹起来的是函数参数
 * 参数名放在前面，参数类型放在后面，用一个冒号隔开。函数的返回类型在最后
 * 如果一个函数没有返回任何类型，可以返回一个 Unit 类型，当然也可以省略
 * var 关键字后跟的是变量的名称
 * 字符串内插入变量，只用在字符串内用 $ 符号开头，随后跟上输出变量的变量名即可
 * val 类型的声明 常量
 * @author yang.sun
 * @date 20160404
 */
fun main(args: Array<String>): Unit {
    val name = if (args.isNotEmpty()) args[0] else "World"
    println("Hello, $name!")
}