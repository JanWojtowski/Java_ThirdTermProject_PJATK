package com.example.java_thirdtermproject_pjatk.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private long malId;
    private String name;
    private String type;
    private String url;

    public Gender(long malId, String name, String type, String url) {
        this.malId = malId;
        this.name = name;
        this.type = type;
        this.url = url;
    }
}
