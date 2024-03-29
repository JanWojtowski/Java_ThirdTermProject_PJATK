package com.example.java_thirdtermproject_pjatk.mappers;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;

@Component
@RequiredArgsConstructor
public class AnimeMapper {
    private final StudioMapper studioMapper;
    private final GenreMapper genreMapper;

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
                anime.getStudios().stream().map(studioMapper::toDto).toList(),
                anime.getGenres().stream().map(genreMapper::toDto).toList()
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

    public Anime toEntity(AnimeDto animeDto){
        return new Anime(
                animeDto.getMalId(),
                animeDto.getUrl(),
                animeDto.getTitle(),
                animeDto.getTitleEnglish(),
                animeDto.getTitleJapanese(),
                animeDto.getEpisodes(),
                animeDto.getStatus(),
                animeDto.getRating(),
                animeDto.getRank(),
                animeDto.getSeason(),
                animeDto.getYear());

    }
}
