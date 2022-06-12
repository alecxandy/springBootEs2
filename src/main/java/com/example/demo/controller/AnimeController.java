package com.example.demo.controller;


import com.example.demo.domain.Anime;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
@ComponentScan("com.example.demo")
public class AnimeController {


    @GetMapping(path = "list")
    public List<Anime> list() {
        return List.of(new Anime("Drogon Ball Z"), new Anime("Naruto"));
    }
}
