package org.springsample.gcp.gcpsampleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GcpSampleAppApplication

fun main(args: Array<String>) {
	runApplication<GcpSampleAppApplication>(*args)
}
