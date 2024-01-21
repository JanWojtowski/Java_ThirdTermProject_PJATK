package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.dtos.PageResultDto;
import com.example.java_thirdtermproject_pjatk.exception.AnimeNotFoundException;
import com.example.java_thirdtermproject_pjatk.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@Component
public class JikanClient implements IJikanClient{

    private final RestTemplate restClient;

    public JikanClient() {
        this.restClient = new RestTemplate();
    }

    public AnimeDto getAnime(int id) {
        try {
            String url = UriComponentsBuilder.
                    fromUriString("https://api.jikan.moe/v4").
                    pathSegment("anime/" + id).build().toUriString();
            var pageResultDto = restClient.getForEntity(new URI(url), PageResultDto.class).getBody();
            if (pageResultDto != null) {
                return new AnimeDto(
                        pageResultDto.getData().getMalId(),
                        pageResultDto.getData().getUrl(),
                        pageResultDto.getData().getTitle(),
                        pageResultDto.getData().getTitleEnglish(),
                        pageResultDto.getData().getTitleJapanese(),
                        pageResultDto.getData().getEpisodes(),
                        pageResultDto.getData().getStatus(),
                        pageResultDto.getData().getRating(),
                        pageResultDto.getData().getRank(),
                        pageResultDto.getData().getSeason(),
                        pageResultDto.getData().getYear(),
                        pageResultDto.getData().getStudios(),
                        pageResultDto.getData().getGenders()
                );
            }
            else{
                throw new ResourceNotFoundException("No Resource found");
            }
        }
        catch (Exception e){
            throw new AnimeNotFoundException("Anime not found");
        }
    }


}
