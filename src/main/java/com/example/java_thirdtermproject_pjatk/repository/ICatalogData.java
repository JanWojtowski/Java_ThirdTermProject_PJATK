package com.example.java_thirdtermproject_pjatk.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
public interface ICatalogData {
    AnimeRepository getAnime();

    GenreRepository getGenre();

    //StudioRepository getStudio();
}
