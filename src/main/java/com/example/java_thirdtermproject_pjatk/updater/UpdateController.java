package com.example.java_thirdtermproject_pjatk.updater;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/anime")
public class UpdateController {
    private final AnimeUpdater animeUpdater;
    @GetMapping("/update")
    public String run() {
        animeUpdater.updateFirst100();
        return "redirect:/anime/id/1";
    }
}
