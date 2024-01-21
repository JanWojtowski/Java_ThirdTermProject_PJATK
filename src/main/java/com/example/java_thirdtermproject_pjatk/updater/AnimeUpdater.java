package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.mappers.AnimeMapper;
import com.example.java_thirdtermproject_pjatk.repository.AnimeRepository;
import org.springframework.stereotype.Component;

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

    public void updateFirst100() {
        for(int i = 1; i <= 202; i++){
            try {
                var anime = jikanClient.getAnime(i);
                data.save(entitiesMapper.toEntity(anime));
            }
            catch (Exception e){
                e.printStackTrace();
                continue;
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

}
