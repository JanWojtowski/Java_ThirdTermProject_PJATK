package com.example.java_thirdtermproject_pjatk.controller;

import com.example.java_thirdtermproject_pjatk.Service.StudioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/studio")
public class StudioController {

    private final StudioService studioService;

    @GetMapping("/id/{malId}")
    public ResponseEntity getStudioByMalId(@PathVariable("malId") Integer malId){
        var studios = studioService.getStudiosByMalId(malId);
        return ResponseEntity.ok(studios);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity getStudioByName(@PathVariable("name") String name){
        var studio = studioService.getStudioByName(name);
        return ResponseEntity.ok(studio);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity getStudioByType(@PathVariable("type")String type){
        var studios = studioService.getStudiosByType(type);
        return ResponseEntity.ok(studios);
    }
}