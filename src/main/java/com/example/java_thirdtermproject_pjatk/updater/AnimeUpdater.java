package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.mappers.AnimeMapper;
import com.example.java_thirdtermproject_pjatk.mappers.ICatalogMappers;
import com.example.java_thirdtermproject_pjatk.repository.AnimeRepository;
import com.example.java_thirdtermproject_pjatk.repository.ICatalogData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

@Component
public class AnimeUpdater{
    private final AnimeRepository data;
    private final IJikanClient jikanClient;
    private final AnimeMapper entitiesMapper;

    public AnimeUpdater(AnimeRepository data, IJikanClient jikanClient, AnimeMapper entitiesMapper) {
        this.data = data;
        this.jikanClient = jikanClient;
        this.entitiesMapper = entitiesMapper;
    }

    public void updateFirst100() throws URISyntaxException {
        for(int i = 1; i <= 100; i++){
            var anime = jikanClient.getAnime(i);
            data.save(entitiesMapper.toEntity(anime));
        }

    }

}
