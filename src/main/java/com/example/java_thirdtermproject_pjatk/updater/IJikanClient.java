package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;

import java.net.URISyntaxException;

public interface IJikanClient {
    CreateAnime getAnime(int id) throws URISyntaxException;
}
