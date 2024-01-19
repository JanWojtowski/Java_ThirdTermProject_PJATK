package com.example.java_thirdtermproject_pjatk.repository;

public interface ICatalogData {
    AnimeRepository getAnimes();

    GenreRepository getGenres();

    StudioRepository getStudios();
}
