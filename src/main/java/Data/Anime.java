package Data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToMany(mappedBy = "studio", cascade = CascadeType.ALL)
    private List<Studio> Studios = new ArrayList<>();

    @ManyToMany(mappedBy = "genders", cascade = CascadeType.ALL)
    private List<Gender> Genders = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id) && Objects.equals(malId, anime.malId) && Objects.equals(url, anime.url) && Objects.equals(title, anime.title) && Objects.equals(titleEnglish, anime.titleEnglish) && Objects.equals(titleJapanese, anime.titleJapanese) && Objects.equals(episodes, anime.episodes) && Objects.equals(status, anime.status) && Objects.equals(rating, anime.rating) && Objects.equals(rank, anime.rank) && Objects.equals(year, anime.year) && Objects.equals(Studios, anime.Studios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, malId, url, title, titleEnglish, titleJapanese, episodes, status, rating, rank, year, Studios);
    }
}
