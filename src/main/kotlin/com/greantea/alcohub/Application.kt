package com.greantea.alcohub

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

//@EnableRedisRepositories
@SpringBootApplication
@EnableAutoConfiguration
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
