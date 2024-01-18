package com.example.java_thirdtermproject_pjatk.repository;

import com.example.java_thirdtermproject_pjatk.data.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {
    List<Gender> findByName(String name);

    List<Gender> findByType(String type);
}
