package com.acme.tour.controller

import com.acme.tour.model.SimpleObject
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JsonController {
    @GetMapping("/json")
    fun getJson() = SimpleObject()
}