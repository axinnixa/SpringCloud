package com.axinblog.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ProductApplication

fun main(args: Array<String>) {
    runApplication<ProductApplication>(*args)
}