package com.example.sevankaev_lab1

class TestClass (private var text: String){
    fun setText(newText: String) {
        text = newText
    }

    // Метод для получения текущего текста
    fun getText(): String {
        return text
    }

    // Метод для получения текущего текста
    fun getUpperText(): String {
        return text
    }

    // Метод для подсчета количества слов в тексте
    fun wordCount(): Int {
        return text.split("\\s+".toRegex()).filter { it.isNotEmpty() }.size
    }

    // Метод для перевода текста в верхний регистр
    fun toUpperCase(): String {
        return text.uppercase()
    }

    // Метод для перевода текста в нижний регистр
    fun toLowerCase(): String {
        return text.lowercase()
    }
}