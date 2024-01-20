package com.example.java_thirdtermproject_pjatk.controller;

import com.example.java_thirdtermproject_pjatk.Service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/genre")
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/id/{malId}")
    public ResponseEntity getGenreByMalId(@PathVariable("malId") Integer malId){
        var genre = genreService.getGenresByMalId(malId);
        return ResponseEntity.ok(genre);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity getGenreByName(@PathVariable("name") String name){
        var genre = genreService.getGenreByName(name);
        return ResponseEntity.ok(genre);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity getGenreByType(@PathVariable("type")String type){
        var genres = genreService.getGenreByType(type);
        return ResponseEntity.ok(genres);
    }
}
