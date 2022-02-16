package com.example.lecture1homework

import java.util.*

data class User(
    val id: Int,
    var name: String,
    var age: Int,
    var type: Type
) {
    val startTime: String by lazy {
        "${Calendar.getInstance().time}"
    }
}
