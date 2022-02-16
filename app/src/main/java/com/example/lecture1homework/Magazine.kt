package com.example.lecture1homework

class Magazine(override var price: Int, override var wordCount: Int) : Publication {
    override fun getType(): String {
        return "Magazine"
    }
}