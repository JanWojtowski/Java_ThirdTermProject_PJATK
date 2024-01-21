package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;

import java.net.URISyntaxException;

public interface IJikanClient {
    AnimeDto getAnime(int id) throws URISyntaxException;
}
