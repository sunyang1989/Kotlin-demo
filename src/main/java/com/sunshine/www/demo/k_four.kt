package com.sunshine.www.demo

/**
 * 集成
 * @author yang.sun
 * @date 20160404
 */
enum class Lang(val greeting:String){
    EN("Hello"), ES("Hola"), FR("Bonjour")
}

open class PersonThree(var name: String, var lang: Lang = Lang.EN) {
    fun greet() = println("${lang.greeting}, $name!")
}

class Hispanophone(name: String) : PersonThree(name, Lang.ES)

class Francophone(name: String) : PersonThree(name, Lang.FR)

fun main(args: Array<String>) {
    listOf(
            PersonThree("Michael"),
            Hispanophone("Miguel"),
            Francophone("Michelle")
    ).forEach { it.greet() }
}