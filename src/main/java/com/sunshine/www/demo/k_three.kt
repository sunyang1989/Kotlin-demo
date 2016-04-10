package com.sunshine.www.demo

/**
 * 枚举
 * @author yang.sun
 * @date 20160404
 */
enum class Language(val greeting: String) {
    EN("Hello"), ES("Hola"), FR("Bonjour");
}

class PersonTwo(var name: String, var lang: Language = Language.EN){
    fun greet() = println("${lang.greeting}, $name!");
}

fun main(args: Array<String>) {
    val person = PersonTwo("Michael", Language.ES);
    person.greet();

    // listOf 方法创建一个 person 列表
    val people = listOf<PersonTwo>(
            PersonTwo("one",Language.FR),
            PersonTwo("two", Language.EN),
            PersonTwo("three", Language.ES));
    // 遍历这些 person 可以用 for-in 关键字
    for(per in people){
        per.greet();
    }

    //直接调用 people 集合的扩展方法 forEach，传入一个 lambda 表达式，
    //在表达式里用 it 代表每次遍历到的 person 对象
    people.forEach { it.greet() }

}


