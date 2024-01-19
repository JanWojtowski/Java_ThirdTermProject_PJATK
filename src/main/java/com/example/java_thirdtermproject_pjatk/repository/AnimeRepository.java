package com.example.java_thirdtermproject_pjatk.repository;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.data.Genre;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimeRepository extends JpaRepository<Anime,Long> {
    Optional<Anime> findAnimeByTitle(String title);

    @Query("select anime from Anime anime where :genders member of anime.genres")     //z
    List<Anime> findAnimesByGender (List<Genre> genres);

    @Query("select anime from Anime anime where anime.malId = :id")
    Optional<Anime> findAnimeByMalId(@Param("id") int malId);

    @Modifying
    @Transactional
    void deleteAnimeByMalId(Integer malId);

}
