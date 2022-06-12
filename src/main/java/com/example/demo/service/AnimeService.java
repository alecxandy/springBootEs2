package com.example.demo.service;

import com.example.demo.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {

    private final List<Anime> animeList = List.of(new Anime(1L, "Drogon Ball Z"), new Anime(2L, "Naruto"));


    public List<Anime> listAll() {
        return animeList;
    }

    public List<Anime> findById(Long id) {
        return animeList;
    }

    public List<Anime> save(Anime anime) {
        animeList.add(anime);
        return animeList;
    }
}
