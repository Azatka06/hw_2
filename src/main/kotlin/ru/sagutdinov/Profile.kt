package ru.sagutdinov

class Profile constructor(
    val id: Int,
    val login: String,
    private val lastname: String,
    private val firstname: String,
    status: Int,
    avatar: String //path
) {
    var avatar: String = avatar
        get
        set(value) {
            if (value.contains(".png")) {
                field = value
            }
        }
    var status: Int = status
        get
        set(value) {
            if (value in 0..2) {
                field = value
            }
        }
    val fullName: String
        get()="$lastname $firstname"
}