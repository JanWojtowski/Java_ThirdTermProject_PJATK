package com.example.java_thirdtermproject_pjatk.repository;

import com.example.java_thirdtermproject_pjatk.data.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Optional<Genre> findGenreByName(String name);

    Optional<Genre> findGenreByType(String type);

    @Query("SELECT anime.genres FROM Anime anime where anime.malId = :malId")
    List<Genre> findGenresByMalId(int malId);
}
