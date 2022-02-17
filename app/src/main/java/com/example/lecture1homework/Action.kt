package com.example.lecture1homework

sealed class Action {
    class Registration(): Action()
    class Login(val user: User): Action()
    class Logout(): Action()
}


