package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.data.Genre;
import com.example.java_thirdtermproject_pjatk.data.Studio;
import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.dtos.GenreDto;
import com.example.java_thirdtermproject_pjatk.dtos.StudioDto;
import org.springframework.stereotype.Component;

@Component
public interface ICatalogMappers {
    IMapEntities<AnimeDto, Anime> forAnime();
    IMapEntities<GenreDto, Genre> forGenre();
    IMapEntities<StudioDto, Studio> forStudio();
 }
