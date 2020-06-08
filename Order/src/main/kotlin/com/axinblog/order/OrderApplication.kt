package com.axinblog.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class OrderApplication

fun main(args: Array<String>) {
    runApplication<OrderApplication>(*args)
}