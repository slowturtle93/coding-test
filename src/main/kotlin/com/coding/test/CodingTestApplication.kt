package com.coding.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.TimeZone
import javax.annotation.PostConstruct

@SpringBootApplication
class CodingTestApplication {
}

fun main(args: Array<String>) {
    runApplication<CodingTestApplication>(*args)
}
