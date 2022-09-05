package net.proxyrouter.ktlogger

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Logger {

    private var currentTime: String = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now())

    var colorCyan = "\\033[36m"
    var colorGreen = "\\033[32m"
    var colorYellow = "\\033[33m"
    var colorRed = "\\033[31m"
    var colorReset = "\\033[0m"

    fun debug(text: String) {
        println("[$currentTime] $colorCyan[DEBUG]$colorReset: $text")
    }

    fun info(text: String) {
        println("[$currentTime] $colorGreen[INFO]$colorReset: $text")
    }

    fun warn(text: String) {
        println("[$currentTime] $colorYellow[WARN]$colorReset: $text")
    }

    fun error(text: String) {
        println("[$currentTime] $colorRed[ERROR]$colorReset: $text")
    }
}