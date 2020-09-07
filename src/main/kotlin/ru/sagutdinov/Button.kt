package ru.sagutdinov

class Button(text:String):TextView(text){
    override fun clicked(){
        println(text)
    }
}