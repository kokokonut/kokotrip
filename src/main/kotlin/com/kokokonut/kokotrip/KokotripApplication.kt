package com.kokokonut.kokotrip

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KokotripApplication

fun main(args: Array<String>) {
    runApplication<KokotripApplication>(*args)
}
