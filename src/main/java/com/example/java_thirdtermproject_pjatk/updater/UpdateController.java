package com.example.java_thirdtermproject_pjatk.updater;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URISyntaxException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/anime")
public class UpdateController {
    AnimeUpdater animeUpdater;
    @GetMapping("/update")
    public void run() throws URISyntaxException {
        animeUpdater.updateFirst100();
    }
}
