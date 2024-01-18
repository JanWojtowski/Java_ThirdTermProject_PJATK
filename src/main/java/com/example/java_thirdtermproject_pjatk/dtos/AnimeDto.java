package com.example.java_thirdtermproject_pjatk.dtos;

import com.example.java_thirdtermproject_pjatk.data.Gender;
import com.example.java_thirdtermproject_pjatk.data.Studio;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class AnimeDto {

    @JsonProperty("mal_id")
    private Integer malId;
    private String url;
    private String title;
    private String titleEnglish;
    private String titleJapanese;
    private Integer episodes;
    private String status;
    private String rating;
    private Long rank;
    private String season;
    private Integer year;

    private List<Studio> studios;

    private List<Gender> genders;
}
