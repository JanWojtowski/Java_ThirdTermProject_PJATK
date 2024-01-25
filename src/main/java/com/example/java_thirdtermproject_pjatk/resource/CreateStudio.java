package com.example.java_thirdtermproject_pjatk.resource;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudio {
    @Min(1)
    private long malId;
    @NotBlank
    private String name;
    private String type;
    private String url;
}
