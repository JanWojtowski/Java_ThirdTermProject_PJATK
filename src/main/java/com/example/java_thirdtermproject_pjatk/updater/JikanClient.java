package com.example.java_thirdtermproject_pjatk.updater;

import com.example.java_thirdtermproject_pjatk.dtos.AnimeDto;
import com.example.java_thirdtermproject_pjatk.resource.CreateAnime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class JikanClient implements IJikanClient{

    RestTemplate restClient;
    @Value("https://api.jikan.moe/v4")
    String baseUrl;

    public CreateAnime getAnime(int id) throws URISyntaxException {
        var url = baseUrl + "/anime/" + id;
        var anime = restClient.getForEntity(new URI(url),CreateAnime.class).getBody();
        System.out.println(anime);
        return anime;
    }


}
