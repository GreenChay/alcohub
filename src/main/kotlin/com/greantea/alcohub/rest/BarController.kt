package com.greantea.alcohub.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BarController {

    @GetMapping
    fun getBar(): String {
        return "Response"
    }
}