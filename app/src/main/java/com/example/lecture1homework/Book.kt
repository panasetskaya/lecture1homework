package com.example.lecture1homework

class Book(override var price: Int = 0, override var wordCount: Int = 0) : Publication {

    override fun getType(): String {
        when (wordCount) {
            in 0..1000 -> return("Flash Fiction")
            in 1000..7500 -> return("Short Story")
            else -> return("Novel")
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other is Book) { return other.wordCount == this.wordCount && other.price == this.price }
        else return false
    }
}