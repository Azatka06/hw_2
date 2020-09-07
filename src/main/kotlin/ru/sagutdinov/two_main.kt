package ru.sagutdinov

fun main(){
    //View
    val justView=View()
    println(justView.clicked())
    //ViewGroup
    val anotherView=View()
    val groupOfView=ViewGroup(anotherView)
    groupOfView.addView(justView)
    //TextView
    val viewWithText=TextView("Sample Text")
    println(viewWithText.text)
    viewWithText.text="Another Text"
    println(viewWithText.text)
    viewWithText.text=""
    println(viewWithText.text)
    //Button
    val testButton=Button("text")
    println(testButton.clicked())
    println(testButton.text)
    testButton.text="not Text"
    println(testButton.text)
    //test
    groupOfView.storedView.clicked()
    groupOfView.addView(testButton)
    groupOfView.storedView.clicked()
}