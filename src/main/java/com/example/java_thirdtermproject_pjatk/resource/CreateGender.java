package com.example.java_thirdtermproject_pjatk.resource;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateGender {
    @NotBlank
    private long malId;
    private String name;
    private String type;
    private String url;
}
