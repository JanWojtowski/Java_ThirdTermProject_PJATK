package com.example.java_thirdtermproject_pjatk.resource;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAnime {      //Dodaj walidacje min/max do rank
    @Min(1)
    private Integer malId;
    @NotBlank
    private String url;
    @NotBlank
    private String title;
    private String titleEnglish;
    private String titleJapanese;
    private Integer episodes;
    private String status;
    private String rating;
    private Long rank;
    private String season;
    private Integer year;
}
