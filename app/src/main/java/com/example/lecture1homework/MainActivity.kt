package com.example.lecture1homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val publicationArray = listOf(Book(100, 1500),Book(100, 1500),Magazine(70, 2000))
        for (publication in publicationArray) {
            var msg = "${publication.getType()}; ${publication.wordCount} words; ${publication.price}€"
            Log.i("MyResult", msg)
        }
        val msgOne = "Are these two Books the same object? "
        val msgTwo = "Are these two Books equivalent? "
        if (publicationArray[0]===publicationArray[1]) {
            Log.i("MyResult", msgOne+"Yes")} else {
            Log.i("MyResult", msgOne+"No")}
        if (publicationArray[0]==publicationArray[1]) {
            Log.i("MyResult", msgTwo+"Yes")} else {
            Log.i("MyResult", msgTwo+"No")}
        val book1: Book? = null
        val book2: Book? = Book(30, 300)
        book1?.let { buy(it) }
        book2?.let { buy(it) }
        var sum = {a:Int,b:Int -> Log.i("MyResult","$a+$b = ${a+b}")}
        sum(3,8)
        val user1 = User(22,"Jack", 35, Type.DEMO )
        Log.i("MyResult", "${user1.name}'s startTime: ${user1.startTime}")
        Thread.sleep(1000)
        Log.i("MyResult", "${user1.name}'s startTime: ${user1.startTime}")
        val userList = mutableListOf(User(2,"John", 19, Type.FULL))
        userList?.apply {
            addAll(listOf(
                User(3, "Mary", 30, Type.FULL),
                User(4, "Sally", 54, Type.FULL),
                User(5, "Bob", 18, Type.DEMO)))
        }
        val fullTypeUserList = mutableListOf<User>()
        val userNames = mutableListOf<String>()
        for (user in userList) {
            if (user.type == Type.FULL) {
                fullTypeUserList.add(user)
                userNames.add(user.name)
            }
        }
        Log.i("MyResult", "First and last users (FULL type): ${userNames[0]} and ${userNames[userNames.size-1]}")
        userList[0].checkIfAdult()
    }


    fun buy(publication: Publication) {
        Log.i("MyResult","The purchase is complete. The purchase amount was ${publication.price}€")
    }

    fun User.checkIfAdult() {
        if (age>=18) {
            Log.i("MyResult","$name is adult")}
        else
            throw Exception("Bad exception: the user is underage")


    }
}
