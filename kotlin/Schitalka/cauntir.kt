package Schitalka

import java.io.FileInputStream

fun main(args: Array<String>) {
    println("Введи путь к файлеку: ")

    val fileName = readln().trim()

    if(fileName.isBlank()) {
        println("Пусто, пон?")
        return
    }

    try {
        val file = java.io.File(fileName)

        if(!file.exists()) {
            println("Нет файла")
            return
        }

        val lineCount = file.readLines().size
        println("В этом файле: $lineCount строк")
    }catch(e:Exception){
        println("Ащибка")
    }
}