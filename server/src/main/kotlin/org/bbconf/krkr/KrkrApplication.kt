package org.bbconf.krkr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KrkrApplication

fun main(args: Array<String>) {
    runApplication<KrkrApplication>(*args)
}
