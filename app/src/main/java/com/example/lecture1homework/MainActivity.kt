package com.example.lecture1homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
    }


    fun buy(publication: Publication) {
        Log.i("MyResult","The purchase is complete. The purchase amount was ${publication.price}€")
    }
}