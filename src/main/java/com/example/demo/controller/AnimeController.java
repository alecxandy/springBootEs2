package com.example.demo.controller;


import com.example.demo.Util.DateUtil;
import com.example.demo.domain.Anime;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@ComponentScan("com.example.demo")
@Log4j2
@AllArgsConstructor
public class AnimeController {


    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formateDateTimeDataBase(LocalDateTime.now()));
        return List.of(new Anime("Drogon Ball Z"), new Anime("Naruto"));
    }
}
