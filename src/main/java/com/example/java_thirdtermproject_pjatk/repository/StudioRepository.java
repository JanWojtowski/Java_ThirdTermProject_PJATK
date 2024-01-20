package com.example.java_thirdtermproject_pjatk.repository;

import com.example.java_thirdtermproject_pjatk.data.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface StudioRepository extends JpaRepository<Studio, Long> {
    Optional<Studio> findStudioByName(String name);

    Optional<Studio> findStudioByType(String type);

    @Query("SELECT anime.studios FROM Anime anime where anime.malId = :malId")
    List<Studio> findStudiosByMalId(int malId);
}
