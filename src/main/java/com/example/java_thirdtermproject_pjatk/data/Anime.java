package com.example.java_thirdtermproject_pjatk.data;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Studio> studios = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Genre> genres = new ArrayList<>();

    public Anime(Integer malId, String url, String title, String titleEnglish, String titleJapanese, Integer episodes, String status, String rating, Long rank, String season, Integer year) {
        this.malId = malId;
        this.url = url;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleJapanese = titleJapanese;
        this.episodes = episodes;
        this.status = status;
        this.rating = rating;
        this.rank = rank;
        this.season = season;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id) && Objects.equals(malId, anime.malId) && Objects.equals(url, anime.url) && Objects.equals(title, anime.title) && Objects.equals(titleEnglish, anime.titleEnglish) && Objects.equals(titleJapanese, anime.titleJapanese) && Objects.equals(episodes, anime.episodes) && Objects.equals(status, anime.status) && Objects.equals(rating, anime.rating) && Objects.equals(rank, anime.rank) && Objects.equals(year, anime.year) && Objects.equals(studios, anime.studios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, malId, url, title, titleEnglish, titleJapanese, episodes, status, rating, rank, year, studios);
    }
}
