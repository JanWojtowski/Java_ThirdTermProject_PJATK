package com.example.java_thirdtermproject_pjatk.Service;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.exception.AnimeNotFoundException;
import com.example.java_thirdtermproject_pjatk.mappers.AnimeMapper;
import com.example.java_thirdtermproject_pjatk.repository.AnimeRepository;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;
    private final AnimeMapper animeMapper;

    public Anime createAnime(CreateAnime createAnime){
        var animeToSave = animeMapper.toEntity(createAnime);
        animeToSave.setRank(animeToSave.getRank() + 1);
        animeRepository.save(animeToSave);
        return animeToSave;
    }

    public AnimeDto getAnimeByTitle(String title){
        return animeRepository.getAnimeByTitle(title).map(animeMapper::toDto).orElseThrow(() -> new AnimeNotFoundException("Anime with title " + title + " not found."));
    }

}
