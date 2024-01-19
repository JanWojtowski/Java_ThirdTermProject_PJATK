package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Genre;
import com.example.java_thirdtermproject_pjatk.dtos.GenreDto;
import org.springframework.stereotype.Component;
import com.example.java_thirdtermproject_pjatk.resource.CreateGenre;

@Component
public class GenreMapper {

    public GenreDto toDto(Genre genre){
        return new GenreDto(
                genre.getMalId(),
                genre.getType(),
                genre.getName(),
                genre.getUrl());
    }

    public Genre toEntity(CreateGenre createGenre){
        return new Genre(
                createGenre.getMalId(),
                createGenre.getName(),
                createGenre.getType(),
                createGenre.getUrl());
    }
}
