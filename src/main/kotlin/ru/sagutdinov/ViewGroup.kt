package ru.sagutdinov

class ViewGroup constructor(
    var storedView:View
){
    fun addView(value:View){
        storedView=value
    }
}