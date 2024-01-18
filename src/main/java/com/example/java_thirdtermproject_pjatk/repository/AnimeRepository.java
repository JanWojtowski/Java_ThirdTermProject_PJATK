package com.example.java_thirdtermproject_pjatk.repository;

import com.example.java_thirdtermproject_pjatk.data.Anime;
import com.example.java_thirdtermproject_pjatk.data.Gender;
import com.example.java_thirdtermproject_pjatk.data.Studio;
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
    List<Anime> getAnimeByTitle(String title);

    List<Anime> getAnimeByGenders (List<Gender> genders);

    @Query("select anime.title from Anime anime where anime.malId = :id")
    List<Anime> getAnimeByMalId(@Param("id") int malId);

    @Modifying
    @Transactional
    void deleteAnimeByMalId(Integer malId);

    @Query("SELECT genders FROM Anime where Anime.malId = :id")
    List<Gender> getGendersByMalId(@Param("id") int malId);

    @Query("SELECT studios FROM Anime where Anime.malId = :id")
    List<Studio> getStudiosByMalId(@Param("id") int malId);

}
