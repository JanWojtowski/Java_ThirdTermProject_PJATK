package com.example.java_thirdtermproject_pjatk.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long malId;
    private String type;
    private String name;
    private String url;

    public Studio(long malId, String type, String name, String url) {
        this.malId = malId;
        this.type = type;
        this.name = name;
        this.url = url;
    }
}
