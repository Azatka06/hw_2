package ru.sagutdinov

fun main() {
    val testProfile = Profile(0, "test", "tester", "testerovich", 0, "abc.png")
    println(testProfile.fullName)
    println(testProfile.status)
    println(testProfile.avatar)
    testProfile.status = 3;
    testProfile.avatar = "test.jpg"
    println(testProfile.status)
    println(testProfile.avatar)
    testProfile.status = 2;
    testProfile.avatar = "test.png"
    println(testProfile.status)
    println(testProfile.avatar)
}