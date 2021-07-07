package org.springsample.gcp.gcpsampleapp

import com.google.cloud.spring.data.datastore.core.mapping.Entity
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GcpSampleAppApplication

fun main(args: Array<String>) {
    runApplication<GcpSampleAppApplication>(*args)
}

@RestController
class HelloController(
        private val personRepository: PersonRepository
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/hello")
    fun hello(name: String): String {
        log.info("Hello: ${name}")
        personRepository.save(Person(name = name))
        return "Hello ${name}"
    }
}

@RepositoryRestResource
interface PersonRepository : DatastoreRepository<Person, Long>

@Entity
data class Person(
        @Id
        var id: Long? = null,
        var name: String
)