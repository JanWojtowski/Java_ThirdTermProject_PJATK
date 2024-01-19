package com.example.java_thirdtermproject_pjatk.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GenreDto {

    @JsonProperty("mal_id")
    private long malId;
    private String type;
    private String name;
    private String url;
}
