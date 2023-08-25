package com.example.first.webController

import Proyecto
import com.example.first.planetScale.PlanetScale
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.ResultSet

@RestController
@CrossOrigin(origins = ["http://localhost:58707/","http://192.168.1.163:5500/"],)
@RequestMapping("/cosas")
class WebController {
    @GetMapping("/Tables")
    fun getAll(): MutableList<Proyecto> {
        return PlanetScale().showTables(PlanetScale().connect())
    }
}