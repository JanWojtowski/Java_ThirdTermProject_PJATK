package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import org.springframework.stereotype.Component;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;

@Component
public class AnimeMapper {
    public AnimeDto toDto(Anime anime){
        return new AnimeDto(
                anime.getMalId(),
                anime.getUrl(),
                anime.getTitle(),
                anime.getTitleEnglish(),
                anime.getTitleJapanese(),
                anime.getEpisodes(),
                anime.getStatus(),
                anime.getRating(),
                anime.getRank(),
                anime.getSeason(),
                anime.getYear(),
                anime.getStudios(),
                anime.getGenders()
        );
    }

    public Anime toEntity(CreateAnime createAnime){
        return new Anime(
                createAnime.getMalId(),
                createAnime.getUrl(),
                createAnime.getTitle(),
                createAnime.getTitleEnglish(),
                createAnime.getTitleJapanese(),
                createAnime.getEpisodes(),
                createAnime.getStatus(),
                createAnime.getRating(),
                createAnime.getRank(),
                createAnime.getSeason(),
                createAnime.getYear());
    }

}
