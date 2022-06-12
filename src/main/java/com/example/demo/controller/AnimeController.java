package com.example.demo.controller;


import com.example.demo.Util.DateUtil;
import com.example.demo.domain.Anime;
import com.example.demo.service.AnimeService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@ComponentScan("com.example.demo")
@Log4j2
@AllArgsConstructor
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;
    @Autowired
    private AnimeService animeService;

    @GetMapping("list")
    public ResponseEntity<List<Anime>> list() {
        log.info(dateUtil.formateDateTimeDataBase(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<Anime>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    @PostMapping(path = "")
    public ResponseEntity<List<Anime>> save(@RequestBody Anime anime) {
        return new ResponseEntity.created(animeService.save(anime));
    }
}
