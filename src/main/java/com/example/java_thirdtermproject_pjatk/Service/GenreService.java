package com.example.java_thirdtermproject_pjatk.Service;

import com.example.java_thirdtermproject_pjatk.dtos.GenreDto;
import com.example.java_thirdtermproject_pjatk.exception.GenreNotFoundException;
import com.example.java_thirdtermproject_pjatk.mappers.GenreMapper;
import com.example.java_thirdtermproject_pjatk.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;
    private final GenreMapper genreMapper;

    public GenreDto getGenreByName(String name){
        return genreRepository.findGenreByName(name).map(genreMapper::toDto)
                .orElseThrow(() -> new GenreNotFoundException("Genre with name " + name + " not found."));
    }

    public List<GenreDto> getGenreByType(String type){
        return genreRepository.findGenreByType(type).stream().map(genreMapper::toDto).toList();
    }

    public List<GenreDto> getGenresByMalId(Integer malId){
        return genreRepository.findGenresByMalId(malId).stream().map(genreMapper::toDto).toList();
    }
}
