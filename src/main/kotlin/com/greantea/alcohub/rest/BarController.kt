package com.greantea.alcohub.rest

import com.greantea.alcohub.domain.Bar
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/bars")
class BarController {

    @GetMapping("/{id}")
    fun getBar(@PathVariable("id") id: String): Bar {
        return Bar("Bar 108")
    }

    @GetMapping
    fun getBarList(): List<Bar> {
        return listOf(Bar("Bar 108"), Bar("Another Bar"))
    }

    @PutMapping("/{id}")
    fun updateBar(@PathVariable("id") id: String,
                  @RequestBody bar: Bar): Bar {
        return bar
    }

    @DeleteMapping("/{id}")
    fun deleteBar(@PathVariable("id") id: String) {

    }
}