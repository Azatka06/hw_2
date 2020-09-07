package ru.sagutdinov

open class TextView(text:String) : View(){
    var text:String=text
    get
    set(value){
        if(value!=""){
            field=value
        }else{
            field="'empty'"
        }
    }
}