package tech.takenoko.kt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtApplication

fun main(args: Array<String>) {
    runApplication<KtApplication>(*args)
}
