package com.example.java_thirdtermproject_pjatk.controller;

import com.example.java_thirdtermproject_pjatk.Service.AnimeService;
import com.example.java_thirdtermproject_pjatk.repository.AnimeRepository;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/anime")
public class AnimeController {

    private final AnimeService animeService;

    @GetMapping("/id/{malId}")
    public ResponseEntity getAnimeByMalId(@PathVariable("malId") Integer malId){
        var anime = animeService.getAnimeByMalId(malId);
        return ResponseEntity.ok(anime);
    }

    @DeleteMapping("/id/{malId}")
    public ResponseEntity deleteAnimeByMalId(@PathVariable("malId") Integer malId){
        animeService.deleteAnimeByMalId(malId);
        return ResponseEntity.ok(malId);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity getAnimeByTitle(@PathVariable("title") String title){
        var anime = animeService.getAnimeByTitle(title);
        return ResponseEntity.ok(anime);
    }

    @PostMapping
    public String addAnimeAndRedirectToMainPage(@ModelAttribute CreateAnime createAnime){
        animeService.createAnime(createAnime);
        return "redirect:/anime";
    }
}
